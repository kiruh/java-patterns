package fmi;

public class Developer implements Employee {

	private String name;
	private double salary;
	
	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// Leaf node cannot add
	}

	@Override
	public void remove(Employee employee) {
		// Leaf node cannot remove
	}

	@Override
	public Employee getChild(int i) {
		// // Leaf node cannot getChild
		return null;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public void print() {
		System.out.println("==============");
		System.out.println("      > " + this.getName());
		System.out.println("      > " + this.getSalary());
		System.out.println("==============");
	}

}
