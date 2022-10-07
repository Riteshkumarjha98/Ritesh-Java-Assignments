class Todo {
    #list;
    #target;
    #callback;
    #baseUrl;
    constructor(target, baseUrl) {
      this.#list = [];
      this.#target = target;
      this.#callback = null;
      this.getItems();
      this.#baseUrl = baseUrl;
    }
    get list() {
      return this.#list;
    }
    get target() {
      return this.#target;
    }
    addItem(text) {
      const item = {
        title: text,
        status: false,
      };
      fetch("https://json-server-mocker-masai.herokuapp.com/tasks", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(item),
      }).then((res) => {
        this.getItems();
      });
    }
    getItems() {
      fetch("https://json-server-mocker-masai.herokuapp.com/tasks")
        .then((res) => res.json())
        .then((res) => {
          this.#list = res;
          // renderDom(this.#list, this.#target);
          this.handleUpdate();
        });
    }
    onUpdate(callback) {
      this.#callback = callback;
    }
    handleUpdate() {
      this.#callback && this.#callback(this.#list);
    }
    handleDelete(id) {
      fetch("https://json-server-mocker-masai.herokuapp.com/tasks/" + id, {
        method: "DELETE",
      }).then((res) => {
        this.getItems();
      });
    }
    handleToggleStatus(id, newStatus) {
      fetch("https://json-server-mocker-masai.herokuapp.com/tasks/" + id, {
        method: "PATCH",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          status: newStatus,
        }),
      }).then((res) => {
        this.getItems();
      });
    }
  }
  
  const todoObject = new Todo(document.getElementById("task-list"));
  
  todoObject.onUpdate((list) => {
    renderDom(list, todoObject.target);
  });
  
  function renderDom(data, target) {
    const todoContainers = data.map((item) => createCard(item));
    console.log(todoContainers);
    target.innerHTML = null;
    target.append(...todoContainers);
  }
  
  function createCard(todo) {
    const div = document.createElement("div");
    const h3 = document.createElement("h3");
    h3.textContent = todo.title;
    const btn = document.createElement("button");
    btn.textContent = todo.status ? "COMPLETED" : "PENDING";
    btn.addEventListener("click", () => {
      btn.disabled = true;
      todoObject.handleToggleStatus(todo.id, !todo.status);
    });
    const delBtn = document.createElement("button");
    delBtn.textContent = "delete";
    delBtn.addEventListener("click", () => {
      delBtn.disabled = true;
      todoObject.handleDelete(todo.id);
    });
    div.append(h3, btn, delBtn);
    return div;
  }
  
  window.addEventListener("load", () => {
    const addBtn = document.getElementById("task-add-btn");
    addBtn.addEventListener("click", () => {
      const input = document.getElementById("task-input").value;
      todoObject.addItem(input);
    });
  });