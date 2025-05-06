public class main { 
    public static void main (String[] args){
        int[] vetor = { 
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20
        };
        int contagem = 0;
        int[] numeros_pares = new int[10]; 

        for (int i = 0; i < vetor.length; i++) { 
            if (vetor[i] % 2 == 0) { 
                numeros_pares[contagem] = vetor[i];
                contagem++;
            }
        }

        System.out.format("Dos números destacados, %d são pares, sendo eles...\n", contagem); 
        for (int i = 0; i < contagem; i++) { 
            System.out.print(numeros_pares[i]);
        }    
    }
}
