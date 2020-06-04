
public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		boolean[] aux = new boolean[101];
		int res = 0;
		for(int i : ar) {
			if(aux[i]) res++;
			aux[i] = !aux[i];
		}
		return res;
    }
}
