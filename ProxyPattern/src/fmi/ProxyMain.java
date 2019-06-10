package fmi;

public class ProxyMain {

	public static void main(String[] args) {

		Sound sound = new ProxySound("sound_check.mp3");
		sound.play();
		sound.play();
	}

}
