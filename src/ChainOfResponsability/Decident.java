package ChainOfResponsability;

public abstract class Decident {
	
	protected Decident successor;
	 public void setSuccessor(Decident successor) {
		 this.successor=successor;
	 }
	 public abstract void HandleRequest(Cerere cerere);
}
