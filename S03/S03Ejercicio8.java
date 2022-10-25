import java.util.Scanner;

public class S03Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.printf("Introduce el número de horas trabajadas: ");
    double horas = s.nextDouble();
    
    double total = horas * 12;
    
    System.out.println("El número de euros que gana trabajando es: " + total);
    
  }
}
    
