//Inserting Node at first 
//Time complexity:O(1)
class insertfirstlinkedlist
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String args[])
    {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30); 
        n1.next=n2;
        n2.next=n3;
        Node head =n1;
        Node newnode =new Node(5);
        newnode.next=head;
        head=newnode;
        Node current =head;
        //printing linked list
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}