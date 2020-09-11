
package pilas;

import javax.swing.JOptionPane;

public class Pilas {
    
      int valorPrimo = 0;
      int tope=-1,maximo;
        
        public boolean VerificarPrimo(int aleatorioPrimo){
            System.out.println(aleatorioPrimo);
            int i = 2;
            
            boolean verificacion = true;
            
            while((verificacion) && (i!=aleatorioPrimo)){
                if(aleatorioPrimo % i == 0){
                    verificacion = false;
                }else{
                    this.valorPrimo = aleatorioPrimo;
                    verificacion = true;
                }
                i++;
            }
            
            return verificacion;
        }
      
        public void generar(int f,int tot, int[]p) {


         maximo=tot;

         for(int i=0;i<f;i++) {

              tope++;

            while(true){
                if (this.VerificarPrimo((int) Math.floor(Math.random()*100))){
                    p[tope]=this.valorPrimo;

                    break;
                }
            }


         }

     }

      public void imprimir(int[]a) {

         System.out.println( "Elementos de la pila ");

         for(int i=0;i<=tope;i++) {


                 System.out.print("" +a[i]+",");


         }

          System.out.println( "Tope de la pila "+tope+ " máximo de la pila "+maximo);

     }

 }
    
    

