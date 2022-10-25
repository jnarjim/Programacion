import java.util.Scanner;

public class S04Ejercicio20 {
  public static void main(String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el número ");
    
    int a = s.nextInt();
    
    if (a <=9) {
      System.out.println("es capicúa");
    }
    
    if (a >9 && a <100) {
      int aa = a/10;
      int bb = a - (aa*10);
      
    if (aa == bb) {
      
      System.out.println("es capicúa");
    } else System.out.println("no es capicúa");
    
    }
    if (a >99 && a < 1000) { 
      int aa = a/100;;
      int bb = (a - (aa*100))/10;
      int cc = a - aa*100 - bb*10;
      
    if (aa == cc) {
      
      System.out.println("es capicúa");
   } else System.out.println("no es capicúa");
   
   }
   if (a >999 && a < 10000) {
     int aa = a/1000;
     int bb = (a - aa*1000)/100;
     int cc = ((aa *100) - (bb *100))/10;
     int dd = a - aa*1000 - bb*100 - cc*10;
     
    if (aa == dd && bb == dd) {
      
      System.out.println("es capicúa");
   } else System.out.println("no es capicúa");
     
   }
   if (a >9999 && a < 100000 ) {
     int aa = a /10000;
     int bb = (a - (aa*10000))/1000;
     int cc = (a - (aa *10000) - (bb*1000))/100;
     int dd = (a - (aa *10000) - (bb*1000) - (cc*100))/10;
     int ee = (a - (aa *10000) - (bb*1000) - (cc*100) - (dd*10));
     
    if (aa == ee && bb == dd) {
      
      System.out.println("es capicúa");
   } else System.out.println("no es capicúa");
   
   }
     
    
   }
 }
   
