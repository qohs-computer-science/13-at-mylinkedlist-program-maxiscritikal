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

  } // end main
  
} // end class
