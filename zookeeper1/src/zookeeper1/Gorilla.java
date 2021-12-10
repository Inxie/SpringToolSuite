package zookeeper1;

public class Gorilla extends Mammal {
	private int throwSomething;
	private int eatBananas;
	private int climb;
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		energyLevel -= 5;
	}

	public void eatBananas() {
		System.out.println("The gorilla has eaten a banana. Yum!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		energyLevel -= 10;
	}
}
