import java.util.LinkedList;

public class Cliente extends Persona{
    private String telefono;
    private String correoElectronico;
    private Cliente[] listCliente;
    Cliente (String nombreCompleto, String identificacion,String telefono, String correoElectronico){
        super(nombreCompleto,identificacion);
        this.telefono=telefono;
        this.correoElectronico=correoElectronico;
        listCliente=new Cliente[10];
        listCliente[0]=new Cliente("Juan Ramos","111","310","JuanR@com");
        listCliente[1]=new Cliente("Alejandro Piñeros","222","311","Alejandro@com");
        listCliente[2]=new Cliente("Santiago Yepez","333","312","SantiagoY@com");
        listCliente[3]=new Cliente("Miguel Heras", "444", "313","MiguelH@com");
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

    public Cliente[] getListCliente() {
        return listCliente;
    }

    public void setListCliente(Cliente[] listCliente) {
        this.listCliente = listCliente;
    }
}
//