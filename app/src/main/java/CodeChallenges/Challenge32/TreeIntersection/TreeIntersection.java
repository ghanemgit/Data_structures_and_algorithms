package CodeChallenges.Challenge32.TreeIntersection;


import CodeChallenges.Challenge15_16_17.BinaryTree;
import CodeChallenges.Challenge30.HashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeIntersection {


    public static List<Integer> tree_intersection(BinaryTree tree1, BinaryTree tree2) {

        List<Integer> list = tree1.breadthFirst(tree1);
        List<Integer> list2 = tree2.breadthFirst(tree2);

        HashTable<Integer, Integer> numberHashTable = new HashTable<>();
        HashTable<Integer, Integer> numberHashTable2 = new HashTable<>();


        for (int i = 0; i < list.size(); i++) {
            numberHashTable.add(i, list.get(i));
            numberHashTable2.add(i, list2.get(i));
        }

        return commonNumber(numberHashTable, numberHashTable2);
    }

    private static List<Integer> commonNumber(HashTable<Integer, Integer> hashTable, HashTable<Integer, Integer> hashTable2) {

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < hashTable.getSize(); i++) {
            for (int j = 0; j < hashTable2.getSize(); j++) {
                if (Objects.equals(hashTable.get(i), hashTable2.get(j))) {
                    results.add(hashTable2.get(i));
                } else if (Objects.equals(hashTable2.get(i), hashTable.get(j))) {
                    results.add(hashTable.get(i));
                }
            }
        }
        return results;
    }

}
