package Prictice10_22_01;

public class linklist_01 {
	public static void main(String[] args) {
		sxtLinkList_01<String> list = new sxtLinkList_01<>();
		list.add("a");
		list.add("s");
		list.add("d");
		list.add("d1");
		list.add("d2");
		list.add("d3");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add(3, "???");
		System.out.println(list);
		
		
	}
}
class sxtLinkList_01<E>{
	private Node first;
	private Node last;
	private int size;
	
	public void add(E obj) {
		Node node = new Node(obj);
		if(first == null) {
//			node.previous = null;
//			node.next = null;
			first = node;
			last = node;
			
		}else {
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
			
		}
		
		size++;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder("[");
		Node temp = first;
		while (temp!=null) {
			s.append(temp.ele + " ");
			temp = temp.next;
		}
		s.setCharAt(s.length()-1,']');
		
		return s.toString();
	}
	
	private void check(int index) {
		if(index<0||index>size-1) {
			throw new RuntimeException("索引不合法："+index);
		}
		
	}
	
	public E get(int index) {
		check(index);
		Node temp = getNode(index);
		return temp!=null?(E)temp.ele:null;
	}
	
	private Node getNode(int index) {
		check(index);
		Node temp = null;
		if(index<size>>1) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}else {
			temp = last;
			for (int j = size-1; j > index; j--) {
				temp = temp.previous;
			}
		}
		return temp;
	}
	
	public void remove(int index) {
		check(index);
		Node temp = getNode(index);
		if(temp!=null) {
			Node up = temp.previous;
			Node down = temp.next;
			if(up!=null) {
				up.next = down;
			}
			if(down!=null) {
				down.previous = up;
			}
			if(index==0) {
				first = down;
			}
			if(index==size-1) {
				last = up;
			}
			size--;
		}
	}
	
	public void add(int index, E obj) {
		check(index);
		Node newNode = new Node(obj);
		Node temp = getNode(index);
		
		if(temp!=null) {
			Node up = temp.previous;
			up.next = newNode;
			newNode.previous = up;
			newNode.next = temp;
			temp.previous = newNode;
			
		}
	}
	
}

class Node{
	Node previous;
	Node next;
	Object ele;
	
	public Node(Node previous, Node next, Object ele) {
		super();
		this.previous = previous;
		this.next = next;
		this.ele = ele;
	}

	public Node(Object ele) {
		super();
		this.ele = ele;
	}
	
}