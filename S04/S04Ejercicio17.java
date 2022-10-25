import java.util.Scanner;

public class S04Ejercicio17 {
  public static void main(String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    int iNumero;
    
    System.out.println("Introduce un número: ");
    iNumero = s.nextInt();
    
    int iUltimoDigito;
    iUltimoDigito = iNumero %10;
    
    System.out.println("El último dígito de " + iNumero + " es " + iUltimoDigito);
    
  }
}
