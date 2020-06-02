import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    List<Integer> res = new ArrayList<>();
	    for(int i : grades) {
	    	if(i < 38) res.add(i);
	    	else {
	    		int n = (i / 5 + 1) * 5;
	    		if(n - i < 3) res.add(n);
	    		else res.add(i);
	    	}
	    }
	    return res;

	}
}
