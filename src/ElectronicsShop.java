import java.util.Arrays;

public class ElectronicsShop {
	static int getMoneySpent(int[] k, int[] d, int b) {
        Arrays.parallelSort(d);
        
        int max = -1;
        for(int i : k) {
        	if(i >= b) continue;
        	int tar = b - i;
        	int ret = Arrays.binarySearch(d, tar);
        	if(ret >= 0) return b;
        	ret = -ret-1;
        	if(ret == 0) continue;
        	max = Math.max(max, i + d[ret-1]);
        }
        
        return max;
    }
}
