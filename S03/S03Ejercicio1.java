public class Ejercicio1Tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Por favor introduce un número: ");
    linea = System.console().readLine(); 
    int primerNúmero;
    primerNúmero = Integer.parseInt( linea );
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNúmero;
    segundoNúmero = Integer.parseInt( linea );
    
    int total;
    total = primerNúmero * segundoNúmero;
    
    System.out.print("El primer número introducido es " + primerNúmero); 
    System.out.println(" y el segundo es " + segundoNúmero);
    System.out.print("El resultado de la multiplicación es " + total);
  }
}
