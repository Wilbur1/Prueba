package BodyMassIndex;

import LinkedListImplementation.MyLinkedList;

public class NewMain {

    public static void main(String[] args) {
        MyLinkedList<BodyMassIndex> bmiList = new MyLinkedList<>();

        BodyMassIndex bmiErika = new BodyMassIndex("Erika", 1.65, 52);
        bmiList.addFirst(bmiErika);

        BodyMassIndex bmiBarack = new BodyMassIndex("Barack", 1.85, 80);
        bmiList.addFirst(bmiBarack);

        BodyMassIndex bmiPibe = new BodyMassIndex("Pibe", 1.85, 80);
        bmiList.addLast(bmiPibe);

        System.out.println("The original list is ...");
        System.out.println(bmiList.toString());

        BodyMassIndex bmiJames = new BodyMassIndex("James", 1.70, 65);
        bmiList.add(5, bmiJames);

        System.out.println("The list after inserting James at position 5 is ...");
        System.out.println(bmiList.toString());

        System.out.println("Traversing the list using the iterator");
        for (BodyMassIndex bmi : bmiList) {
            System.out.println(bmi);
        }

        bmiList.removeLast();
        System.out.println("The list after removing the last element is ...");
        System.out.println(bmiList.toString());

//        bmiList.clear();
//        
//        System.out.println("The list after clearing it is...");
//        System.out.println(bmiList);
    }
}
