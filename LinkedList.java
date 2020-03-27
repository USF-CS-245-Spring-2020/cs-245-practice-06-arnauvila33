/**
 * LinkedList
 * A class which implements List methods to work with ArrayList<T>
 * @author arnauvila
 *
 */


public class LinkedList<T> implements List<T>{
	Node<T> head;
		
	public void add(T el){
		Node<T> nn=new Node<T>(el);
		nn.next=null;
		if(head==null)
			this.head=nn;
		else{
			Node<T> last=head;
			while(last.next!=null){
				last=last.next;
			}
			last.next=nn;
		}
	}

	public void add(int pos, T el){
		Node<T> nn=new Node<T>(el);
		nn.next=null;
		if(pos==0){
			nn.next=head;
			head=nn;
		}
		else{	
			Node<T> curr=head;
			int i=pos-1;
			while(i>0){
				curr=curr.next;
				i--;
			}
			nn.next=curr.next;
			curr.next=nn;
		}

	}

	public T remove(int pos){
		int i=0;
		Node<T> curr=head;
		Node<T> previous=null;
		if(pos==0){
			previous=head;
			head=head.next;
			return previous.value;
		}
		while(curr!=null){
			if(i==pos){
				previous.next=curr.next;
				break;
			}
			else{
				previous=curr;
				curr=curr.next;
				i++;
			}
		}
		return curr.value;
	}

	public T get(int pos){
		int i=0;
		Node<T> curr=head;
		while(i<pos){
			curr=curr.next;
			if(curr==null)
				break;
			i++;
		}
		return curr.value;
	}
	
	public int size(){
		int i=0;
		Node<T> curr=head;
		while(curr!=null){
			i++;
			curr=curr.next;
		}
		return i;
	}

	public void printlist(){
		int i=1;
		Node<T> c=head;
		while(c!=null){
			System.out.print("["+c.value+"] ");
			c=c.next;
			i++;
		}

	}



	static class Node<T>{
		T value;
		Node<T> next;

		public Node(T l){
			value=l;
			next=null;
		}

	}


}

