
public class Main {
    public static void main(String[] args) {

        double FP = 30000;
        double taxaJuros = 0.02;
        int numeroParcelas = 12;

        double FV = FP * (Math.pow( (1+taxaJuros) , numeroParcelas ));

        System.out.println("O valo final com juros é : " + FV);

    }
}