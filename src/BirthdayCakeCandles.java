
public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int[] ar) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i : ar) {
			if(i > max) {
				max = i;
				count = 1;
			}else if(i == max) {
				count++;
			}
		}
		return count;

    }
	
}
