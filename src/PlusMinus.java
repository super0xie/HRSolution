
public class PlusMinus {
	static void plusMinus(int[] arr) {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i : arr) {
			if(i > 0) c1++;
			else if(i < 0) c2++;
			else c3++;
		}
		
		System.out.println((double)c1/arr.length);
		System.out.println((double)c2/arr.length);
		System.out.println((double)c3/arr.length);

    }
}
