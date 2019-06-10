package fmi;

public class StereoJackPlug implements StereoJack {

	@Override
	public void playStereoSound(String sound) {
		System.out.println("Playing stereo: " + sound);
	}

}
