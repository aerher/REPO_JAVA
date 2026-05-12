import java.util.Scanner;
public class Arearectangulo {


    public void calcularArea() {
        Scanner scanner = new Scanner(System.in); // para que pueda scanear cualquier valor digitado por el usuario
        System.out.print("Ingrese la base del rectángulo: "); // para imprimir a la consola 

        double base = scanner.nextDouble(); // una forma para que el usuario pueda ingresar valores a la consola 
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble(); // para ingresar valores a la consola  
        double area = base * altura;  // definimos una funcion 
        System.out.println("El área del rectángulo es: " + area);
        
    }
}
