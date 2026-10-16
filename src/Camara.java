public class Camara extends ProductoAudioVisual{
    private String resolucionMaxima;
    private boolean estabilizador;
    private Camara[] listCamaras;
    Camara(String codigo, String marca, String modelo, double costoHora, String resolucionMaxima, boolean estabilizador){
        super(codigo, marca, modelo, costoHora);
        this.estabilizador=estabilizador;
        this.resolucionMaxima=resolucionMaxima;
        listCamaras=new Camara[10];
        listCamaras[0]=new Camara("C0","Sony","2025",12.000,"90 minutos",true);
        listCamaras[1]=new Camara("C1","Nikon","2026",12.000,"90 minutos",false);
        listCamaras[2]=new Camara("C2","Kodak","2025",12.000,"90 minutos",true);
        listCamaras[3]=new Camara("C3","Panasonic","2026",12.000,"90 minutos",false);
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    public boolean isEstabilizador() {
        return estabilizador;
    }

    public void setEstabilizador(boolean estabilizador) {
        this.estabilizador = estabilizador;
    }

    public Camara[] getListCamaras() {
        return listCamaras;
    }

    public void setListCamaras(Camara[] listCamaras) {
        this.listCamaras = listCamaras;
    }
}
