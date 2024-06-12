public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 4;
        
        if(nota >= 7){
         System.out.println("Aprovado");
         System.out.println("Nota: " +nota+ " parabéns!");

        }else if (nota >= 5 && nota < 7)
        System.out.println("Recuperação dia 15/02/2020.");

        else
         System.out.println("Recuperação dia 30/05/2020.");
     }
}
