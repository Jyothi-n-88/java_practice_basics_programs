class insertendlinkedlist
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
        Node current=n1;
        Node newnode=new Node(40);
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newnode;
        current=n1;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}