import java.util.List;

public class DiagonalDifference {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		int n = arr.size();
		int i = 0;
		int j = 0;
		int s1 = 0;
		while(i < n) {
			s1 += arr.get(i++).get(j++);
		}
		int s2 = 0;
		i = n-1;
		j = 0;
		
		while(i >= 0) {
			s2 += arr.get(i--).get(j++);
		}
		
		return Math.abs(s1-s2);
	}
}
