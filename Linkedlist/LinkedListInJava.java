class Node {
	private int data;
	private Node next;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int d, Node n) {
		data = d;
		next = n;
	}

	public void setData(int d) {
		data = d;
	}

	public int getData() {
		return data;
	}

	public void setNext(Node n) {
		next = n;
	}

	public Node getNext() {
		return next;
	}

}

class LinkedList {
	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	public int getListSize() {
		return size;
	}

	public void viewList() {
		Node t;
		if (start == null) {
			System.out.println(" List is Empty ");
		} else {
			t = start;
			while (t.getNext() != null) {
				System.out.println(" " + t.getData());
				t = t.getNext();
			}
		}
	}

	public void insertAtBeggining(int data) {
		Node n = new Node();
		n.setNext(start);
		n.setData(data);
		// start = n;
		size++;
	}

	public void insertAtEnd(int data) {
		Node t, n;
		n = new Node();
		n.setData(data);
		n.setNext(null);
		t = start;

		while (t.getNext() != null) {
			t = t.getNext();
		}
		t.setNext(n);
		size++;
	}

	public void insertAtPosition(int data, int pos) {
		if (pos == 1) {
			insertAtBeggining(data);
		} else if (pos == size + 1) {
			insertAtEnd(data);
		} else if (pos > 1 && pos <= size) {
			Node t, n;
			n = new Node(data, null);
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		} else {
			System.out.println("Intertion not possible at position " + pos);
		}
	}

	public void deleteAtFirst() {
		if (start == null) {
			System.out.println("List is already empty");
		} else {
			start = start.getNext();
			size--;
		}
	}

	public void deleteAtEnd() {
		if (start == null) {
			System.out.println("List is already empty");
		} else if (size == 1) {
			start = null;
			size--;
		} else {
			Node t = start;
			for (int i = 1; i < size - 1; i++) {
				t = t.getNext();
			}
			t.setNext(null);
			size--;
		}
	}

	public void deleteAtPosition(int pos) {
		if (start == null) {
			System.out.println("List is already empty");
		} else if (pos < 1 || pos > size) {
			System.out.println("Invalid position");
		} else if (pos == 1) {
			deleteAtFirst();
		} else if (pos == size) {
			deleteAtEnd();
		} else {
			Node t, t1;
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}
}

public class LinkedListInJava {
	public static void main(String[] args) {

	}
}
