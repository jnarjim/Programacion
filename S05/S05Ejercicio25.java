public class S05Ejercicio25 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número:");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.print("El número volteado es: " + volteado);
  }
}

 
