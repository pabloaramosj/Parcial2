import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
  private static Empresa nuevaEmpresa;

  static void main() {

    nuevaEmpresa = new Empresa("DevPlus", "1102021", "Universidad del quindio", "305423444", "DevPlus.com");

    int option = 0;
    do {
      option = Integer.parseInt(JOptionPane.showInputDialog("Menu " + nuevaEmpresa.getNombre() + ": " +
              "\n Seleccione una opcion:" +
              "\n 1. Registrar equipos." +
              "\n 2. Registrar clientes. " +
              "\n 3. Registrar operadores." +
              "\n 4. Registrar reservas." +
              "\n 5. Agregar equipos a una reserva" +
              "\n 6. Equipos disponibles" +
              "\n 7. Reservas confirmadas" +
              "\n 8. Valor reserva" +
              "\n 9. Estado reserva" +

              "\n 0. Salir del sistema"));

      switch (option) {

        case 1:
          registrarEquipos();
          break;

        case 2:
          registrarClientes();
          break;

        case 3:
          registrarOperadores();
          break;

        case 4:
          registrarReservas();
          break;

        case 5:
          agregarEquiposReserva();
          break;

        case 6:
          mostarEquiposDisponibles();
          break;

        case 7:
          mostrarReservasConfirmadas();
          break;

        case 8:
          mostrarValorReserva();
          break;

        case 9:
          mostrarEstadoReserva();
          break;

        case 0:
          JOptionPane.showMessageDialog(null, "El programa finalizo");
          break;

        default:
          JOptionPane.showMessageDialog(null, "La opcion no es valida");
          break;
      }

    } while (option != 0);

  }

  //Registrar equipos
  public static void registrarEquipos() {
    int option = 0;
    do {
      option = Integer.parseInt(JOptionPane.showInputDialog("Menu productos: " +
              "\n Seleccione una opcion:" +
              "\n 1. Camara." +
              "\n 2. Dron. " +
              "\n 3. Kit de luces" +
              "\n 0. Volver al menu principal"));

      switch (option) {

        case 1:
          agregarCamara();
          break;
        case 2:
          agregarDron();
          break;
        case 3:
          agregarKitLuces();
          break;

        case 0:
          JOptionPane.showMessageDialog(null, "Volver al menu principal");
          break;

        default:
          JOptionPane.showMessageDialog(null, "La opcion no es valida");
          break;
      }

    } while (option != 0);

  }

  //ingresar informacion camara
  public static void agregarCamara() {
    String marca = JOptionPane.showInputDialog("Ingrese la marca de la camara:");
    String modelo = JOptionPane.showInputDialog("Ingrese el modelo de la camara:");
    String resolucionMaxima = JOptionPane.showInputDialog("Ingrese la resolucion maxima de la camara:");
    int respuesta = JOptionPane.showConfirmDialog(null, "¿La camara tiene estabilizador?", "Selecciona una opción", JOptionPane.YES_NO_OPTION);
    boolean estabilizardor = (respuesta == JOptionPane.YES_OPTION);
    boolean resultado = nuevaEmpresa.registrarCamara(null, marca, modelo, null, resolucionMaxima, estabilizardor);

    if (resultado) {
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    } else {
      JOptionPane.showMessageDialog(null, "No se hizo el registro");
    }
  }

  public static void agregarDron() {
    String marca = JOptionPane.showInputDialog("Ingrese la marca del dron:");
    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del dron:");
    String autonomia = JOptionPane.showInputDialog("Ingrese la autonomia del dron:");
    int respuesta = JOptionPane.showConfirmDialog(null, "¿el dron tiene bateria adicional?", "Selecciona una opción", JOptionPane.YES_NO_OPTION);
    boolean bateriaAdicional = (respuesta == JOptionPane.YES_OPTION);
    boolean resultado = nuevaEmpresa.registrarDron(null, marca, modelo, null, autonomia, bateriaAdicional);

    if (resultado) {
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    } else {
      JOptionPane.showMessageDialog(null, "No se hizo el registro");
    }
  }

  public static void agregarKitLuces() {
    String marca = JOptionPane.showInputDialog("Ingrese la marca del kit de luces:");
    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del kit de luces:");
    String cantidadLuces = JOptionPane.showInputDialog("Ingrese la cantidad de luces: ");
    int respuesta = JOptionPane.showConfirmDialog(null, "¿el kit tiene control inalambrico?", "Selecciona una opción", JOptionPane.YES_NO_OPTION);
    boolean controlInalambrico = (respuesta == JOptionPane.YES_OPTION);
    boolean resultado = nuevaEmpresa.registrarCamara(null, marca, modelo, null, cantidadLuces, controlInalambrico);

    if (resultado) {
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    } else {
      JOptionPane.showMessageDialog(null, "No se hizo el registro");
    }
  }

  //registrar clientes
  public static void registrarClientes() {
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
    String cedula = JOptionPane.showInputDialog("Ingrese cedula cliente: ");
    String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente: ");
    String correo = JOptionPane.showInputDialog("Ingrese corrreo electronico del cliente:");
    boolean resultado = nuevaEmpresa.registrarCliente(cedula, nombre, telefono, correo);
    if (resultado) {
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    } else {
      JOptionPane.showMessageDialog(null, "No se hizo el registro");
    }

  }

  //registrar clientes
  public static void registrarOperadores() {
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del operador:");
    String cedula = JOptionPane.showInputDialog("Ingrese cedula operador: ");
    String certificacion = JOptionPane.showInputDialog("Ingrese la certificacion del operador: ");
    String experiencia = JOptionPane.showInputDialog("Ingrese corrreo electronico del operador:");
    boolean resultado = nuevaEmpresa.registrarCliente(cedula, nombre, certificacion, experiencia);
    if (resultado) {
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    } else {
      JOptionPane.showMessageDialog(null, "No se hizo el registro");
    }

  }

  //Registrar reservas
  public static void registrarReservas() {
    int optionDocumento = 0;
    String documentoClienteSolicitante = "";
    do {
      documentoClienteSolicitante = JOptionPane.showInputDialog("Ingrese documento del cliente solicitante");
      int index = encontrarIndexCliente(documentoClienteSolicitante);
      if (index == 0) {
        JOptionPane.showMessageDialog(null, "El cliente no esta registrado");
      }
    } while (optionDocumento == 0);
    //seleccionar productos
    int optionProductos = 0;
    LocalDate fecha= LocalDate.ofEpochDay(12/12/1999);
    do {
      optionProductos = Integer.parseInt(JOptionPane.showInputDialog("Menu productos: " +
              "\n Seleccione una opcion:" +
              "\n 1. Seleccionar Camara." +
              "\n 2. Seleccionar Dron. " +
              "\n 3. Seleccionar Kit de luces" +
              "\n 0. Volver al menu principal"));

      switch (optionProductos) {

        case 1:
          mostrarCamaras();
          seleccionarCamaras(L);
          break;
        case 2:
          mostarDrones();
          break;
        case 3:
          mostrarKitLuces();
          break;

        case 0:
          JOptionPane.showMessageDialog(null, "Volver al menu principal");
          break;

        default:
          JOptionPane.showMessageDialog(null, "La opcion no es valida");
          break;
      }


    } while (optionProductos != 0);
    LocalDate fecha=ingresarFecha();

    boolean resultado = nuevaEmpresa.registrarReserva(documentoClienteSolicitante);
    if (resultado) {
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    } else {
      JOptionPane.showMessageDialog(null, "No se hizo el registro");
    }


  }
  public static void mostrarCamaras() {
    String mensaje = nuevaEmpresa.mostrarListCamaras();
    JOptionPane.showMessageDialog(null, mensaje);
  }
  public static void seleccionarCamaras() {
    String codigoCamara="";
    int optionCamara=0;
    do {
      codigoCamara = JOptionPane.showInputDialog("Ingrese codigo de la camara: ");
    }while (optionCamara==0);
  }


  public static int encontrarIndexCliente(String documentoClienteBusca) {
    for (int i = 0; i < Empresa.listCliente.length; i++) {
      if (Empresa.listCliente[i] != null && Empresa.listCliente[i].getCedula().equals(documentoClienteBusca)) {
        return i;
      }
    }
    return 0;
  }

  public static LocalDate ingresarFecha() {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fecha = null;
    boolean fechaValida = false;
    while (!fechaValida) {
      String input = JOptionPane.showInputDialog(null,
              "Ingresa una fecha (en formato DD/MM/AAAA):",
              "Entrada de Fecha",
              JOptionPane.QUESTION_MESSAGE);
      // Si el usuario presiona "Cancelar" o cierra la ventana
      if (input == null) {
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
        return null;
      }

      try {
        // Convertir el String a LocalDate
        fecha = LocalDate.parse(input, formato);
        fechaValida = true;
      } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null,
                "Formato inválido. Por favor, usa el formato DD/MM/AAAA.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
      }

    }
    return fecha;
  }

}
