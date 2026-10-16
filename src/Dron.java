public class Dron extends ProductoAudioVisual{
    private String autonomia;
    private boolean bateriaAdicional;
    private Dron[] listDrones;
    Dron(String codigo, String marca, String modelo, double costoHora, String autonomia, boolean bateriaAdicional){
        super(codigo, marca, modelo, costoHora);
        this.autonomia=autonomia;
        this.bateriaAdicional=bateriaAdicional;
        listDrones=new Dron[10];
        listDrones[0]=new Dron("D0","DJI","2025",18.000,"90 minutos",true);
        listDrones[1]=new Dron("D1","Autel","2026",18.000,"90 minutos",false);
        listDrones[2]=new Dron("D2","Skydio","2025",18.000,"90 minutos",true);
        listDrones[3]=new Dron("D3","Parrot","2026",18.000,"90 minutos",false);
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
//su