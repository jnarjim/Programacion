public class S05Ejercicio21 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca números enteros, para parar ponga un número negativo");

    int numeroIntroducido;
    int numeroDeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    int media = 0;

     for (int num = 0; num >= 0;){
            System.out.println("Introduce un número");
            num = Integer.parseInt(System.console().readLine());
            if (num > 0){
                numeroDeElementos++;
            }
            if ((num % 2 != 0) && (num > 0)){
                sumaImpares++;
                numeroDeElementosImpares= numeroDeElementosImpares+num;
            } else{
                if (num > maximoPar){
                    maximoPar = num;
                }
            }
        }
        media = numeroDeElementosImpares/sumaImpares;
        System.out.println("Se han introducido " + numeroDeElementos + " números");
        System.out.println("La media de los números impares ha sido " + media);
        System.out.println("El mayor numero par ha sido " + maximoPar);
    }
}
