
public class DivisibleSumPairs {
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int res = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if((ar[i]+ar[j]) % k == 0) res++;
			}
		}
		return res;

    }
}
