package by.tmstasks.collections;

import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String[] args){
        Task_LinkedList();
    }

    public static void Task_LinkedList(){
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("John");
        stringLinkedList.add("Mary");
        stringLinkedList.add("Corey");
        stringLinkedList.add("Artyom");

        /*System.out.println(stringLinkedList); Task 1*/

        /*for (String string : stringLinkedList){  Task 2
            System.out.println(string);
        }*/

        /*Iterator iterator = stringLinkedList.iterator();  Task 3

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*Iterator iterator = stringLinkedList.descendingIterator();   Task4

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*stringLinkedList.add(0,"Josh");           Task 5
        System.out.println(stringLinkedList);*/

        /*stringLinkedList.addFirst("James");       Task 6
        stringLinkedList.addLast("Robert");
        System.out.println(stringLinkedList);*/

        /*stringLinkedList.offerFirst("Joshua");    Task 7
        System.out.println(stringLinkedList);*/

        /*stringLinkedList.set(0,"Korn");           Task 26
        System.out.println(stringLinkedList);*/

        /*System.out.println(stringLinkedList.isEmpty());  Task 25*/

        /*LinkedList<String> linkedList = new LinkedList<>();
        for (String string : stringLinkedList){
            linkedList.add(stringLinkedList.contains(string) ? "Yes" : "No");       Task 24
            System.out.println(linkedList);
        }*/
    }

}
