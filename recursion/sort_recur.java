

import java.util.ArrayList;
import java.util.List;

public class SortAnArray {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(0);
		l.add(5);
		l.add(2);
		l = sort(l);
		for(int i : l)
			System.out.println(i);
	}

	private static List<Integer> sort(List<Integer> l) {
		if(l.size() == 1)
			return l;
		//hypothesis
		Integer temp = l.get(l.size()-1);
		l.remove(l.size()-1);
		l = sort(l);
		//induction
		return l = insert(l, temp);
	}

	private static List<Integer> insert(List<Integer> l, int i) {
		if(l.size() == 0 || i >= l.get(l.size()-1))
		{
			l.add(i);
			return l;
		}
		//hypothesis
		int val = l.get(l.size() - 1);
		l.remove(l.size()-1);
		l = insert(l, i);
		//induction
		l.add(val);
		return l;
	}
}
