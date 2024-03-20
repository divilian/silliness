
public class Cat {

    /*
        Inst vars for cat.
    */
    private int numWhiskers;
    private String name;
    private String breed;

    // This is how you make a noise if you are a cat.
    // It is a pleasant noise.
    void meow(int numMeows) {
        for (int i=0; i<numMeows; i++) {
            System.out.println("Meow!!!");
        }
    }
}
