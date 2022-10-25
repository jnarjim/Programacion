public class S03Ejercicio2 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduce el número de euros: ");
    linea = System.console().readLine();
    int numeroEuros;
    numeroEuros = Integer.parseInt ( linea );
    
    double total;
    total = (numeroEuros * 166.38);
    
    System.out.print("El número de pesetas es: " + total);
    
  }
}
