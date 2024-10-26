package view;

import model.Day;

public class DayView {
    public void printDayDetails(String dayName, boolean isHoliday) {
        String holidayStatus = isHoliday ? "Sí" : "No";
        System.out.println("Día: " + dayName);
        System.out.println("¿Es festivo? " + holidayStatus);
    }

    public void displayDay(Day day) {
        System.out.println(day.toString());
    }
}
