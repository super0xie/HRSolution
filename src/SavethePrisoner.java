
public class SavethePrisoner {
	static int saveThePrisoner(int n, int m, int s) {
		int res = (m+s-1)%n;
		if(res == 0) res = n;
		return res;
    }
}
