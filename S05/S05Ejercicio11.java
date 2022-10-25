public class S05Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número: ");
    
   int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.println(" número | cuadrado | cubo ");
    
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      
      System.out.printf(" %5d  | %8d | %8d\n", i, i*i, i*i*i);
      
    }
  }
}
