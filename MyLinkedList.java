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
        boolean empty = true;
        if(head == null)
        {
	        return empty;
        }
        else
        {
	        empty = false;
	        return empty;
        }
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
                if (temp.getValue() != null)
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
        ListNode temp = head;
        while (temp.getNext() != null)
        {
            temp = temp.getNext();
        }

    }//end addFirst



}
