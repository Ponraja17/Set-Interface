import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String args[]) {
		Set<Integer> s=new HashSet<Integer>();
	s.add(10);
	s.add(23);
	s.add(18);
	s.add(23);
	s.add(2);
	s.remove(10);
	
	System.out.println(s);
	for(int l:s) {
		System.out.println(l);
	}
	
	}

}
