import java.util.Set;
import java.util.TreeSet;
import java.util.*;

class Products implements Comparable<Products>{
	
	String Name;
	int Price;
	public Products(String name,int price){
		this.Name=name;
		this.Price=price;
	}
	
	public int compareTo(Products C) {
		if(Price>C.Price) {
		return 1;
		}

		else {
			return -1;
		}
}
}
public class CustomAddTreeSet {
	
	
	public static void main(String args[]) {
		Set<Products> P=new TreeSet<Products>();
		Products p1=new Products("Pen",10);
		Products p2=new Products("Pencil",5);
		Products p3=new Products("Eraser",6);
		Products p4=new Products("Sharpener",5);
		
		P.add(p1);
		P.add(p2);
		P.add(p3);
		P.add(p4);
		
		for(Products C:P) {
			System.out.println(C.Name+" "+C.Price);
		}
		
	}

}

