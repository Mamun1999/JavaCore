package LinkedList.SinglyLL;

public class Main {

    public static void main(String[] args) {
        LL linkList=new LL();
        linkList.insertFirst(3);
        linkList.insertFirst(6);
        linkList.insertFirst(2);
        linkList.insertFirst(9);
        linkList.displayNode();
//        linkList.insertLast(100);
        linkList.insert(3,200);
//        System.out.println(linkList.deleteFirst());
//        linkList.displayNode();
//        System.out.println(linkList.deleteLast());
        linkList.displayNode();



    }

}
