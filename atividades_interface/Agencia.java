import java.util.*;
public class Agencia {

    public double calcularReceita(List<Alugavel> veiculos, int dias) {
        double total = 0;

        for (Alugavel v : veiculos) {
            total += v.calcularDiaria(dias);
        }

        return total;
    }
}
