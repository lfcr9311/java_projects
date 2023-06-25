package Financial;

public class JuroComposto {

    public static double montante;
    public static double capital;
    public static double taxaJuros;
    public static double tempo;
    public static double aporte;

    public static double Montante(double capital, double taxaJuros, double tempo) {
        montante = capital * (Math.pow(1 + taxaJuros, tempo));
        return montante;

    }

    public static double MontanteMensal(double capital, double taxaJuros, double tempo, double aporte) {
        
        for (int i = 0; i <= tempo; i++) {
            montante = (capital * (Math.pow(1 + taxaJuros, 1/tempo)));
            System.out.println(capital);
            capital = aporte + montante;
            System.out.println(capital);
        }
        

        return montante;
    }

    public static double Capital(double montante2, double taxaJuros, double tempo) {

        capital = montante2 / (Math.pow(1 + taxaJuros, tempo));

        return capital;
    }

    public static double taxaJuros(double montanteJuros, double capitalJuros, double tempoJuros) {

        taxaJuros = ((Math.pow((montanteJuros / capitalJuros), 1 / tempoJuros)) - 1) * 100;

        return taxaJuros;
    }

    public static void main(String[] args) {
         System.out.println(Montante(100000.0, 0.12, 5));
        // System.out.printf("Taxa de Juros %.2f", taxaJuros(100000.0, 100000.0, 20));
        //System.out.println(MontanteMensal(200000.0, 0.0041, 5, 10000.0));
    }
}
