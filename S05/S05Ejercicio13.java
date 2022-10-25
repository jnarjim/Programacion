public class S05Ejercicio13 { 
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    
    int cifras = Integer.parseInt(System.console().readLine());
    int numCifras = 10;
    int numPositivos = 0;
    int numNegativos = 0;
    
    for (int cont = 0; cont < numCifras; cont++); {
    
    if (cifras > 0) {
      numPositivos ++;
    } else {
      numNegativos ++;
    }
  }
    System.out.println("Hay " + numPositivos + " números positivos y " + numNegativos + " negativos ");
    
  }
}

