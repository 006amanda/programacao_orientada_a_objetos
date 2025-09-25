public class Principal_calc {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();

        System.out.println("Soma 1: " + calc.somar(5, 10));
        System.out.println("Soma 2: " + calc.somar(3.5, 2.7));
        System.out.println("Soma 3: " + calc.somar(1, 2, 3, 4, 5));
        System.out.println("Soma 4: " + calc.somar("Atividade em ", "Java"));
    }
}
