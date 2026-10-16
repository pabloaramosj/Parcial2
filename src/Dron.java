public class Dron extends ProductoAudioVisual{
    private String autonomia;
    private boolean bateriaAdicional;
    private Dron[] listDrones;
    Dron(String codigo, String marca, String modelo, double costoHora, String autonomia, boolean bateriaAdicional){
        super(codigo, marca, modelo, costoHora);
        this.autonomia=autonomia;
        this.bateriaAdicional=bateriaAdicional;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public boolean getBateriaAdicional() {
        return bateriaAdicional;
    }

    public void setBateriaAdicional(boolean bateriaAdicional) {
        this.bateriaAdicional = bateriaAdicional;
    }
}
//