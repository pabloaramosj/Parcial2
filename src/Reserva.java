import java.time.LocalDate;

public class Reserva {
    private String codigoReserva;
    private LocalDate fechaUso;
    private Turno turno;

    Reserva(String codigoReserva, LocalDate fechaUso){
        this.codigoReserva=codigoReserva;

        turno=Turno.MANANA;
    }



    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
