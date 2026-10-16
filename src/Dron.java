public class Dron extends ProductoAudioVisual{
    private String autonomia;
    private String bateriaAdicional;

    Dron(String codigo, String marca, String modelo, double costoHora, String autonomia, String bateriaAdicional){
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

    public String getBateriaAdicional() {
        return bateriaAdicional;
    }

    public void setBateriaAdicional(String bateriaAdicional) {
        this.bateriaAdicional = bateriaAdicional;
    }
}
//su