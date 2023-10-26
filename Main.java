import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarto las variables
        double radio;
        double lado1;
        double lado2;
        
        //pido al usuario los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de figura");
        String tipoFigura = sc.nextLine();

        //evaluo que tipo de figura ingreso
        if(tipoFigura.equals("Circulo") || tipoFigura.equals("circulo"))
        {
            //solicito el radio del circulo
            System.out.println("Ingrese el radio del circulo");
            radio = sc.nextInt();
            //llamo a la clase circulo con sus parametros
            Circulo circulo = new Circulo(tipoFigura, color, radio);
            System.out.println("Área del círculo: " + circulo.obtenerArea());
            System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
        }
        if(tipoFigura.equals("triangulo") || tipoFigura.equals("Triangulo"))
        {
            //solicito los valores del triangulo
            System.out.println("Ingrese el valor de la base del Triangulo");
            lado1 = sc.nextInt();
            System.out.println("Ingrese el valor de la altura del Triangulo");
            lado2 = sc.nextInt();
            //llamo a la clase triangulo con sus parametros
            Triangulo triangulo = new Triangulo(nombre, color, lado1, lado2);
            System.out.println("Área del triángulo: " + triangulo.obtenerArea());
            System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
        }
        if(tipoFigura.equals("rectangulo") || tipoFigura.equals("Rectangulo")){
            //solicito el ancho y largo del rectangulo
            System.out.println("Ingrese el ancho del rectangulo");
            lado1 = sc.nextInt();
            System.out.println("Ingrese el largo del rectangulo");
            lado2 = sc.nextInt();
            //llamo a la clase rectangulo con sus parametros
            Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);
            System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
            System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
        }

    }
}
