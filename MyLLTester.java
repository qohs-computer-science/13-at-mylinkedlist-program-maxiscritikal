public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList first = new MyLinkedList();
    System.out.println("Size: " + first.size());
    System.out.println("Is Empty: " + first.isEmpty());
    System.out.println("Contents:\n" + first.toString());
    MyLinkedList second = new MyLinkedList();
    second.add("A");
    second.add("B");
    second.add("C");
    System.out.println("Size: " + second.size());
    System.out.println("Is Empty: " + second.isEmpty());
    System.out.println("Contents:\n" + second.toString());
    System.out.println("Adding to the end:\n" + second.add("D"));
    System.out.println("Adding to the start:\n" + second.addFirst("Max"));
    System.out.println("Adding to the end:\n" + second.addLast("E"));
    System.out.println("Updating a value:\n" + second.set(2, "New"));
    System.out.println("Updated contents:\n" + second.toString());


  } // end main
  
} // end class
