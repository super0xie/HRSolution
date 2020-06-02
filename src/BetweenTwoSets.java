import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		Collections.sort(a);
		Collections.sort(b);
		int res = 0;
		for(int i = a.get(a.size()-1); i <= b.get(0); i++) {
			int j = 0;
			for(; j < a.size(); j++) {
				if(i % a.get(j) != 0) break;
			}
			if(j != a.size()) continue;
			
			j = 0;
			for(; j < b.size(); j++) {
				if(b.get(j) % i != 0) break;
			}
			
			if(j != b.size()) continue;
			res++;
		}
		return res;
	}
}
