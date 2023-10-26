public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    // Uso del método para obtener el área
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    // Uso del método para obtener el perímetro
    // dada las instrucciones del quiz, se asumirta que es un triangulo equilatero, ya que solo se le pide al usuario la base y la altura
    @Override
    public double obtenerPerimetro() {
        return 3 * base;
    }
}
