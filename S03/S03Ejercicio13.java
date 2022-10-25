import java.util.Scanner;

public class S03Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la nota del primer examen: ");
    double nota1 = s.nextDouble();
    
    System.out.println("¿Qué nota quieres sacar?: ");
    double notaTotal = Double.parseDouble(System.console().readLine());
    
    double nota2  = ((notaTotal * 100) - (nota1 * 40))/60; 
    
    System.out.println("Para tener un " + notaTotal + " en el trimestre necesitas sacar un " + nota2 + "en el segundo examen ");
    
  }
}
