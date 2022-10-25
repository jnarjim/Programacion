import java.util.Scanner;

public class S03Ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.printf("Introduce la base imponible: ");
    double baseImponible = s.nextDouble();
    
    double factura = baseImponible * 0.21;
    
    double total = baseImponible * 1.21;
    System.out.println("El total es: " + total);
    
  }
}
    
    
