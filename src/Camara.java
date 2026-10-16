public class Camara extends ProductoAudioVisual{
    private String resolucionMaxima;
    private boolean estabilizador;
    private Camara[] listCamaras;
    Camara(String codigo, String marca, String modelo, double costoHora, String resolucionMaxima, boolean estabilizador){
        super(codigo, marca, modelo, costoHora);
        this.estabilizador=estabilizador;
        this.resolucionMaxima=resolucionMaxima;
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
