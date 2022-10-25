import java.util.Scanner;

public class S04Ejercicio18 {
  public static void main(String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numero;
    
    System.out.print("Ingrese un número: ");
    numero = s.nextInt();
    
    if(numero >= 10000)
    System.out.print("El primer dígito de la cifra es: " + numero /10000);
    
    else if(numero >= 1000)
    System.out.print("El primer dígito de la cifra es: " + numero /1000); 
    
    else if(numero >= 100)
    System.out.print("El primer dígito de la cifra es: " + numero /100);
    
    else if(numero >= 10)
    System.out.print("El primer dígito de la cifra es: " + numero /10);
    
    else 
    System.out.print("El número es de un dígito: " + numero);
    
  }
}
