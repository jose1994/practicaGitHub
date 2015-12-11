/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;

/**
 *
 * @author yuri
 */
public class Main {
    private static Object Leer;
   // private static Object Leer;

    //public class CSerie {
      public static void main (String args[]){
                  int n = 0;
                  int ter = 4;
                  double  raz = 0.5;
                  int con = 0;
                  double  sum= 0;
                  //int datoInt=0;

                  System.out.println("programa que calcula los terminos de la serie");
                  do{
                            // n= Leer.datoInt();
                  }
                  while(n<0);
                  do{
                             System.out.print(" ,"+ter);
                             sum +=ter;
                             con++;
                             if(con<n){
                                         ter *=raz;
                                         raz *=2;
                             }
                  }
                  while(con<n);
                  System.out.println();
                  System.out.println("La suma de los Términos es : "+sum);
      }
}