import java.util.Arrays;

public class SimpleArraySum {
	
	static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).reduce(0, Integer::sum);
    }
}
