import java.util.Scanner;

public class S04Ejercicio7y8 {
	public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    
    System.out.println("Introduce la primera nota");
    double a = s.nextDouble();
    System.out.println("Introduce la segunda nota");
    double b = s.nextDouble();
    System.out.println("Introduce la tercera nota");
    double c = s.nextDouble();
    
    double media = (a + b + c)/3;
    System.out.println("La media es = " + media);
    
    if ( media <5 ) {
      System.out.println("Tienes un insuficiente");
    }
    if ( media ==5 ) {
      System.out.println("Tienes un suficiente");
    }
     if ( media >=5 && media < 7 ) {
      System.out.println("Tienes un bien");
    }
     if ( media >=7 && media < 9) {
      System.out.println("Tienes un notable");
    }
     if ( media > 9 ) {
      System.out.println("Tienes un sobresaliente");
    }
    
    
  }
}
      
    
