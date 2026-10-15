public class ProductoAudioVisual {
        private String codigo;
        private String marca;
        private String modelo;
        private double costoHora;
        private Disponibilidad disponibilidad;

        ProductoAudioVisual(String codigo, String marca, String modelo, double costoHora){
            this.codigo=codigo;
            this.marca=marca;
            this.modelo=modelo;
            this.costoHora=costoHora;
            disponibilidad=Disponibilidad.DISPONIBLE;
        }
}
