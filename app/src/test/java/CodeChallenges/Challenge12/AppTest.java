package CodeChallenges.Challenge12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;


public class AppTest {

    Animals animal;
    AnimalShelter animalShelter;

    @BeforeEach
    void setUp(){
        animal = new Animals();
        animalShelter = new AnimalShelter();
    }

    @Test
    @DisplayName("Animal shelter Test")
    void animalShelterTest(){

        List<String> expected = new ArrayList<>();
        List<String> expected2 = new ArrayList<>();

        List<String> actual = new ArrayList<>();
        List<String> actual2 = new ArrayList<>();


        expected.add("Your queue is => { Cat1 } => { Cat2 } => { Cat3 } => null");
        expected.add("Your queue is => { Dog1 } => { Dog2 } => { Dog3 } => null");


        Animals test = new Animals("Cat");
        animalShelter.enqueue(test);
        Animals test1 = new Animals("Cat");
        animalShelter.enqueue(test1);
        Animals test2 = new Animals("Cat");
        animalShelter.enqueue(test2);
        actual.add(animalShelter.catsQueue.printAll());
        Animals test3 = new Animals("Dog");
        animalShelter.enqueue(test3);
        Animals test4 = new Animals("Dog");
        animalShelter.enqueue(test4);
        Animals test5 = new Animals("Dog");
        animalShelter.enqueue(test5);
        actual.add(animalShelter.dogsQueue.printAll());


        assertLinesMatch(expected,actual);


        expected2.add("Your queue is => { Cat2 } => { Cat3 } => null");
        expected2.add("Your queue is => { Dog2 } => { Dog3 } => null");
        animalShelter.dequeue(test);
        actual2.add(animalShelter.catsQueue.printAll());
        animalShelter.dequeue(test3);
        actual2.add(animalShelter.dogsQueue.printAll());




        assertLinesMatch(expected2,actual2);
    }


}
