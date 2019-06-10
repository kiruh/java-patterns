package fmi;

public class MonoToStereoAdapter implements StereoJack {

	private MonoJack socket;
	
	public MonoToStereoAdapter(MonoJackSocket socket) {
		this.socket = socket;
	}

	@Override
	public void playStereoSound(String sound) {
		System.out.println("Playing sound from adapter");
		socket.playMonoSound(sound);
	}

}
