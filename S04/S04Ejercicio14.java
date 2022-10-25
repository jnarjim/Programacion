import java.util.Scanner;

public class S04Ejercicio14 {
  public static void main(String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el número");
    
    int a = s.nextInt();
    
    if (a%2 == 0) {
      System.out.println("El número es par");
    } else System.out.println("El número es impar");
    
    if (a%5 == 0) {
      System.out.println("El número es múltiplo de 5");
    } else System.out.println("El número no es múltiplo de 5");
    
  }
}
    
