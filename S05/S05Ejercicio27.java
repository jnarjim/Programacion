public class S05Ejercicio27 {
  public static void main(String[] args) {
      
    System.out.print("Introduzca un número mayor que 1: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("| Desde 1 hasta " + numeroIntroducido + " hay " + cuenta + " múltiplos de 3. ");
    System.out.print("Su suma es: " + suma);
    
  }
}
