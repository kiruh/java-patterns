package fmi;

public class StopState implements State {

	@Override
	public void executeAction(Context context) {
		System.out.println("Setting context to: "
				+ this.toString());
		context.setState(this);
	}
	
	public String toString() {
		return "STOP_STATE";
	}

}
