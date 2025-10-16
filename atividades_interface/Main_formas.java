import java.util.*;
public class Main_formas {
    public static void main(String[] args) {
        ArrayList<AreaCalculavel> formas = new ArrayList<>();

        formas.add(new Retangulo("vermelho", 5, 3));
        formas.add(new Circulo("verde", 2.5));

        double somaAreas = 0;

        System.out.println("ÁREAS DAS FORMAS:");
        for (AreaCalculavel f : formas) {
            System.out.println(f.toString());
            somaAreas += f.calcularArea();
        }

        System.out.println("Soma total das áreas: " + somaAreas);
    }
}
