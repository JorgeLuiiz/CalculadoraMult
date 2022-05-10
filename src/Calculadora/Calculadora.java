package Calculadora;
public class Calculadora {
    String num1;
    String num2;

    public CalculadoraMultiplicacao(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public String multiplicacao(String numero1, String numero2) {
        Double numeroMulti1 = Double.parseDouble(numero1);
        Double numeroMulti2 = Double.parseDouble(numero2);
        double multi = numeroMulti1 * numeroMulti2;
        return Double.toString(multi);

    }
}
