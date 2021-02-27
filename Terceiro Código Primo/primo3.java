public class primo3 {
    public static void main(String[] args){
        int numeroaverificar = 2147483647;
        boolean primo = true;
        
        if (numeroaverificar == 0|| numeroaverificar == 1){
            primo = false;
        } else {
            for (int i = 2; i < numeroaverificar; i++) {
                if ((numeroaverificar % i) == 0){
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo){
            System.out.println("O numero " + numeroaverificar + " eh primo!");
        } else {
            System.out.println("O numero " + numeroaverificar + " não eh primo!");
        }
    }
}