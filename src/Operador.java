public class Operador extends Persona{
    private String certificado;
    private String experiencia;

    Operador(String nombreCompleto, String identificacion, String certificado, String experiencia) {
        super(nombreCompleto, identificacion);
        this.certificado=certificado;
        this.experiencia=experiencia;
    }
}
