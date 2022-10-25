public class S05Ejercicio18 {
  public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    
    do {
      System.out.print("Introduzca un número: ");
      primerNumero = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca otro número distinto al anterior: ");
      segundoNumero = Integer.parseInt(System.console().readLine());
      
      if(primerNumero == segundoNumero) {
        System.out.print("Los números introducidos no son válidos, deben de ser distintos ");
      }
    } while (primerNumero == segundoNumero);
    
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
  }
}
