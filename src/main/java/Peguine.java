public class Peguine extends Birds {
    String name;

    public Peguine(String name) {
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    void motion() {
        System.out.println("I am pegin, I can't fly, but I can swim and walk perfectly");
    }
}


