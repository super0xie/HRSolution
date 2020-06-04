
public class ViralAdvertising {
	static int viralAdvertising(int n) {
		int res = 0;
		int cur = 5;
		for(int i = 0; i < n; i++) {
			res += cur / 2;
			cur = cur / 2 * 3;
		}
		return res;
    }
}
