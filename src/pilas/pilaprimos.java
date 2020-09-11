
package pilas;

import javax.swing.JOptionPane;

public class pilaprimos {
    public static void main(String[] args) {
           Pilas p1=new Pilas();

          int max=Integer.parseInt(JOptionPane.showInputDialog("Digite Máximo de elementos"));

          int m=Integer.parseInt(JOptionPane.showInputDialog("Digite N elementos"));

          if(m<=max){

             int[] vec;

              vec=new int[max];

              p1.generar(m,max,vec);

              p1.imprimir(vec);


         }else{

              System.out.println("El Máximo no puede ser menor al No Elementos");

         }

     }


 }
