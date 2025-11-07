//Max Korsa, 11/7/25, PD: 4
//This class tests the MyLinkedList class by performing various operations and printing the results.
public class MyLLTester
{
  public static void main(String [] args)
  {
    //creation and population of first list
    MyLinkedList firstList = new MyLinkedList();
    firstList.add("B");
    firstList.addFirst("A");
    firstList.addLast("C");
    firstList.add("D");
    firstList.add(4);
    firstList.add(null);
    firstList.add(5.5);
    firstList.add("E");
    firstList.add("F");
    firstList.add("G");
    firstList.add("H");

    //initial state of first list
    System.out.println("Initial List data:");
    System.out.println("Size: " + firstList.size());
    System.out.println("Empty? " + firstList.isEmpty());
    System.out.println("Contents: \n" + firstList.toString());

    //testing get and set methods
    System.out.println("Testing Get For First, Middle, And Last.");
    System.out.println("Get First: " + firstList.get(0));
    System.out.println("Get Middle: " + firstList.get(firstList.size() / 2));
    System.out.println("Get Last: " + firstList.get(firstList.size() - 1));

    //testing set method
    System.out.println("Testing Set For First, Middle, And Last.");
    firstList.set(0, "Max");
    firstList.set(firstList.size() / 2, "Alexander");
    firstList.set(firstList.size() - 1, "Korsa");
    System.out.println("After Testing Set Data: ");
    System.out.println("Size: " + firstList.size());
    System.out.println("Empty? " + firstList.isEmpty());
    System.out.println("Contents: \n" + firstList.toString());

    //testing remove method
    System.out.println("Testing Remove For First, Middle, And Last.");
    System.out.println("Remove First: " + firstList.removeFirst());
    System.out.println("Remove Middle: " + firstList.remove(firstList.size() / 2));
    System.out.println("Remove Last: " + firstList.removeLast());
    System.out.println("After Testing Remove And The Final Summary Of First List: ");
    System.out.println("Size: " + firstList.size());
    System.out.println("Empty? " + firstList.isEmpty());
    System.out.println("Contents: \n" + firstList.toString());

    //testing single value list
    MyLinkedList singleValueList = new MyLinkedList();
    singleValueList.add("SingleValue");
    System.out.println("Single Value List Before Removal: ");
    System.out.println("Size: " + singleValueList.size());
    System.out.println("Empty? " + singleValueList.isEmpty());
    System.out.println("Contents: \n" + singleValueList.toString());
    System.out.println("Removing The Only Value: " + singleValueList.removeFirst());
    System.out.println("Single Value List After Removal: ");
    System.out.println("Size: " + singleValueList.size());
    System.out.println("Empty? " + singleValueList.isEmpty());
    System.out.println("Contents: \n" + singleValueList.toString());

    //testing empty list
    System.out.println("Testing On Empty List:");
    MyLinkedList emptyList = new MyLinkedList();
    System.out.println("Size: " + emptyList.size());
    System.out.println("Empty? " + emptyList.isEmpty());
    System.out.println("Contents: \n" + emptyList.toString());
    System.out.println("Removing First: " + emptyList.removeFirst());
    System.out.println("Removing Last: " + emptyList.removeLast());
    System.out.println("Final State Of Empty List: ");
    System.out.println("Size: " + emptyList.size());
    System.out.println("Empty? " + emptyList.isEmpty());
    System.out.println("Contents: \n" + emptyList.toString());

  } // end main
  
} // end class
