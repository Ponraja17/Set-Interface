import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByLastDigit {
	public static void main(String args[]) {
		ArrayList<Integer> v=new ArrayList<>();
		v.add(209);
		v.add(500);
		v.add(873);
		v.add(198);
		
//		Comparator<Integer> b=new Comparator<Integer>() {
//		public int compare(Integer i ,Integer j) {
//			if(i%10>j%10) {
//				return 1;
//			}
//			else {
//				return -1;
//			}
//		}
//		};
		Collections.sort(v,(i,j)->i%10>j%10?1:-1);
		System.out.println(v);
	}

}
