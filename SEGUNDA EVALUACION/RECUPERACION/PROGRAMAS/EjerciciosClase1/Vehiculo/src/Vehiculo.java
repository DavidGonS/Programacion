public class Vehiculo {
    private String tipo;
    private double velocidadMxima;
    private String color;
    private String matricula;

    public Vehiculo(String tipo, double velocidsadMxima, String color, String matricula) {
        this.tipo = tipo;
        this.velocidadMxima = velocidsadMxima;
        this.color = color;
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidadMxima() {
        return velocidadMxima;
    }

    public void setVelocidadMxima(double velocidadMxima) {
        this.velocidadMxima = velocidadMxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
