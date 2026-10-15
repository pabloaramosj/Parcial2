public class Camara extends ProductoAudioVisual{
    private String resolucionMaxima;
    private String estabilizador;

    Camara(String codigo, String marca, String modelo, double costoHora, String resolucionMaxima, String estabilizador){
        super(codigo, marca, modelo, costoHora);
        this.estabilizador=estabilizador;
        this.resolucionMaxima=resolucionMaxima;


    }
}
