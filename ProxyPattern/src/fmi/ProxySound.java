package fmi;

public class ProxySound implements Sound {

	private RealSound realSound;
	private String fileName;
	
	public ProxySound(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void play() {
		
		// place to add condition if 
		// the real class is accessible
		
		if(this.realSound == null) {
			this.realSound = new RealSound(this.fileName);
		}
		this.realSound.play();

	}

}
