import java.util.List;

public class BirthdayChocolate {
	
	static int birthday(List<Integer> s, int d, int m) {
		int res = 0;
		int sum = 0;
		for(int i = 0; i < s.size(); i++) {
			sum += s.get(i);
			if(i >= m) sum -= s.get(i-m);
			if(i >= m-1 && sum == d) res++;
		}
		return res;

    }
	
}
