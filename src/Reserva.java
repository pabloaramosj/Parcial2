import java.time.LocalDate;

public class Reserva {
    private String codigoReserva;
    private LocalDate fechaUso;
    private Turno turno;
    private SituacionProceso situacionProceso;
    private Cliente[] listCliente;
    private Operador[]listOperadores;
    private Camara[] listCamaras;
    private Dron[] listDrones;
    private KitLuces[] listKitLuces;

    Reserva(String codigoReserva, LocalDate fechaUso){
        this.codigoReserva=codigoReserva;
        this.fechaUso=fechaUso;
        situacionProceso=SituacionProceso.SOLICITADA;
        turno=Turno.MANANA;
        listCliente=new Cliente[10];
        listOperadores=new Operador[10];
        listCamaras=new Camara[10];
        listDrones=new Dron[10];
        listKitLuces=new KitLuces[10];

    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public LocalDate getFechaUso() {
        return fechaUso;
    }

    public void setFechaUso(LocalDate fechaUso) {
        this.fechaUso = fechaUso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public SituacionProceso getSituacionProceso() {
        return situacionProceso;
    }

    public void setSituacionProceso(SituacionProceso situacionProceso) {
        this.situacionProceso = situacionProceso;
    }
}
//