import java.util.Scanner;

public class S03Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número de Kb: ");
    double kb = s.nextDouble();
    
    double total = kb * 0.001;
    
    System.out.println("El número de Mb es: " + total);
    
  }
}
