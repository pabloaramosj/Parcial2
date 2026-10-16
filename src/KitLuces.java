public class KitLuces extends ProductoAudioVisual {
    private String cantidadLuces;
    private boolean controlInalambrico;
    private KitLuces[] listKitLuces;
    KitLuces(String codigo, String marca, String modelo, double costoHora, String cantidadLuces,boolean controlInalambrico) {
        super(codigo, marca, modelo, costoHora);
        this.cantidadLuces=cantidadLuces;
        this.controlInalambrico=controlInalambrico;
    }

    public String getCantidadLuces() {
        return cantidadLuces;
    }

    public void setCantidadLuces(String cantidadLuces) {
        this.cantidadLuces = cantidadLuces;
    }

    public boolean isControlInalambrico() {
        return controlInalambrico;
    }

    public void setControlInalambrico(boolean controlInalambrico) {
        this.controlInalambrico = controlInalambrico;
    }
}
