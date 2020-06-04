
public class DrawingBook {
	static int pageCount(int n, int p) {
		int res = Integer.MAX_VALUE;
		int tar = p;
		if(tar % 2 == 0) tar++;
		res = Math.min(res, (tar-1)/2);
		if(n % 2 == 0) n++;
		res = Math.min(res, (n-tar)/2);
		return res;
    }
}
