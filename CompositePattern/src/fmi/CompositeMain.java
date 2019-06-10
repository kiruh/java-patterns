package fmi;

public class CompositeMain {

	public static void main(String[] args) {

		Developer dev1 = new Developer("Stoian", 1000);
		Developer dev2 = new Developer("Stamat", 2000);
		
		Manager man1 = new Manager("Georgi", 2500);
		
		man1.add(dev1);
		man1.add(dev2);
		
		Developer dev3 = new Developer("Peter", 3000);
		
		Manager man2 = new Manager("Ivan", 4000);
		
		man2.add(dev3);
		man2.add(man1);
		
		man2.print();

	}

}
