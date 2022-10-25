import java.util.Scanner;

public class S04Ejercicio3 {
	public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    
    System.out.println("Introduce un día de las semana (número)");
    
    int día = s.nextInt();
    
    if (día == 1) {
      System.out.println("Lunes");
    }
     if (día == 2) {
      System.out.println("Martes");
    }
    if (día == 3) {
      System.out.println("Miércoles");
    }
    if (día == 4) {
      System.out.println("Jueves");
    }
    if (día == 5) {
      System.out.println("Viernes");
    }
     if (día == 6) {
      System.out.println("Sábado");
    }
     if (día == 7) {
      System.out.println("Domingo");
    }
     if (día >=8) {
      System.out.println("Ese día no existe");
    }
    
  }
}
