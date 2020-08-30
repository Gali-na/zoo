import java.util.ArrayList;
import java.util.List;

public class Aquarium<T> {
    List<T> aquariumFish;

    public Aquarium() {
        this.aquariumFish = new ArrayList<>();
    }

    public void setAquariumFish(List<T> aquariumFish) {
        this.aquariumFish = aquariumFish;
    }
}

