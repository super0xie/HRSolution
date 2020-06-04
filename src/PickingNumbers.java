import java.util.Collections;
import java.util.List;

public class PickingNumbers {
	
	public static int pickingNumbers(List<Integer> a) {
		int s = 0;
		int res = 0;
		Collections.sort(a);
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) - a.get(s) > 1) {
				s = i;
			}else {
				res = Math.max(res, i-s+1);
			}
		}
		return res;
	}
}
