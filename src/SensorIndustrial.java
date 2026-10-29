public abstract class SensorIndustrial {
    protected String idSensor;
    protected boolean estadoOperativo;

    public SensorIndustrial(String idSensor, boolean estadoOperativo){
        this.idSensor = idSensor;
        this.estadoOperativo = estadoOperativo;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public boolean isEstadoOperativo() {
        return estadoOperativo;
    }

    public abstract String leerMetrica();
}
