import java.util.Arrays;

public class ClimbingtheLeaderboard {
	
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		Arrays.parallelSort(scores);
		int[] rank = new int[scores.length];
		int r = 1;
		rank[scores.length-1] = 1;
		for(int i = scores.length-2; i >= 0; i--) {
			if(scores[i] < scores[i+1]) r++;
			rank[i] = r;
		}
		
		int[] res = new int[alice.length];
		
		for(int i = 0; i < alice.length; i++) {
			int s = alice[i];
			int ip = Arrays.binarySearch(scores, s);
			if(ip >= 0) res[i] = rank[ip];
			else {
				ip = -ip-1;
				if(ip == 0) res[i] = rank[0]+1;
				else {
					res[i] = rank[ip-1];
				}
			}
			
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		int[] scores = {100, 100, 50, 40, 40, 20, 10};
		int[] alice = {5, 25, 50, 120};
		int[] res = climbingLeaderboard(scores, alice);
		for(int i : res) System.out.println(i);
	}
	
}
