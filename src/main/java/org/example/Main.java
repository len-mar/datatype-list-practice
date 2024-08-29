package org.example;

public class Main {
    public static void main(String[] args) {
        Sack sack = new Sack();
        sack.add(0);
        sack.add(1);
        sack.add(2);
        sack.add(3);
        sack.add(4);

        System.out.println("Let's print our sack. " + sack);


        System.out.println("What's in our sack at index 1? " + sack.get(1));
        System.out.println("What's in our sack at index 4? " + sack.get(4));

        System.out.println("How many ints are in our sack? " + sack.size());

        sack.removeLast();
        System.out.println("We've removed the last element from our sack. Now, how many are there? " + sack.size());

        sack.removeByIndex(1);
        System.out.println("We've removed the element at index 1 from our sack. Now, how many are there? " + sack.size());

        System.out.println("Let's print our sack again. " + sack);
    }
}