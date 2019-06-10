package fmi;

public class Light {

	public boolean on;
	
	public void switchOn() {
		System.out.println("Light on");
		this.on = true;
	}
	
	public void switchOff() {
		System.out.println("Light off");
		this.on = false;
	}
}
