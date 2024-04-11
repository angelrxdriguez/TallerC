public class Camion extends Vehiculo {
    public Camion(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public String getTipo() {
        return "Camión";
    }
}