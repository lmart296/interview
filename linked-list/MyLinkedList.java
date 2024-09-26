/**
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 */

class MyLinkedList {
    Node root;

    public MyLinkedList() {
        root = null;
    }

    public int get(int index) {
        if(root == null){
            return -1;
        }
        Node tmp = root;
        while(index > 0){
            if(tmp == null){
                return -1;
            }
            tmp = tmp.next;
            index--;
        }
        if(tmp == null){
            return -1;
        }
        return tmp.val;
        
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = root;
        root = node;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(root == null){
            root = node;
        } else {
            Node tmp = root;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        Node tmp = root;
        if(index == 0) {
            addAtHead(val);
        } else {
            while(index > 1){
                if(tmp == null){
                    return;
                }
                tmp = tmp.next;
                index--;
            }
            if(tmp == null){
                return;
            } 
            node.next = tmp.next;
            tmp.next = node;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(root == null){
            return;
        }
        Node tmp = root;        
        if(index == 0) {
            root = root.next;
        } else {
            while(index > 1){
                if(tmp == null){
                    return;
                }
                tmp = tmp.next;
                index--;
            }
            if(tmp == null){
                return;
            }
            if(tmp.next != null){
                tmp.next = tmp.next.next;
            }
        }
        
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(4);
        myLinkedList.get(1);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(5);              // return 2
        myLinkedList.deleteAtIndex(3);    // now the linked list is 1->3
        myLinkedList.addAtHead(7); 
        myLinkedList.get(3); 
        myLinkedList.get(3); 
        myLinkedList.get(3); 
        myLinkedList.addAtHead(1); 
        myLinkedList.deleteAtIndex(7); 

        Node tmp = myLinkedList.root;
        while(tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

}

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
