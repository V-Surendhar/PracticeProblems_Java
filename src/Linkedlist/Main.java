package Linkedlist;

public class Main {

    public static void main(String[] args) {

        linkedlist list = new linkedlist();
        list.insertFirst(9);
        list.insertLast(4);
        list.add(90);
        list.add(27);
        list.add(42);
        list.add(14);
        list.insert(2,7);
        list.insert(1,19);
        list.insert(9 , 100);
        list.insert(4,99);

        list.printvalues();

        list.remove(3);

        list.printvalues();
        list.removeall();
        list.printvalues();
        System.out.println("Removed");

        doublelinkedlist list1 = new  doublelinkedlist();

        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        list1.printvalues();
        list1.insert(2 ,56);
        list1.add(10);
        list1.printvalues();
        list1.printreverse();
        list1.printvalues();

    }






}
