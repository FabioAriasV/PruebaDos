
import javax.swing.JOptionPane;


public class Burbuja {
     public static void main(String[] args) {
            // Definición e instanciación del vector
        int vectorUno[] = new int[5];
        
        int auxiliar;
        
        // Cargue del primer vector
        for(int i=0; i<5; i++){
            
            vectorUno[i] = vectorUno[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor en la posicion ["+ i + "]:"));
        }
        // Método de la burbuja
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                // Si utilizo < me organiza de forma ascendente
                // Si utilizo > me organiza de forma descendente
                if(vectorUno[i] > vectorUno[j]){
                    auxiliar = vectorUno[i];
                    vectorUno[i] = vectorUno[j];
                    vectorUno[j] = auxiliar;
                }
            }
        }
        
        // Imprimir el vectorDos
        for(int i=0; i<5 ; i++){
           
                JOptionPane.showMessageDialog(null,vectorUno[i]);
        }
    }
}