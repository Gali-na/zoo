import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tigre tigre = new Tigre("Cherhan");
        Tigre tigreSecond = new Tigre("Bagira");
        List<? super LandAnimals> listForAviaryAnimals = new ArrayList<>();
        listForAviaryAnimals.add(tigre);
        listForAviaryAnimals.add(tigreSecond);
        Peguine peguine = new Peguine("Tom");
        Peguine peguineSecond = new Peguine("Luck");
        Sparrow sparrow = new Sparrow(" Chick-Chirick");
        List<? super Birds> listForAviaryBirds = new ArrayList<>();
        listForAviaryBirds.add(peguine);
        listForAviaryBirds.add(peguineSecond);
        listForAviaryBirds.add(sparrow);
        Shark shark = new Shark("Angry shark");
        Shark sharkSecond = new Shark("Angry sharkSecond");
        List<? super Fish> listForAquarium = new ArrayList<>();
        listForAquarium.add(shark);
        listForAquarium.add(sharkSecond);
        Aquarium aquarium = new Aquarium();
        aquarium.setAquariumFish(listForAquarium);
        AviaryForAnimals aviaryForAnimals = new AviaryForAnimals();
        aviaryForAnimals.setAnimalLand(listForAviaryAnimals);
        AviaryForBirds aviaryForBirds = new AviaryForBirds();
        aviaryForBirds.setBird(listForAviaryBirds);

        for (int i = 0; i < aquarium.aquariumFish.size(); i++) {
            Fish g = (Fish) aquarium.aquariumFish.get(i);
            System.out.println(g.getName());
            g.eat();
            g.motion();
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < aviaryForAnimals.getAnimalLand().size(); i++) {
            LandAnimals g = (LandAnimals) aviaryForAnimals.getAnimalLand().get(i);
            System.out.println(g.getName());
            g.eat();
            g.motion();
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < aviaryForBirds.getBird().size(); i++) {
            Birds g = (Birds) aviaryForBirds.getBird().get(i);
            System.out.println(g.getName());
            g.eat();
            g.motion();
            System.out.println("");
        }
    }
}


