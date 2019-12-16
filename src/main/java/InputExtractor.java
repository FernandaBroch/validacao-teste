package main.java;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class InputExtractor {

    public static String extractCustomerType(String input) {
        return input.split(":")[0];
    }

    public static List<String> extractDayTypes(String input) {
        List<String> daytypes = Arrays.asList(getDaysFromInput(input).split(", "));

        return daytypes.stream().map(dayType -> {
            try {
                return extractDayType(dayType.trim());
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }).collect(Collectors.toList());
    }

    private static String getDaysFromInput(String input) {
        return input.split(":")[1];
    }

    private static String extractDayType(String inputDate) throws ParseException {
        Calendar c = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("ddMMMyyyy");
        Date date = format.parse(inputDate);
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY ? "Weekend" : "Weekday";
    }
}
