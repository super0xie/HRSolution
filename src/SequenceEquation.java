
public class SequenceEquation {
	
	static int[] permutationEquation(int[] p) {
		int[] idx = new int[p.length+1];
		for(int i = 0; i < p.length; i++) 
			idx[p[i]] = i+1;
		
		int[] res = new int[p.length];
		for(int i = 0; i < res.length; i++) {
			int x = i+1;
			int id = idx[x];
			int r = idx[id];
			res[i] = r;
		}
		
		return res;
    }
	
}
