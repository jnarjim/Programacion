import java.util.Scanner;

public class S03Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce longitud de la base (cm): ");
    double base = s.nextDouble();
    
    System.out.print("Introduce altura (cm): ");
    double altura = s.nextDouble();
    
    double área = (base * altura) /2;
    
    System.out.println("El área del triángulo es: " + área);
    
  }
}
