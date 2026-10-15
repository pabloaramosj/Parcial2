public class Cliente extends Persona{
    private String telefono;
    private String correoElectronico;

    Cliente (String nombreCompleto, String identificacion,String telefono, String correoElectronico){
        super(nombreCompleto,identificacion);
        this.telefono=telefono;
        this.correoElectronico=correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
