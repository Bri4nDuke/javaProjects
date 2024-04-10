// By: Brian Duke
// Description: Equations for calculating date conversions

// Import Date Format Symbols
import java.text.DateFormatSymbols;

public class DateCalc 
{
    // Array for days in each month
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Convert Gregorian date to Julian date
    public int convertToJulian(String gregDate) 
    {
        int month = Integer.parseInt(gregDate.substring(0, 2));
        int day = Integer.parseInt(gregDate.substring(3, 5));
        int year = Integer.parseInt(gregDate.substring(6));

        int julianDate = day;
        for (int i = 0; i < month - 1; i++) 
        {
            julianDate += DAYS_IN_MONTH[i];
        }

        // If statement for Leap Years
        if (leapYear(year) && month > 2) 
        {
            julianDate++;
        }
        return year * 1000 + julianDate;
    }

    // Convert Julian date to Gregorian date
    public String convertToGreg(int julianDate) 
    {
        int year = julianDate / 1000;
        int dayOfYear = julianDate % 1000;

        int month = 0;
        while (dayOfYear > DAYS_IN_MONTH[month]) 
        {
            // If statement for Leap Years
            if (leapYear(year) && month == 1) 
            {
                dayOfYear--;
            }
            dayOfYear -= DAYS_IN_MONTH[month];
            month++;
        }
        if (leapYear(year) && month == 1) 
        {
            dayOfYear++;
        }
        return String.format("%02d/%02d/%04d", month + 1, dayOfYear, year);
    }

    // Add or subtract days from a date
    public String addSubtractDays(String gregDate, int days) 
    {
        int julianDate = convertToJulian(gregDate);
        julianDate += days;
        return convertToGreg(julianDate);
    }

    // Format a date to be in standard English
    public String englishDate(String gregDate) 
    {
        int month = Integer.parseInt(gregDate.substring(0, 2));
        int day = Integer.parseInt(gregDate.substring(3, 5));
        int year = Integer.parseInt(gregDate.substring(6));

        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] weekdays = dfs.getWeekdays();
        String[] months = dfs.getMonths();

        return weekdays[getJulianDayOfWeek(convertToJulian(gregDate))] + ", " +
                months[month - 1] + " " + day + ", " + year;
    }

    // Calculate the amount of days between two dates
    public int daysBetween(String startDate, String endDate) 
    {
        int startJulianDate = convertToJulian(startDate);
        int endJulianDate = convertToJulian(endDate);

        return endJulianDate - startJulianDate;
    }

    // Checks if the year entered is a leap year
    private boolean leapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get the Julian day of the week for a given Julian date
    private int getJulianDayOfWeek(int julianDate) 
    {
        return julianDate % 7;
    }
}
