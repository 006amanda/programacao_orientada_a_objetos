import java.util.*;
public class Main_agencia {
    public static void main(String[] args) {
        List<Alugavel> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABA", "Fiesta", 2020));
        veiculos.add(new Moto("XYZ", "Honda CG", 2022));
        veiculos.add(new Caminhao("JBL", "Volvo FH", 2018));

        Agencia agencia = new Agencia();
        int dias = 5;

        System.out.println("VEÍCULOS CADASTRADOS: ");
        for (Alugavel v : veiculos) {
            System.out.println(v.toString() + "-> Valor para " + dias + " dias: R$ " + v.calcularDiaria(dias));
        }
        double receita = agencia.calcularReceita(veiculos, dias);
        System.out.println("Receita prevista para " + dias + " dias: R$ " + receita);
    }
}
