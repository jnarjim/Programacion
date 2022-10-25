public class S03Ejercicio4 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduce un número: ");
    linea = System.console().readLine(); 
    int primerNúmero;
    primerNúmero = Integer.parseInt ( linea );
    
    System.out.print("Introduce otro número: ");
    linea = System.console().readLine();
    int segundoNúmero;
    segundoNúmero = Integer.parseInt ( linea );
    
    int suma;
    suma = (primerNúmero + segundoNúmero);
    
    System.out.println(" La suma de ambos números es: " + suma); 
    
    int resta;
    resta = (primerNúmero - segundoNúmero);
    
    System.out.println(" La resta de ambos números es: " + resta);
    
    int multiplicación;
    multiplicación = (primerNúmero * segundoNúmero);
    
    System.out.println(" La multiplicación de ambos números es: " + multiplicación);
    
    double división;
    división = (primerNúmero / segundoNúmero);
    
    System.out.println(" La división de ambos números es: " + división);
    
  }
}
    
    
