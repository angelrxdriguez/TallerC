public class Moto extends Vehiculo {
    public Moto(String matricula, String color, String marca) {
        super(matricula, color, marca);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
