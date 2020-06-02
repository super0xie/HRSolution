
public class TimeConversion {
	static String timeConversion(String s) {
        if(s.charAt(s.length()-2) == 'A') {
        	int hour = Integer.parseInt(s.substring(0, 2));
        	if(hour == 12) return "00"+s.substring(2, s.length()-2);
        	return s.substring(0, s.length()-2);
        }else {
        	int hour = Integer.parseInt(s.substring(0, 2));
        	if(hour != 12)
        		hour += 12;
        	return hour + s.substring(2, s.length()-2);
        }

    }
}
