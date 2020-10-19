package presentarnumeros;
public class Numeros {
    int contador; 
    public long Numeros(long numero){
        if (numero<=1) 
            return 0;   
        else //paso recursivo
            return numero+Numeros(numero-1);
    }
     public void mostrarNumeros(){
        //calcula los factoriales
         for ( contador = 0; contador<= 10; contador++) {
             System.out.printf("%d,",contador,Numeros(contador));
         }
 // fin metodo mostrarFactorial
         
    }
}
