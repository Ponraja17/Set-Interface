import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Dublicate {
	public static void main(String args[]) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		//PriorityQueue<Integer> l=new PriorityQueue<Integer>();
		Scanner input=new Scanner(System.in);
		int a,count;
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+i+"Value");
			a=input.nextInt();
			l.add(a);
			}
		Set<Integer> k=new HashSet<>();
		for(int b:l) {
			//System.out.println(b);
			if(k.add(b)==false) {
				System.out.println(b);
			}
		}
//		for(int i=0;i<l.size();i++) {
//			count=0;
//			for(int j=0;j<l.size();j++) {
//				if(l.get(i)==l.get(j)) {
//					count++;
//			}
//				
//			
//			}
//			if(count>1) {
//				System.out.println("Dublicate number is "+l.get(i));
//			}
//		}
	}

}
