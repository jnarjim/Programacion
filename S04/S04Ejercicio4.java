import java.util.Scanner;

public class S04Ejercicio4 {
	public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    
    System.out.println("Introduce el número de horas");
    
    int horas = s.nextInt();
    
    if (horas <=40) {
      System.out.println("La paga total es de " + (horas * 12));
    }
    
    if (horas >=41) { 
      System.out.println("La paga total es de " + ((horas - 40) * 16 + 40 * 12 ) + " euros");
    }
    
  }
}
