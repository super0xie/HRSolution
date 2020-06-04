
public class AppendandDelete {
	static String appendAndDelete(String s, String t, int k) {
		if(k >= s.length() + t.length()) return "Yes";
		int i = 0;
		for(; i < Math.min(s.length(), t.length()); i++) {
			if(s.charAt(i) != t.charAt(i)) break;
		}
		int n = s.length() - i + t.length() - i;
		
		if(k >= n && (k-n) % 2 == 0)
			return "Yes";
		return "No";

    }
}
