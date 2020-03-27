import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ArrayList
 * A class which implements List methods to work with ArrayList<T>
 * @author arnauvila
 *
 */

public class ArrayList<T> implements List<T>{
	
	private T[] list;
	private int size; /*Keeps track of elements in array*/

	public ArrayList(){
		size=0;
		list=(T[])new Object[10];
	}
	
	/**
	 * doubleArray method.
	 * Doubles the length of the array every time the position
	 * of element added is bigger than max size of the array.
	 */
	public void doubleArray(){
		T[] newlist=(T[])new Object[size()*2];
		System.arraycopy(list,0,newlist,0,list.length);
		list=newlist;
	}
	public void add(T element){
		if(size==list.length){
			doubleArray();
		}
		list[size++]=element;
	}

	public void add(int pos, T element){
		if(pos>=list.length){
			doubleArray();
		}
		size++;
		list[pos]=element;

	}

	public T get(int i){
		return list[i];
	}

	public T remove(int e){
		T l=list[e];
		System.arraycopy(list,e+1,list,e,list.length-1-e);
		size--;
		return l;
	}

	public int size(){
		return size;
	}

	public void printArray(){
		int i=size()-1;
		while(i>-1){
			if(list[i]!=null)
				System.out.print(list[i--]+", ");
			else
				i--;
		}
	}
	
	/** Main Method to test code.
	 */
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list.remove(list.size()-1));
		list.printArray();
	}


}
