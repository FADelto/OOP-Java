package ru.mirea.pr8;

public class WaitListsTest {
    public static void main(String[] args) {

        System.out.println("->");

        WaitList<Integer> list = new WaitList<>();

        System.out.println(list);
        System.out.println("isEmpty?   " + list.isEmpty());

        list.add(4);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(0);
        list.add(9);

        System.out.println(list);
        System.out.println("isEmpty?   " + list.isEmpty());

        list.remove();
        list.remove();
        list.remove();

        System.out.println(list);

        System.out.println("->");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);

        System.out.println(list2);
        System.out.println("isEmpty?   " + list2.isEmpty());

        list2.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        list2.add(0);
        list2.add(9);

        System.out.println(list2);
        System.out.println("isEmpty?   " + list2.isEmpty());

        list2.remove();
        list2.remove();
        list2.remove();

        System.out.println(list2);

        System.out.println("->");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();

        System.out.println(list3);
        System.out.println("isEmpty?   " + list3.isEmpty());

        list3.add(4);
        list3.add(1);
        list3.add(3);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(8);
        list3.add(0);
        list3.add(9);

        System.out.println(list3);
        System.out.println("isEmpty?   " + list3.isEmpty());

        list3.remove(3);
        list3.remove(4);
        list3.remove(8);

        System.out.println(list3);
    }
}
