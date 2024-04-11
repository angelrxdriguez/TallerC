import javax.swing.JOptionPane;

// Clase principal del taller
public class Taller {

    // Método para controlar la entrada de un vehículo al taller
    public static void entradaVehiculo() {
        String[] tiposVehiculos = {"Coche", "Moto", "Camión", "Tractor", "Grua"};
        int tipoSeleccionado = JOptionPane.showOptionDialog(null, "Selecciona el tipo de vehículo:", "Entrada de Vehículo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiposVehiculos, tiposVehiculos[0]);
        if (tipoSeleccionado != -1) {
            String matricula = JOptionPane.showInputDialog("Introduce la matrícula del vehículo:");
            String color = JOptionPane.showInputDialog("Introduce el color del vehículo:");
            String marca = JOptionPane.showInputDialog("Introduce la marca del vehículo:");
            Vehiculo vehiculo = crearVehiculo(tiposVehiculos[tipoSeleccionado], matricula, color, marca);
            JOptionPane.showMessageDialog(null, "Vehículo ingresado al taller:\n" +
                    "Tipo: " + vehiculo.getTipo() + "\n" +
                    "Matrícula: " + vehiculo.getMatricula() + "\n" +
                    "Color: " + vehiculo.getColor() + "\n" +
                    "Marca: " + vehiculo.getMarca());
        }
    }

    // Método para crear un objeto de vehículo según el tipo seleccionado
    private static Vehiculo crearVehiculo(String tipo, String matricula, String color, String marca) {
        switch (tipo) {
            case "Coche":
                return new Coche(matricula, color, marca);
            case "Moto":
                return new Moto(matricula, color, marca);
            case "Camión":
                return new Camion(matricula, color, marca);
            case "Tractor":
                return new Tractor(matricula, color, marca);
            case "Grua":
                return new Grua(matricula, color, marca);
            default:
                return null;
        }
    }

    // Método para realizar una reparación de vehículo
    public static void reparacionVehiculo() {
        String[] piezas = {"Frenos", "Motor", "Suspensión"};
        int piezaSeleccionada = JOptionPane.showOptionDialog(null, "Selecciona una pieza para reparar:", "Reparación de Vehículo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, piezas, piezas[0]);
        if (piezaSeleccionada != -1) {
            double presupuesto = obtenerPresupuestoPorPieza(piezas[piezaSeleccionada]);
            JOptionPane.showMessageDialog(null, "Presupuesto para reparación de " + piezas[piezaSeleccionada] + ": $" + presupuesto);
        }
    }

    // Método para obtener el presupuesto por defecto según la pieza seleccionada
    private static double obtenerPresupuestoPorPieza(String pieza) {
        // Aquí puedes definir el presupuesto por defecto para cada pieza
        // En este ejemplo, asignamos un presupuesto fijo para todas las piezas
        double presupuesto = 0;
        switch (pieza) {
            case "Frenos":
                presupuesto = 200;
                break;
            case "Motor":
                presupuesto = 500;
                break;
            case "Suspensión":
                presupuesto = 300;
                break;
        }
        return presupuesto;
    }

    public static void main(String[] args) {
        String[] opcionesMenu = {"Entrada de Vehículo", "Reparación de Vehículo", "Salir"};
        while (true) {
            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);
            switch (opcionSeleccionada) {
                case 0:
                    entradaVehiculo();
                    break;
                case 1:
                    reparacionVehiculo();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio. Hasta luego.");
                    System.exit(0);
            }
        }
    }
}
