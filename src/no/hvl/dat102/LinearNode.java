package no.hvl.dat102;

public class LinearNode<T> {

	private LinearNode<T> neste;
	private T element;

	public LinearNode(T element) {
		this.element = element;
		neste = null;
	}

	public LinearNode(T element, LinearNode<T> neste) {
		this.element = element;
		this.neste = neste;
	}

	public boolean hasNext() {
		return (neste != null);
	}

	public LinearNode<T> getNeste() {
		return neste;
	}

	public void setNeste(LinearNode<T> neste) {
		this.neste = neste;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}
