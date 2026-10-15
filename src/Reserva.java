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

//sisisi

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
