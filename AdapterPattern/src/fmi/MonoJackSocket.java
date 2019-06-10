package fmi;

public class MonoJackSocket implements MonoJack {

	@Override
	public void playMonoSound(String sound) {
		System.out.println("Playing monosound: " + sound);
	}

}
