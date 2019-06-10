package fmi;

public class StartState implements State {

	@Override
	public void executeAction(Context context) {
		System.out.println("Setting context to: "
				+ this.toString());
		
		context.setState(this);
	}

	public String toString() {
		return "START_STATE";
	}
}
