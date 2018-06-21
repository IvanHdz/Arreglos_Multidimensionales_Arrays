/**
 *
 * @author Viruz
 */
public class PruebaArreglos {
    public static void main(String []args){
        int array1[] ={2,3,5,7,11,13,17,19}; //Forma implicita.
        int array2[], array4[];
        int array3[] = new int [4];
        int matrix[][] = new int[6][];
       
        /********Primer Impresión de Arreglos********/
        System.out.println("\nVector 1:");
        printArray(array1);
        
        /********Segunda Impresión de Arreglos********/
        array2 = array1;//asignamos el mismo valor de datos a array2
       
        System.out.println("\nVector 2:");
        printArray(array2);
      
        /********Tercera Impresión de Arreglos********/
               
        System.arraycopy(array1, 2, array3, 0, array3.length);
        System.out.println("\nVector 3:");
        printArray(array3);
        
        /********Cuarta Impresión de Arreglos********/
        array4 = array1;
        for(int i=0;i<array4.length;i++){
                array4[i]=i;
        }

        System.out.println("\nVector 4:");
        printArray(array4);
        
        /********Quinta Impresión de Arreglos********/
        for( int i=0; i<matrix.length; i++) {
            matrix[i]=new int[i];
            for( int j = 0; j < i; j++ ) {
                matrix[i][j]= i*j;
            }
            
         System.out.print("\n"+"Matriz ["+i+"] es: ");
            printArray(matrix[i]);
      }
   }  
    
   public static void printArray(int array[]) {
        System.out.print('<');
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i]);
            if ( (i + 1) < array.length )//para que no imprima la coma despues 
                 System.out.print(", "); //del ultimo numero. 
	}
        System.out.println('>');
    }
 }