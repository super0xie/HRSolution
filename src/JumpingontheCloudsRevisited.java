
public class JumpingontheCloudsRevisited {
	static int jumpingOnClouds(int[] c, int k) {
		int e = 100;
		int i = 0;
		while(e > 0) {
			i = i + k;
			i = i % c.length;
			e--;
			if(c[i] == 1) e -= 2;
			
			if(i == 0) break;
		}
		
		return e;
    }
}
