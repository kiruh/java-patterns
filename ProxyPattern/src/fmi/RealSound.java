package fmi;

public class RealSound implements Sound {

	private String fileName;
	
	public RealSound(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}

	@Override
	public void play() {
		System.out.println("Playing: " + this.fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading file: " + this.fileName);
	}

}
