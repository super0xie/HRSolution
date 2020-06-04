
public class CircularArrayRotation {
	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int[] res = new int[queries.length];
		k = k % a.length;
		int[] arr = new int[a.length];
		System.arraycopy(a, a.length-k, arr, 0, k);
		System.arraycopy(a, 0, arr, k, a.length-k);
		
		for(int i = 0; i < queries.length; i++) {
			res[i] = arr[queries[i]];
		}
		
		return res;
    }
}
