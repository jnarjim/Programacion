import java.util.Scanner;

public class S03Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número de Mb: ");
    double mb = s.nextDouble();
    
    double total = mb * 1000; 
    
    System.out.println("El número de Kb es: " + total);
    
  }
}
