package model;

public class Day {
    private String name;
    private boolean isHoliday;

    public Day(String name, boolean isHoliday) {
        this.name = name;
        this.isHoliday = isHoliday;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoliday(boolean isHoliday) {
        this.isHoliday = isHoliday;
    }

    @Override
    public String toString() {
        return name + (isHoliday ? " (Festivo)" : "");
    }
}

