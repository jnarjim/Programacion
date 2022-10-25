public class S03Ejercicio3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduce el número de pesetas: ");
    linea = System.console().readLine();
    int numeroPesetas;
    numeroPesetas = Integer.parseInt ( linea );
    
    double total;
    total = (numeroPesetas * 0.006);
    
    System.out.print("El número de euros es: " + total);
    
  }
}
