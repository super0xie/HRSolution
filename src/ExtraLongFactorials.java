import java.math.BigInteger;

public class ExtraLongFactorials {
	
	
	static void extraLongFactorials(int n) {
		BigInteger i = BigInteger.valueOf(1);
		for(int j = 2; j <= n; j++) {
			i = i.multiply(BigInteger.valueOf(j));
		}
		
		System.out.println(i.toString());
    }
}
