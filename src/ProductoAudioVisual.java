public abstract class ProductoAudioVisual {
        protected String codigo;
        protected String marca;
        protected String modelo;
        protected double costoHora;
        protected Disponibilidad disponibilidad;

        ProductoAudioVisual(String codigo, String marca, String modelo, double costoHora){
            this.codigo=codigo;
            this.marca=marca;
            this.modelo=modelo;
            this.costoHora=costoHora;
            disponibilidad=Disponibilidad.DISPONIBLE;
        }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
//