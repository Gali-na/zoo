public class Sparrow extends Birds {
    String name;

    public Sparrow(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("I only eat on land");
    }
}
