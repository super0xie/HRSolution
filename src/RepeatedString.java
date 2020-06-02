
public class RepeatedString {
	
	static long repeatedString(String s, long n) {
		long t = n / s.length();
		long mod = n % s.length();
		long count = 0;
		long res = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') count++;
			if(i == mod-1) {
				res += count;
			}
		}
		
		res += count * t;
		return res;

    }
}
