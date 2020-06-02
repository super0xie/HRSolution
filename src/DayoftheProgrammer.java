
public class DayoftheProgrammer {
	private static int[] days = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	static String dayOfProgrammer(int year) {
		if(year == 1918) {
			return "26.09.1918";
		}else {
			boolean leap = false;
			if(year <= 1917 && year % 4 == 0) leap = true;
			if(year >= 1919 && (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))) leap = true;
			if(leap) return "12.09."+year;
			else return "13.09."+year;
		}
    }
	
}
