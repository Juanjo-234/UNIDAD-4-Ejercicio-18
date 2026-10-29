public class SensorFlujo extends SensorIndustrial{
    private double frecuenciaPulsos;

    public SensorFlujo(String idSensor, boolean estadoOperativo, double frecuenciaPulsos) {
        super(idSensor, estadoOperativo);
        this.frecuenciaPulsos = frecuenciaPulsos;
    }

    @Override
    public String leerMetrica() {
        if (!estadoOperativo) return "Sensor Fuera de Línea";
        double caudal = (frecuenciaPulsos / 500.0) * 50.0;
        return String.format("%.2f m³/h (Señal: %.2f Hz)", caudal, frecuenciaPulsos);
    }
}
