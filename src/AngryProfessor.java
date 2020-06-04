
public class AngryProfessor {
	static String angryProfessor(int k, int[] a) {
		int count = 0;
		for(int i : a) {
			if(i <= 0) count++;
		}
		if(count >= k) return "NO";
		return "YES";

    }
}
