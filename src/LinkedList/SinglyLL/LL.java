package LinkedList.SinglyLL;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    private Node node;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size=size+1;

    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node=new Node(val);
        tail.next=node;
        tail=node;

         size++;

    }

    public void insert(int index, int val){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;//0 1 2 3 4 5
        for (int i = 1; i < index; i++) {
          temp=temp.next;// when i is increasing we are going to temp.next from head 1 2 3
             //if i=2 then we reached temp.next=3 where we will insert

        }
        Node node=new Node(val,temp.next);

        temp.next=node;

        size++;




    }

    public int deleteFirst(){
        if(size==0){
            System.out.println("Delete nothing");
        }
        int val=head.value;

        Node temp=head;
        head=temp.next;
        if(head==null){
            tail=null;
        }

        size--;

        return val;


    }

    public Node get(int index){ //index=2
        Node node=head;
        for (int i = 0; i < index; i++) { //loop goes till 1(0,1)
            node=node.next; //node stored=2
        }
        return node; //2
    }
    public int deleteLast(){
        if(size==0){
            System.out.println("Nothing to delete");
        }
        if(size<=1){
            deleteFirst();
        }

        Node secondLast=get(size-2); // size=4; (size-2)=2
        int val=tail.value;

        tail=secondLast;
        tail.next=null;

        return val;

    }
    //delete particular index

    public int delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }

        Node temp=head;

        for (int i = 0; i < index; i++) {

            temp=temp.next;
        }

       Node prevNode=get(index-1);


        prevNode.next=prevNode.next.next;
        //
        int val= prevNode.next.value;

         return val;


    }

    public Node find(int val){

        Node temp_node=head;
        while (temp_node!=null){
            if(temp_node.value==val){
                return temp_node;

            }
            ;
            temp_node=temp_node.next;
        }
        return null;
    }
//    }

    public void displayNode(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }



    private class Node {
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }


}
