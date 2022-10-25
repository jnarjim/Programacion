import java.util.Scanner;

public class S04Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int día, mes;
    System.out.println("Ingrese el mes de nacimiento (número):"
                + "\n1-Enero"
                + "\n2-Febrero"
                + "\n3-Marzo"
                + "\n4-Abril"
                + "\n5-Mayo"
                + "\n6-Junio"
                + "\n7-Julio"
                + "\n8-Agosto"
                + "\n9-Septiembre"
                + "\n10-Octubre"
                + "\n11-Noviembre"
                + "\n12-Diciembre");
    mes = s.nextInt();
   System.out.println("");
   System.out.println("Ingrese el día (número) en el que nació (febrero tiene 28 días)");
   día = s.nextInt();
             if ( (día >= 21 && mes ==3) || (día <= 20 && mes == 4) ){
               System.out.println("Su signo es Aries");
             }
             else{
             if ( (día >= 21 && mes ==4) || (día <= 20 && mes == 5) ){
               System.out.println("Su signo es Tauro");
             }
             else{
            if ( (día >= 21 && mes ==5) || (día <= 20 && mes == 6) ){
               System.out.println("Su signo es Géminis");
             }
             else{
             if ( (día >= 21 && mes ==6) || (día <= 20 && mes == 7) ){
               System.out.println("Su signo es Cáncer");
             }
            else{
             if ( (día >= 21 && mes ==7) || (día <= 20 && mes == 8) ){
              System.out.println("Su signo es Leo");
             }
            else{
             if ( (día >= 21 && mes ==8) || (día <= 20 && mes == 9) ){
              System.out.println("Su signo es Virgo");
             }
            else{
             if ( (día >= 21 && mes ==9) || (día <= 20 && mes == 10) ){
              System.out.println("Su signo es Libra");
             }
            else{
             if ( (día >= 21 && mes ==10) || (día <= 20 && mes == 11) ){
              System.out.println("Su signo es Escorpio");
             }
            else{
             if ( (día >= 21 && mes ==11) || (día <= 20 && mes == 12) ){
             System.out.println("Su signo es Sagitario");
             }
            else{
            if ( (día >= 21 && mes ==12) || (día <= 20 && mes == 1) ){
             System.out.println("Su signo es Capricornio");
             }
            else{
            if ( (día >= 21 && mes ==1) || (día <= 20 && mes == 2) ){
             System.out.println("Su signo es Acuario");
             }
            else{
            if ( (día >= 21 && mes ==2) || (día <= 20 && mes == 3) ){
            System.out.println("Su signo es Piscis");
            }
          }
        }
      }
    }
  }
}
}
}
}
}
}

}
}
          
   
 











 

    
                
