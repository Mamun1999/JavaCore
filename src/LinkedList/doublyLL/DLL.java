package LinkedList.doublyLL;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }

   public void insertFirst(int val){
       Node node=new Node(val);

       node.next=head;
       node.prev=null;
       if(head!=null){
           head.prev=node;
       }

               head=node;
   }

   public void displayNode(){

        Node node=head;
        Node last_node=null;

        while(node!=null){
            System.out.print(node.val+" -> ");
            last_node=node; // storing each node as last and after traverse all node then the final node will be last node
            node=node.next;
        }
       System.out.println();
       System.out.println("Printing in reverse");

        while(last_node!=null){
            System.out.print(last_node.val+" -> ");
            last_node=last_node.prev;
        }



   }
    private class Node
    {
        private int val;
        private Node next;
        private  Node prev;

        public Node(int val) {
            this.val=val;
        }



    }
}
