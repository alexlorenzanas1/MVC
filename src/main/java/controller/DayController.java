package controller;

import model.Day;
import view.DayView;

public class DayController {
    private Day model;
    private DayView view;

    public DayController(Day model, DayView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interactuar con el modelo
    public void setDayName(String name) {
        model.setName(name);
    }

    public String getDayName() {
        return model.getName();
    }

    public void setHoliday(boolean isHoliday) {
        model.setHoliday(isHoliday);
    }

    public boolean isHoliday() {
        return model.isHoliday();
    }

    // Método para actualizar la vista
    public void updateView() {
        view.displayDay(model);
    }
}
