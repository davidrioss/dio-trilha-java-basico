public class Operadores {
    public static void main(String[] args) {
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        
        concatenacao = 1+"1"+1+1;
        
        concatenacao = 1+"1"+1+"1";
        
        concatenacao = "1"+1+1+1;
        
        concatenacao = "1"+(1+1+1);  

        int numero = 5;

        numero = - numero;

        numero = - numero;

        System.out.println(numero);


        String nomeUm = "David";

        String nomeDois = new String("David ");

        System.out.println(nomeUm == nomeDois); //so serve em vaariaveis
        System.out.println(nomeUm.equals(nomeDois)); // usado para comparar objetos
    }
}
