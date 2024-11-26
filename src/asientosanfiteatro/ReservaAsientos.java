
package asientosanfiteatro;

import java.util.Scanner;


public class ReservaAsientos {
    
    public static void main(String[] args) {
        
        char asientos [][] = new char [10][10];
        int fila=0, asiento=0;
        Boolean bandera = false;
        Boolean bandera2= false;
        String resp, resp2;
        Scanner teclado = new Scanner(System.in);      
        
        
        for (int f=0;f<10;f++){
            for(int c=0;c<10;c++){
                asientos[f][c] = 'L';
            }
        }
        
        System.out.println("-------Bienvenido al sistema de reservas-------");
        
        
        while(bandera!=true){
        System.out.println("Desea ver los asientos disponibles? S/N");
        resp2 = teclado.next();
        
        if (resp2.equalsIgnoreCase("S")){
            dibujarMapa(asientos);
        }
        
        while(bandera2!=true){
        System.out.println("Ingrese fila y asiento a reservar: ");
        System.out.print("Fila (entre 0 y 9): ");
        fila = teclado.nextInt();
        System.out.print("Asiento (entre 0 y 9): ");
        asiento = teclado.nextInt();
        
        if (fila<= 9 && fila >= 0){
            if(asiento <=9 && asiento>=0){
                bandera2 = true;
            }else{
            System.out.println("El numero de asiento no es valido.");
        }
        } else{
            System.out.println("El numero de fila no es valido.");
        }
        
        }
       if(asientos[fila][asiento] == 'L'){
           asientos[fila][asiento] = 'X';
           System.out.println("El asiento fue reserado con exito.");
           
       } else{
           System.out.println("El asiento seleccionado esta ocupado, por favor elija otro.");
       }
       
           System.out.println("Desea reservar mas asientos? S/N");
           resp = teclado.next();
           
           if(resp.equalsIgnoreCase("N")){
               bandera = true;
           }
        }
    }
    


   static void dibujarMapa(char asientos[][]){
         for (int f=0;f<10;f++){
             System.out.print(f +"");
            for(int c=0;c<10;c++){
                
                System.out.print("[" + asientos[f][c] + "]");
            }
            
             System.out.println("");
        }
               
     } 
        
}
