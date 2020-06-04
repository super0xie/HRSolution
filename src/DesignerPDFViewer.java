
public class DesignerPDFViewer {
	static int designerPdfViewer(int[] h, String word) {
		int m = 0;
		for(char c : word.toCharArray()) {
			m = Math.max(h[c-'a'], m);
		}
		return m * word.length();
    }
}
