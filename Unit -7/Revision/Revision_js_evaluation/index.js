
const url=`https://dbioz2ek0e.execute-api.ap-south-1.amazonaws.com/mockapi/get-products`;

fetch(url)
.then(function (res){
    return res.json();
})

.then(function (res){
    console.log(res);
    data=res.data;
    append(data);
})

.catch(function (err){
    console.log(err);
});

let cartData = JSON.parse(localStorage.getItem("products")) || [];
document.getElementById("product_count").innerText=cartData.length||0;
function append(data){
    data.forEach(function (elem){
        let div = document.createElement("div");

        let brand = document.createElement("h4");
        brand.textContent = elem.brand;

        let title = document.createElement("h2");
        title.textContent = elem.title;
        let img = document.createElement("img");
        img.src=elem.image;

        let category= document.createElement("p");
        category.innerText=elem.category;

        let price= document.createElement("h5");
        price.innerText=elem.price;

        let btn = document.createElement("button");
        btn.innerText = "Add to Cart";
        btn.id="add_to_cart";

        let btn_wish = document.createElement("button");
        btn_wish.innerText = "Add To Wishlist";
        btn.id="wish_list";
       
        btn.addEventListener("click", function () {
          addToCart(elem);
        });
        
        div.append(title,brand,img,category,price,btn,btn_wish);
        document.getElementById("products").append(div);

    });
    
    function addToCart(elem) {

       cartData.push(elem);
        localStorage.setItem("products", JSON.stringify(cartData));
        window.location.reload();
      }

//   Sorting


let value=document.querySelector("#sortby").addEventListener("change",sortbyprice);
function sortbyprice()
{
    let sort=document.querySelector("#sortby").value
    //  console.log(sort)
    if(sort=="hrl")
    {
        //  console.log(sort)
     cartData.sort(function(a,b){
        return b.price - a.price;
    })
//   console.log(cartData) 
    sortbyfn(cartData)
    }
    if(sort=="lrh")
    {
        cartData.sort(function(a,b){
            return a.price - b.price
        })
        sortbyfn(cartData);
    }
}



};