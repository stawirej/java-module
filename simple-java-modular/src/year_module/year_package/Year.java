package year_package;
import java.util.Calendar;
public class Year {
    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}

