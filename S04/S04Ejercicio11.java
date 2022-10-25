import java.util.Scanner;

public class S04Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca una hora del día, ");
    System.out.println("y luego los minutos.");
    
    System.out.print("hora: ");
    int hora = s.nextInt();  
    
    System.out.print("minuto: ");
    int minuto = s.nextInt();

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, segundosHastaMedianoche);
  }
}
  
