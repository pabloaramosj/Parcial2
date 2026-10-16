public class Operador extends Persona{
    private String certificado;
    private String experiencia;
    private Operador[]listOperadores;
    Operador(String nombreCompleto, String identificacion, String certificado, String experiencia) {
        super(nombreCompleto, identificacion);
        this.certificado=certificado;
        this.experiencia=experiencia;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
//