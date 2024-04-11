public class Coche extends Vehiculo {
    public Coche(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public String getTipo() {
        return "Coche";
    }
}
