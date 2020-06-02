
public class BreakingtheRecords {
	static int[] breakingRecords(int[] scores) {
		int max = scores[0];
		int min = max;
		int count1 = 0;
		int count2 = 0;
		for(int i = 1; i < scores.length; i++) {
			int s = scores[i];
			if(s > max) {
				max = s;
				count1++;
			}else if(s < min) {
				min = s;
				count2++;
			}
		}
		return new int[] {count1, count2};

    }
}
