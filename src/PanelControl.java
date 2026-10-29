import java.util.ArrayList;
import java.util.List;

public class PanelControl {
    private List<SensorIndustrial> dispositivos;

    public PanelControl() {
        this.dispositivos = new ArrayList<>();
    }

    public void registrarSensor(SensorIndustrial sensor) {
        dispositivos.add(sensor);
    }


    public void ejecutarBarridoMetricas() {
        System.out.println("==================================================");
        System.out.println("       PANEL DE CONTROL - BARRIDO DE SENSORES      ");
        System.out.println("==================================================\n");

        for (SensorIndustrial sensor : dispositivos) {
            String estadoTexto = sensor.isEstadoOperativo() ? "[OPERATIVO]" : "[FALLA/INACTIVO]";
            System.out.println("ID Sensor: " + sensor.getIdSensor() + " " + estadoTexto);
            System.out.println("Tipo:      " + sensor.getClass().getSimpleName());
            System.out.println("Métrica:   " + sensor.leerMetrica());
            System.out.println("--------------------------------------------------");
        }
    }
}
