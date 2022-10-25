import java.util.Scanner;

public class S04Ejercicio13 {
  public static void main(String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    int n1, n2, n3, Mayor = 0, Medio, Menor = 0;
    
    System.out.println("Dados 3 números se ordenarán en orden ascendente");
    System.out.println("Ingrese el primer número");
    n1 = s.nextInt();
    System.out.println("Ingrese el segundo número");
    n2 = s.nextInt();
    System.out.println("Ingrese el tercer número");
    n3 = s.nextInt();
    
    if (n1 > n2 && n1 > n3) {
      Mayor = n1;
    } else if (n2 > n1 && n2 > n3) {
      Mayor = n2;
    } else if (n3 > n1 && n3 > n2) {
      Mayor = n3;
    }
    
    if (n1 < n2 && n1 < n3) {
      Menor = n1;
    } else if (n2 < n1 && n2 < n3) {
      Menor = n2;
    } else if (n3 < n1 && n3 < n2) {
      Menor = n3;
    }
    
    Medio = (n1 + n2 + n3) - (Mayor + Menor);
    System.out.println("");
    System.out.println("el orden ascendente de los números es: ");
    System.out.println(Menor + " " + Medio + " " + Mayor);
    
  }
}
      
    
