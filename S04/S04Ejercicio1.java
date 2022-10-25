import java.util.Scanner;

public class S04Ejercicio1 {
	public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    
    System.out.println("Introduce el día de la semana");
    
    String día = s.nextLine();
    
    if (día.equals("lunes") || día.equals("Lunes")) {
      System.out.println("Ese día tienes a primera hora Base de datos");
    }
    
    if (día.equals("martes") || día.equals("Martes")) {
      System.out.println("Ese día tienes a primera hora Entornos de desarrollo");
    }
      
    if (día.equals("miércoles") || día.equals("Miércoles")) {
      System.out.println("Ese día tienes a primera hora Programación");
    }
    
    if (día.equals("jueves") || día.equals("Jueves")) {
      System.out.println("Ese día tienes a primera hora Entornos de desarrollo");
    }
    
    if (día.equals("viernes") || día.equals("Viernes")) {
      System.out.println("Ese día tienes a primera hora Base de datos");
    }
    
  if (!día.equals("lunes") && !día.equals("martes") && !día.equals("miércoles") && !día.equals("jueves") && !día.equals("viernes") ) {
    
    System.out.println("No reconoce el día");
    
  }
  
 }
}
  
 
	


