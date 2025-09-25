import java.util.*;
public class Main_animais {
    public static void main(String[] args){
        List<Animal> lista = new ArrayList<>(5);
        Cachorro yorkshire = new Cachorro("Yorkshire");
//###################################
        Cachorro pitbull = new Cachorro("Pitbull");
//###################################
        Cachorro labrador = new Cachorro("Labrador");
//###################################
        Gato siames = new Gato("Siamês");
//###################################
        Gato persa = new Gato("Persa");
//###################################
        lista.add(yorkshire);
        lista.add(pitbull);
        lista.add(labrador);
        lista.add(siames);
        lista.add(persa);

        for(Animal anim:lista){
            System.out.print(anim.getNome() + " -> ");
            anim.emitirSom();

        }
    }
}
