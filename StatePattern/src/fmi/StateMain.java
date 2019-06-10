package fmi;

public class StateMain {

	public static void main(String[] args) {

		Context player = new Context();
		
		StartState startState = new StartState();
		StopState stopState = new StopState();
		
		startState.executeAction(player);
		stopState.executeAction(player);

	}

}
