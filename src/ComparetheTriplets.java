import java.util.Arrays;
import java.util.List;

public class ComparetheTriplets {
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int n = a.size();
		int counta = 0;
		int countb = 0;
		for(int i = 0; i < n; i++) {
			if(a.get(i) > b.get(i)) counta++;
			else if(a.get(i) < b.get(i)) countb++;
		}
		
		return Arrays.asList(counta, countb);
    }
}
