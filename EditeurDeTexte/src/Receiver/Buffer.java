package Receiver;

public class Buffer {

	private String texte;
	private Selection selection;
	private PressePapier pressePapier;
	private PressePapier pressePapier2;
	
	public Buffer() {
		texte = "";
		selection = new Selection();
		pressePapier = new PressePapier();
	}

}
