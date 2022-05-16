import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]) {
		Set<Integer> t=new TreeSet<>();
		t.add(20);
		t.add(36);
		t.add(18);
		t.add(9);
		t.add(20);
		t.remove(20);
		for(int i:t) {
			System.out.println(i);
		}
	}

}
