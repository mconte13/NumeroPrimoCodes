public class primo2 {
    public static void main(String[] args){
        double numPrimo = 2147483647;
        double numDivisores = 0;

        for(double i = 1; i <= numPrimo; i++){
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
