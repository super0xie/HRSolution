import java.util.Arrays;

public class MiniMaxSum {
	
	static void miniMaxSum(int[] arr) {
		Arrays.parallelSort(arr);
		System.out.println((long)arr[0]+arr[1]+arr[2]+arr[3] +  " " + ((long)arr[1] + arr[2] + arr[3] + arr[4]));
    }
	
}
