package CodeChallenges.Challenge12;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Animals animal = new Animals();
        System.out.println(animal.getClass().getSimpleName().equals("animal"));
    }
}
