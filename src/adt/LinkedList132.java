package adt;

public class LinkedList132 implements ListADT{

	LinkedNode head;
	int size;
	
	public LinkedList132() {
		head = null;
		size = 0;
	}
	
	
	@Override
	public void add(Object item) {
		
		// make a new node
		LinkedNode newNode = new LinkedNode(item);
		
		//if the list is empty, make the newNode the head
		if( size == 0) {
			head = newNode;
			size = 1;
		}else {
			// we are going to find the last node
			LinkedNode lastNode = head;
			
			while( lastNode.next!= null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
			size++;
			
			
		}
		
	}

	@Override
	public void insert(int i, Object item) {
		
		// first check for valid index
		if( i < 0 || i >=size) {
			throw new IndexOutOfBoundsException();
		}
		
		LinkedNode newNode = new LinkedNode(item);
		
		
		if( i ==0) {
			newNode.next = head;
			head = newNode;
		}else {
			// find the node before the insertion point
			LinkedNode nodeBefore = head;
			
			int nodesLeft = i-1;
			while( nodesLeft != 0) {
				nodeBefore = nodeBefore.next;
				nodesLeft--;
			}
			newNode.next = nodeBefore.next;
			nodeBefore.next = newNode;
		}
		
		
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, Object item) {
		// TODO Auto-generated method stub
		
	}

}
