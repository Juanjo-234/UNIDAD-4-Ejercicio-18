//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PanelControl panel = new PanelControl();

    SensorIndustrial tempReactor = new SensorTemperatura("TEMP-101", true, 6.5);
    SensorIndustrial presCaldera = new SensorPresion("PRES-204", true, 12.0);
    SensorIndustrial flujoLinea = new SensorFlujo("FLUX-305", true, 350.0);
    SensorIndustrial tempAuxiliar = new SensorTemperatura("TEMP-102", false, 0.0);

    panel.registrarSensor(tempReactor);
    panel.registrarSensor(presCaldera);
    panel.registrarSensor(flujoLinea);
    panel.registrarSensor(tempAuxiliar);

    panel.ejecutarBarridoMetricas();
}
