public class Empresa {
    private String nombre;
    private String nit;
    private String direccion;
    private Cliente[] listCliente;
    private Operador[] listOperadores;
    private Camara[] listCamaras;
    private Dron[] listDrones;
    private KitLuces[]listKitLuces;
    Empresa(String nombre, String nit, String direccion){
        this.nombre=nombre;
        this.nit=nit;
        this.direccion=direccion;
        listCliente=new Cliente[10];
        listCliente[0]=new Cliente("Juan Ramos","111","310","JuanR@com");
        listCliente[1]=new Cliente("Alejandro Piñeros","222","311","Alejandro@com");
        listCliente[2]=new Cliente("Santiago Yepez","333","312","SantiagoY@com");
        listCliente[3]=new Cliente("Miguel Heras", "444", "313","MiguelH@com");
        listOperadores=new Operador[10];
        listOperadores[0]=new Operador("Jhon Perez","OP001","Magister","3 años");
        listOperadores[1]=new Operador("Jorge Mosos","OP002","Senior","5 años");
        listOperadores[2]=new Operador("Tomas Jaramillo","OP003","Master","6 años");
        listOperadores[3]=new Operador("Samuel Arcila","OP004","Magistral","9 años");
        listCamaras=new Camara[10];
        listCamaras[0]=new Camara("C0","Sony","2025",12.000,"90 minutos",true);
        listCamaras[1]=new Camara("C1","Nikon","2026",12.000,"90 minutos",false);
        listCamaras[2]=new Camara("C2","Kodak","2025",12.000,"90 minutos",true);
        listCamaras[3]=new Camara("C3","Panasonic","2026",12.000,"90 minutos",false);
        listDrones=new Dron[10];
        listDrones[0]=new Dron("D0","DJI","2025",18.000,"90 minutos",true);
        listDrones[1]=new Dron("D1","Autel","2026",18.000,"90 minutos",false);
        listDrones[2]=new Dron("D2","Skydio","2025",18.000,"90 minutos",true);
        listDrones[3]=new Dron("D3","Parrot","2026",18.000,"90 minutos",false);
        listKitLuces=new KitLuces[10];
        listKitLuces[0]=new KitLuces("K0","Ilumax","2025",10.000,"200 leds",true);
        listKitLuces[1]=new KitLuces("K1","Philips","2026",10.000,"200 leds",false);
        listKitLuces[2]=new KitLuces("K2","Osram","2025",10.000,"200 leds",true);
        listKitLuces[3]=new KitLuces("K3","Leviton","2026",10.000,"200 leds",false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}