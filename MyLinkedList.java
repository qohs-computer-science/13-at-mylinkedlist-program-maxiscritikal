public class MyLinkedList
{
    private ListNode head;

    public MyLinkedList()
	{
		head = null;
    }//end constructor

    public int size()
    {
        int count = 0;
        ListNode temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.getNext();
        }
        return count;
    }//end size

    public boolean isEmpty()
    {
        return head == null;
    }//end isEmpty

    public String toString()
    {
        int count = 0;
        if(head == null)
        {
            return "Empty List";
        }
        String result = "";
        ListNode temp = head;
        while (temp != null)
        {
            result += count + ": " + temp.getValue();
                if (temp.getNext() != null)
                {
                    result += "\n";
                }
                count++;
                temp = temp.getNext();
        }
        return result;
    }//end toString

    public boolean add(Object newItem)
    {
        ListNode given = new ListNode(newItem, null);
        if(head == null)
        {
            head = given;
            return true;
        }

        else
        {
            ListNode temp = head;
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            temp.setNext(given);
            return true;
        }

    }//end add

    public boolean addFirst(Object newItem)
    {
        ListNode given = new ListNode(newItem, head);
        head = given;
        return true;
    }//end addFirst

    public boolean addLast(Object newItem)
    {
        return add(newItem);
    }//end addLast

    public Object set(int i, Object obj) 
    {
        if(i >= size() || i < 0)
        {
            throw new IndexOutOfBoundsException("Index is out of bounds for this LinkedList");
        }

        int x = 0;
        ListNode temp = head;
        while (x < i)
        {
            temp = temp.getNext();
        }
        temp.setNext(given);
        return true;
        
    }

}
