
public class FindDigits {
	static int findDigits(int n) {
		int res = 0;
		int c = n;
		while(c > 0) {
			int d = c % 10;
			if(d != 0 && n % d == 0) res++;
			c = c / 10;
		}
		return res;
    }
}
