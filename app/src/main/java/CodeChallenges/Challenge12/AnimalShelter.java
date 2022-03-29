package CodeChallenges.Challenge12;


import CodeChallenges.Challenge10.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter {

    Queue catsQueue = new Queue();
    Queue dogsQueue = new Queue();

    int dogsCounter =0;
    int catsCounter =0;
 //   public void enqueue(Animals animal){

//        if (animal.type.equalsIgnoreCase("cat")){
//            catsCounter++;
//            catsQueue.enqueue("Cat"+catsCounter);
//        }else if (animal.type.equalsIgnoreCase("dog")){
//            dogsCounter++;
//            dogsQueue.enqueue("Dog"+dogsCounter);
//        }else {
//            System.err.println("Sorry this shelter contains only cats and dogs");
//        }


//    }

 //   public String dequeue(Animals animal){


//        String str="";
//        if (animal.type.equalsIgnoreCase("cat")){
//            if (catsQueue.isEmpty())
//                throw new NoSuchElementException("Your cats queue is empty");
//            else {
//                str = (String) catsQueue.peek();
//                catsQueue.dequeue();
//                return str;
//
//            }
//        }else if (animal.type.equalsIgnoreCase("dog")){
//            if (dogsQueue.isEmpty())
//                throw new NoSuchElementException("Your dogs queue is empty");
//            else {
//                str = (String) dogsQueue.peek();
//                dogsQueue.dequeue();
//                return str;
//            }
//        }else {
//            System.err.println("Sorry this shelter contains only cats and dogs");
//            return null;
//        }


//    }

}
