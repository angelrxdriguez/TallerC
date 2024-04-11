public class Grua extends Vehiculo {
    public Grua(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public String getTipo() {
        return "Grúa";
    }
}
