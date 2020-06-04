
public class BeautifulDaysattheMovies {
	
	static int beautifulDays(int i, int j, int k) {
		int res = 0;
		for(int n = i; n <= j; n++) {
			if(Math.abs(n-reverse(n)) % k == 0) res++;
		}
		return res;
    }
	
	static int reverse(int i) {
		int res = 0;
		while(i > 0) {
			int d = i % 10;
			res = res * 10;
			res += d;
			i = i / 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(120));
	}
}
