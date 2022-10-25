import java.util.Scanner;

public class S03Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base imponible: ");
    double baseImponible = s.nextDouble();
    
    System.out.print("Introduce el tipo de IVA( 1-general, 2-reducido, 3-superreducido): ");
    int IVA = Integer.parseInt(System.console().readLine());
    
    
    switch (IVA) {
      
      case 1:
      tipoDeIVA = "general ";
      IVA = baseImponible * 0.21;
      break;
      case 2:
      tipoDeIVA = "reducido ";
      IVA = baseImponible * 0.1;
      break;
      case 3:
      tipoDeIVA = "superreducido ";
      IVA = baseImponible * 0.04;
      break;
      default:
      tipoDeIVA = "no existe esa opción ";
    }
    
    System.out.print("Introduce el código promocional(1-nopro, 2-mitad, 3-meno5, 4-5porc: ");
    int código = Integer.parseInt(System.console().readLine());
    
    String tipoDeCódigo;
    
    switch (código) {
      
      case 1:
      tipoDeCódigo = "nopro ";
      código = IVA;
      break;
      case 2:
      tipoDeCódigo = "mitad ";
      código = IVA /2;
      break;
      case 3:
      tipoDeCódigo = "meno5 ";
      código = IVA - 5;
      break;
      case 4:
      tipoDeCódigo = "5porc ";
      código = (IVA - (IVA * 5 /100));
      break;
      
    }
  }
        
      

  
