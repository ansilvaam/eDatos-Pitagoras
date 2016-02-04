
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EDatosPitagoras {

    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dame m: "); //mi limite inicial
        int m = Integer.parseInt(leer.readLine()); 
        System.out.println("Dame n: "); //mi limite final
        int n = Integer.parseInt(leer.readLine());

        int a, b, c; //lados del triangulo abc
        int contador = 0; //mi contador
        
        for (int i = m ; i <= n ; i++){ //el primer for aumentara hasta que termine los otros 2
            for(int j = m ; j <= n ; j++){ //este aumentara hasta que k termine de comprobar
                for(int k = m; k <= n; k++){ //con este hacemos la comprobacion aumentando i= 1 j=1 y k se movera 1 1 1, 1 1 2 hasta 1 1 20, despues 
                                                //tendremos 1 2 1 , 1 2 2 , 1 2 3 , hasta 1 2 20 , de esta manera podremos comprobar todas las combinaciones
                                                //de ternas validas entre el intervalo m-n.
                    
                    a = i * i; //a^2
                    b = j * j; //b^2
                    c = k * k; //c^2
                    
                    if( (a + b) == c ){
                        //System.out.println(" " + i + " "+ j+" "+k); //para comprobar
                        contador++; 
                    }
                }
            }
        }
        
        contador = contador/2; //lo divido sobre 2 ya que siempre habra el doble de combinaciones de ternas
        //entonces el ejercicio solamente quiere tomar en cuenta 4 de las 8 posibles ya que las otras son las
        //mismas pero a y b estan en diferente posicion
        System.out.println(contador);
    }
}
