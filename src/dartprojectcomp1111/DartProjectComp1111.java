/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartprojectcomp1111;

import java.util.Scanner;

/**
 *
 * @author emrec
 */
public class DartProjectComp1111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        System.out.println("DART GAME!");
        System.out.println("Enter the number of darts to be thrown:");
        int times = scn.nextInt();
        System.out.println("");

        int i = 1;
         double a = 0;
          double b = 0;
           double c = 0;
            double d = 0;
             double e = 0;
              double f = 0;
        
        
       
        while (i <= times) {
            double random_x =  (int) ((Math.random() * 4.01 - 2) * 10);
            double random_y = (int) ((Math.random() * 4.01 - 2) * 10);
            System.out.println("Dart " + i + ":");
            
            double x = random_x/10;
            double y = random_y/10 ;

            System.out.println("Coordinates: (" + x + ", " + y + ")");
                        
            if (x < 0 & y > 0 ) {
                System.out.println("Region: A");
                a++;
               
            } else if (x > 0 & y > 0 & x > y ) {
                System.out.println("Region: B");
                b++;
            }else if (x > 0 & y > 0 & x + y > 2 ) {
                System.out.println("Region: B");
                b++;
                
            } else if (x > 0 & y > 0 & x < y) {
                System.out.println("Region: C");
                c++;
               
            } else if (x < 0 & y < 0 & x < y) {
                System.out.println("Region: D");
                d++;
               
            } else if (x < 0 & y < 0 & x > y) {
                System.out.println("Region: E");
                e++;
                
            } else if (x > 0 & y < 0) {
                System.out.println("Region: F");
                f++;
                
            } else if (x < 0 & y < 0 & x == y){
                System.out.println("Region:E and D");
                e++;
                d++;
                
            } else if (x > 0 & y > 0 & (x + y == 2)){           
            System.out.println("Region:C and D");
            c++;
            d++;
            
            } else if (y==0 && x < 0){
                System.out.println("Region:A and D");
                a++;
                d++;
                
            } else if (y==0 & x > 0){
                System.out.println("Region C and F");
                c++;
                f++;
               
            } else if (x==0 & y < 0){
                System.out.println("Region E and F");
                e++;
                f++;
               
            }  else if (x == 0 & y > 0){
                System.out.println("Region A and C");
                a++;
                c++;
                
            } else if (x > 0 & y > 0 && x + y == 2){
                System.out.println("Region:C and B");
                c++;
                b++;
                
            }
            
            
            i++;
            
        }
            
        
       
        System.out.println("Region statistics");

        double s_a =  (a * 100 / times);  //times = throwed darts
        double s_b =  (b * 100 / times);
        double s_c =  (c * 100 / times);
        double s_d =  (d * 100 / times);
        double s_e =  (e * 100 / times);
        double s_f =  (f * 100 / times);
        
        
        
        double new_a = ((double) ((int) (s_a * 10.0)) / 10.0);
        double new_b = ((double) ((int) (s_b * 10.0)) / 10.0);
        double new_c = ((double) ((int) (s_c * 10.0)) / 10.0);
        double new_d = ((double) ((int) (s_d * 10.0)) / 10.0);
        double new_e = ((double) ((int) (s_e * 10.0)) / 10.0);
        double new_f = ((double) ((int) (s_f * 10.0)) / 10.0);
         
       
      

                System.out.println("A:" +(int)a+ "darts"+"("+new_a+"%) " );
       
                System.out.println("B:" +(int)b+ "darts"+"("+new_b+"%) " );
                
                System.out.println("C:" +(int)c+ "darts"+"("+new_c+"%) " );
                
                System.out.println("D:" + (int)d+ "darts"+"("+new_d+"%) " );
                
                System.out.println("E:" + (int)e+ "darts"+"("+new_e+"%) " );
                
                System.out.println("F:" + (int)f+ "darts"+"("+new_f+"%) " );
    }
}
       
       
    

    
    
