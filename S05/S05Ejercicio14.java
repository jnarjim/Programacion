public class S05Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("Introduce el valor de la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el expnonente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int potencia = 1;
    
    if (exponente == 0) {
    potencia = 1;
  }
  
    if (exponente > 0) {
    for (int i = 0; i < exponente; i++) {
      potencia *= base;
    }
  } 
    if (exponente < 0) { 
    for (int i = 0; i < -exponente; i++) {
      potencia *= base;
    }
      
    potencia = 1/potencia;
  }
  
    System.out.println(base + "^" + exponente + "=" + potencia);
  
}
}
  

    
