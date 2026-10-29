public class SensorTemperatura extends SensorIndustrial{
    private double voltajeSeñal;

    public SensorTemperatura(String idSensor, boolean estadoOperativo, double voltajeSeñal){
        super(idSensor, estadoOperativo);
        this.voltajeSeñal = voltajeSeñal;
    }

    @Override
    public String leerMetrica() {
        if (!estadoOperativo) return "Sensor Fuera de Línea";

        double temperatura = (voltajeSeñal / 10.0) * 150.0;
        return String.format("%.2f °C (Señal: %.2fV)", temperatura, voltajeSeñal);
    }
}
