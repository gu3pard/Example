package try3;

import java.util.GregorianCalendar;

public class Date {

	@SuppressWarnings("static-access")
	public static Object DateOfBirth(String string, Object Data) {

        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1940, 2010);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return Data = DateOfBirth(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH), Data);

    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	
	
}
