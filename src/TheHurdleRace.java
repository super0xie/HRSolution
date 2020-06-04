
public class TheHurdleRace {
	static int hurdleRace(int k, int[] height) {
		int m = 0;
		for(int i : height) m = Math.max(m, i);
		return Math.max(0, m-k);
    }
}
