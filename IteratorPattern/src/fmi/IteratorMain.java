package fmi;

public class IteratorMain {

	public static void main(String[] args) {

		NameRepository nameRepo = new NameRepository();
		
		for(Iterator iter = nameRepo.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Current: " + name);
		}

	}

}
