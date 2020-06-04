
public class CountingValleys {
	static int countingValleys(int n, String s) {
		int res = 0;
		int cur = 0;
		for(int i = 0; i < s.length(); i++) {
			int b = cur;
			if(s.charAt(i) == 'D') cur--;
			else cur++;
			if(b < 0 && cur == 0) res++;
		}
		return res;
    }
}
