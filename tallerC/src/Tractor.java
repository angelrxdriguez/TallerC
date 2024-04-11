public class Tractor extends Vehiculo {
    public Tractor(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public String getTipo() {
        return "Tractor";
    }
}
