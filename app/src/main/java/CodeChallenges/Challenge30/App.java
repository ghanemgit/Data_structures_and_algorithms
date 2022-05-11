package CodeChallenges.Challenge30;

public class App {

    public static void main(String[] args) {
        HashTable<String, Integer> students = new HashTable<>();
        students.add("Mohammad", 99);
        students.add("Ahmad", 98);
        students.add("Zaid", 97);
        students.add("Hamza", 96);

        System.out.println("The size is => " + students.getSize());
        System.out.println("Mohammad Average is => " + students.get("Mohammad"));
        System.out.println("Delete Zaid => " + students.remove("Zaid"));
        System.out.println("The size is => " + students.getSize());
        System.out.println("The array contain Mohammad => " + students.contain("Mohammad"));
        System.out.println("The array contain Fares => " + students.contain("Fares"));
        System.out.println(students.keys().toString());



    }

}
