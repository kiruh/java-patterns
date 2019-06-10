package fmi;

public class AdapterMain {

	public static void main(String[] args) {

		StereoJack jack = new StereoJackPlug();
		jack.playStereoSound("new.mp3");

		jack = new MonoToStereoAdapter(new MonoJackSocket());
		jack.playStereoSound("test.mp3");
		
	}

}
