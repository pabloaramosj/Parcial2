import java.time.LocalDate;

public class Reserva {
    private String codigoReserva;
    private LocalDate fechaUso;
    private Turno turno;
    private SituacionProceso situacionProceso;

    Reserva(String codigoReserva, LocalDate fechaUso){
        this.codigoReserva=codigoReserva;

        situacionProceso=SituacionProceso.SOLICITADA;
        turno=Turno.MANANA;
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
