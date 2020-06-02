
public class AppleandOrange {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int counta = 0;
		int countb = 0;
		
		for(int d : apples) {
			int l = a + d;
			if(l >= s && l <= t) counta++;
		}
		
		for(int d : oranges) {
			int l = b + d;
			if(l >= s && l <= t) countb++;
		}
		
		System.out.println(counta);
		System.out.println(countb);

    }
	
}
