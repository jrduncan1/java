class Node {
    constructor(val) {
        this.val = val
        this.next = null
    }
}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 


class SLL {
    constructor() {
            this.head = null;
        }
    
    //Determines if the list is empty ***    
    isEmpty(){
        if(!this.head){
            console.log("List is empty.");
            return true;
        }
    }

    //Create a new node with the given value and inserts it at the back of the list
    insertAtBack(val){
        var new_node = new Node(val)
        if(!this.head){
            this.head = new_node;
        } else{
            var runner = this.head;
            while(runner.next){
                runner = runner.next
            }
            runner.next = new_node
        }
    }
    arrToList(arr){
        //BONUS: Add all the items of an array to the back of the list
    }

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

}

var list1 = new SLL();
list1.head = a;

list1.isEmpty();
list1.printList();
console.log("_________")

list1.insertAtBack(5);
list1.printList();