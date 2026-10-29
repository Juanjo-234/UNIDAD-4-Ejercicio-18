public class SensorPresion extends SensorIndustrial{
    private double corrienteMiliamperes;

    public SensorPresion(String idSensor, boolean estadoOperativo, double corrienteMiliamperes) {
        super(idSensor, estadoOperativo);
        this.corrienteMiliamperes = corrienteMiliamperes;
    }

    @Override
    public String leerMetrica() {
        if (!estadoOperativo) return "Sensor Fuera de Línea";
        double presion = ((corrienteMiliamperes - 4.0) / (20.0 - 4.0)) * 300.0;
        return String.format("%.2f PSI (Señal: %.2fmA)", presion, corrienteMiliamperes);
    }
}
