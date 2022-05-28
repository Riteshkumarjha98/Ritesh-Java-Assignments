package com.p4;

public class Main {

	public static void main(String[] args) {
		
		
		Animal[] animalArr= new Animal[3];
		animalArr[0] = new Dog();
		animalArr[1] =new Cat();
		animalArr[2]=new Tiger();
		
		for (Animal i : animalArr) {
			i.makeNoise();
			i.eat();
			i.walk();
		

	}

}
}