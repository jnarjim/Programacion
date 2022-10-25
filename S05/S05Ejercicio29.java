public class S05Ejercicio29 {
  public static void main(String[] args) {

    System.out.print("Introduzca un número entero positivo (relativamente grande): ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca otro número (relativamente pequeño): ");
    int numeroPequeño = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeño + " son los siguientes:");

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeño) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
