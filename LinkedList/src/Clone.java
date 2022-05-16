import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
public class Clone {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		int j=0;
		for(int i=1;i<=10;i++) {
			l.add(i);
			j++;
		}
		System.out.println(l);
		
		System.err.println(j);
		l.remove(5);
		int i=0;
		for(int k:l) {
			System.out.println(k);
			i++;
		}
		System.err.println(i);
//		LinkedList<Integer> l2=new LinkedList<Integer>();
//		l2=(LinkedList)l.clone();
//		System.out.println(l2);
//		l2.add(0,10);
//		
//		try {Thread.sleep(1000);} catch (InterruptedException e) {}
//			
//		
//		System.out.println(l2);
//		
		
	}

}
