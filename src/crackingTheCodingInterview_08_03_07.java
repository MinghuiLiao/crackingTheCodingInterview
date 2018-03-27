import java.util.LinkedList;

//An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" basis. 
//People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, 
//or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). 
//They cannot select which specific animal they would like. 
//Create the data structures to maintain this system and implement operations 
//such as enqueue, dequeueAny, dequeueDog and dequeueCat. 
//You may use the built-in LinkedList data structure.

public class crackingTheCodingInterview_08_03_07 {
	public class Animal {
		String name;
		int order;
		
		public int getOrder() {
			return order;
		}
		
		public void setOrder(int order) {
			this.order = order;
		}
		
		public Animal(String name) {
			this.name = name;
		}	
		
		public boolean isOlderThan(Animal a) {
			return this.order < a.getOrder();
		}
	}
	
	public class Dog extends Animal {
		public Dog(String name) {
			super(name);
		}
	}
	
	public class Cat extends Animal {
		public Cat(String name) {
			super(name);
		}
	}
	
	public class adoptAnimalQueue {
		LinkedList<Dog> dogs = new LinkedList<Dog>();
		LinkedList<Cat> cats = new LinkedList<Cat>();
		int order = 0;
		
		public void enqueue(Animal a) {
			a.setOrder(order);
			order++;
			
			if (a instanceof Dog){
				dogs.addLast((Dog) a);
			} else if (a instanceof Cat) {
				cats.addLast((Cat) a);
			}			
		}
		
		public Dog dequeueDogs() {
			return dogs.poll();
		}
		
		public Cat dequeueCats() {
			return cats.poll();
		}
		public Animal dequeueAny() {
			if (dogs.size() == 0) {
				return dequeueCats();
			} else if (cats.size() == 0) {
				return dequeueDogs();
			}
			
			Dog dog = dogs.peek();
			Cat cat = cats.peek(); 
			if (dog.isOlderThan(cat)) {
				return dequeueDogs();
			} else {
				return dequeueCats();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
