public class Vehiculo {
    protected String matricula;
    protected String color;
    protected String marca;

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return "Vehículo";
    }
}
