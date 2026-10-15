import javax.swing.*;

public class MainPixelRent {
    private static Empresa nuevaEmpresa;

    static void main() {
        //sisi

        nuevaEmpresa = new Empresa();

        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("===MENU PIXELRENT=== " +
                    "\n Seleccione una opcion:" +
                    "\n 1. Registrar Cliente." +
                    "\n 2. Mostrar mascotas" +
                    "\n 3. Buscar mascota por id" +
                    "\n 4. Actualizar mascota" +
                    "\n 5. Eliminar mascota" +
                    "\n 0. Salir del sistema"));

            switch (option) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

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
}
