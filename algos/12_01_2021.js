class Node {
    constructor(val) {
        this.val = val
        this.next = null
    }
}

class SLL {
    constructor() {
            this.head = null;
        }

    // ------------------------------------- Week 1 Day 3 algo -------------------------------------------
    
    insertAtFront(val){
        // construct a node with the val
        // make the new node as the front (HINT: What is the front of a Singly Linked List)
        var new_node = new Node(val);
        if(!this.head) {
            this.head = new_node;
        } else {
            new_node.next = this.head;
            this.head = new_node;
        }
    }


    removeHead(){
        // Remove the head (HINT: What will be the new head?)
        if(!this.head) {
            console.log("No head.")
            return
        }
        this.head = this.head.next;

    }

    //*** bonus question ***
    average(){
        // Find the average of all the nodes inside a Singly Linked List
        // HINT: How to get an average? What information do we need to generate an average?
        // BONUS: What if one of the nodes stored String instead of int? How do you want to handle that edge case?
    }
    // ------------------------------------- END OF Week 1 Day 3 algo -------------------------------------------

    printList(){
        if(!this.head){
            console.log("Empty list");
            return
        }
        var runner = this.head;
        while(runner){ // while(runner != null)
            console.log(runner.val);
            runner = runner.next;            
        }
    }

    // ------------------------------------- END OF Week 1 Day 2 algo -------------------------------------------


}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 
var list1 = new SLL();
list1.head = a;
list1.printList();

console.log("Insert At Front");
list1.insertAtFront(7);
list1.printList();

console.log("Remove Head");
list1.removeHead();
list1.printList();

// list1: (1) --> (2) --> (3) --> null