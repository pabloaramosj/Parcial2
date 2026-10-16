public class Operador extends Persona{
    private String certificado;
    private String experiencia;
    private Operador[]listOperadores;
    Operador(String nombreCompleto, String identificacion, String certificado, String experiencia) {
        super(nombreCompleto, identificacion);
        this.certificado=certificado;
        this.experiencia=experiencia;
        listOperadores=new Operador[10];
        listOperadores[0]=new Operador("Jhon Perez","OP001","Magister","3 años");
        listOperadores[1]=new Operador("Jorge Mosos","OP002","Senior","5 años");
        listOperadores[2]=new Operador("Tomas Jaramillo","OP003","Master","6 años");
        listOperadores[3]=new Operador("Samuel Arcila","OP004","Magistral","9 años");
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
//s