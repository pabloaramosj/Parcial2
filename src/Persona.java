public abstract class Persona  {
    protected String nombreCompleto;
    protected String identificacion;
    Persona(String nombreCompleto, String identificacion){
        this.nombreCompleto=nombreCompleto;
        this.identificacion=identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


}
//