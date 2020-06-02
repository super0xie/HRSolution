import java.util.List;

public class MigratoryBirds {
	static int migratoryBirds(List<Integer> arr) {
		int[] count = new int[6];
		for(int i : arr) count[i]++;
		int max = 0;
		for(int i : count) max = Math.max(max, i);
		for(int i = 0; i < count.length; i++) {
			if(count[i] == max) return i;
		}
		return -1;
    }
}
