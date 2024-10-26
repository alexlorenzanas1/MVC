// src/Main.java
import controller.DayController;
import model.Day;
import view.DayView;

public class Main {
    public static void main(String[] args) {
        // Crear el modelo
        Day day = new Day("Lunes", false);

        // Crear la vista
        DayView view = new DayView();

        // Crear el controlador
        DayController controller = new DayController(day, view);

        // Mostrar los detalles iniciales
        controller.updateView();

        // Modificar el modelo a través del controlador
        controller.setDayName("Martes");
        controller.setHoliday(true);

        // Actualizar la vista con los nuevos datos
        controller.updateView();
    }
}
