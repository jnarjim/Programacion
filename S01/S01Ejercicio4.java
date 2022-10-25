public class S01Ejercicio4 {
  public static void main(String[] args) {
    
   String rojo = "\033[31m";
   String verde = "\033[32m";
   String naranja = "\033[33m";
   String azul = "\033[34m";
   String morado = "\033[35m";
   String blanco = "\033[37m";
    
    System.out.println(azul + "BDA " + verde + "EDS " + rojo + "PRG " + verde + "EDS " + azul + "BDA ");
    System.out.println(azul + "BDA " + verde + "EDS " + rojo + "PRG " + rojo + "PRG " + azul + "BDA ");
    System.out.println(morado + "ING " + rojo + "PRG " + rojo + "PRG " + rojo + "PRG " + naranja + "SIN ");
    System.out.println(naranja + "FOL " + rojo + "PRG " + morado + "ING " + rojo + "PRG " + naranja + "SIN ");
    System.out.println(naranja + "FOL " + morado + "LMS " + naranja + "SIN " + naranja + "SIN " + morado + "LMS ");
    System.out.println(naranja + "FOL " + morado + "LMS " + naranja + "SIN " + naranja + "SIN " + morado + "LMS ");
    
  }
}
    
    
