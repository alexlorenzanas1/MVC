package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DayTest {

    @Test
    public void testDayCreation() {
        Day day = new Day("Miércoles", true);
        assertEquals("Miércoles", day.getName());
        assertTrue(day.isHoliday());
    }

    @Test
    public void testSetName() {
        Day day = new Day("Jueves", false);
        day.setName("Viernes");
        assertEquals("Viernes", day.getName());
    }

    @Test
    public void testSetHoliday() {
        Day day = new Day("Sábado", false);
        day.setHoliday(true);
        assertTrue(day.isHoliday());
    }

    @Test
    public void testToString() {
        Day day = new Day("Domingo", true);
        assertEquals("Domingo (Festivo)", day.toString());

        Day nonHolidayDay = new Day("Lunes", false);
        assertEquals("Lunes", nonHolidayDay.toString());
    }
}