//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
       int[] arrayOfNumbers = new int[10];
       IntList list1 = new ArrayIntList();
       IntList list2 = new LinkedIntList();

       list1.addBack(42);
       list1.addBack(82);
       list1.addBack(97);
       list1.addBack(42);
       list1.addBack(82);
       list1.addBack(97);
       list1.addBack(42);
       list1.addBack(82);
       list1.addBack(97);
       list1.addBack(42);
       list1.addBack(82);
       list1.addBack(97);

        System.out.println(list1.toString());

        list1.removeBack();
        System.out.println(list1.toString());
        list1.addFront(100);
        System.out.println(list1.toString());
        list1.removeFront();
        System.out.println(list1.toString());
        list1.add(4,99);
        System.out.println(list1.toString());
        System.out.println("Contains 99: "+list1.contains(99));
        list1.remove(4);
        System.out.println(list1.toString());
        System.out.println("Contains 99: "+list1.contains(99));

    }
}