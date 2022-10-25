import java.util.Scanner;

public class S03Ejercicio9 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.printf("Introduce el radio del cono (cm): ");
    double radio = s.nextDouble();
    
    System.out.printf("Introduce la altura del cono(cm): ");
    double altura = s.nextDouble();
    
    double pi = 3.14;
    
    double área = ((radio * radio) * pi * altura) /3;
    
    System.out.printf("El volumen del cono es %.2f (cm³): ", área);
    
  }
}
    
  
