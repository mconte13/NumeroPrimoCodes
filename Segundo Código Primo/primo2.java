public class primo2 {
    public static void main(String[] args){
        int numPrimo = 129848753;
        int numDivisores = 0;

        for(int i = 1; i <= numPrimo; i++){
            if(numPrimo % i == 0){
                numDivisores++;
            }
        }

        if(numDivisores == 2){
            System.out.println("O numero digitado é primo.");
        } else {
            System.out.println("O numero digitado NÃO é primo.");
        }
    }
}
