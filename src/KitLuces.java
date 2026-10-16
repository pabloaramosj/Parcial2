public class KitLuces extends ProductoAudioVisual {
    private String cantidadLuces;
    private boolean controlInalambrico;
    private KitLuces[] listKitLuces;
    KitLuces(String codigo, String marca, String modelo, double costoHora, String cantidadLuces,boolean controlInalambrico) {
        super(codigo, marca, modelo, costoHora);
        this.cantidadLuces=cantidadLuces;
        this.controlInalambrico=controlInalambrico;
        listKitLuces=new KitLuces[10];
        listKitLuces[0]=new KitLuces("K0","Ilumax","2025",10.000,"200 leds",true);
        listKitLuces[1]=new KitLuces("K1","Philips","2026",10.000,"200 leds",false);
        listKitLuces[2]=new KitLuces("K2","Osram","2025",10.000,"200 leds",true);
        listKitLuces[3]=new KitLuces("K3","Leviton","2026",10.000,"200 leds",false);
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
