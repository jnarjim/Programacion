import java.util.Scanner;

public class S04Ejercicio2 {
	public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    
    System.out.println("Introduce la hora del día");
    
    int hora = s.nextInt();
    
  if (hora >=6 && hora <=12 ) {
    System.out.println("buenos días");
  }
  
  if (hora >=13 && hora <=20 ) {
    System.out.println("buenas tardes");
  }
  
  if (hora >=21 && hora <=24 ) {
    System.out.println("buenas noches");
  }
  
  if (hora >=0 && hora <=5 ) {
    System.out.println("buenas noches");
  }
  
}
}
  
  
