
public class FormingaMagicSquare {
	
	static int formingMagicSquare(int[][] s) {
		int minDiff = Integer.MAX_VALUE;
		int[][] tar = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
		minDiff = Math.min(minDiff, diff(s, tar));
		int[][] aux = ud(tar);
		minDiff = Math.min(minDiff, diff(s, aux));
		aux = lr(tar);
		minDiff = Math.min(minDiff, diff(s, aux));
		aux = ud(aux);
		minDiff = Math.min(minDiff, diff(s, aux));		
		
		tar = new int[][] {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		minDiff = Math.min(minDiff, diff(s, tar));
		aux = ud(tar);
		minDiff = Math.min(minDiff, diff(s, aux));
		aux = lr(tar);
		minDiff = Math.min(minDiff, diff(s, aux));
		aux = ud(aux);
		minDiff = Math.min(minDiff, diff(s, aux));
		
		return minDiff;
    }
	
	static int diff(int[][] a, int[][] b) {
		int res = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				res += Math.abs(a[i][j]-b[i][j]);
			}
		}
		return res;
	}
	
	static int[][] ud(int[][] arr){
		int[][] res = new int[3][3];
		for(int i = 0; i < 3; i++) res[0][i] = arr[2][i];
		for(int i = 0; i < 3; i++) res[1][i] = arr[1][i];
		for(int i = 0; i < 3; i++) res[2][i] = arr[0][i];
		return res;
	}
	
	static int[][] lr(int[][] arr){
		int[][] res = new int[3][3];
		for(int i = 0; i < 3; i++) res[i][0] = arr[i][2];
		for(int i = 0; i < 3; i++) res[i][1] = arr[i][1];
		for(int i = 0; i < 3; i++) res[i][2] = arr[i][0];
		return res;
	}
	
	
	
	
	
	
}
