//// Node class ////////////////////////////////////
class Node{
    constructor(val){
        this.val = val;     // assign initial value
        this.next = null    // next pointer is blank
    }
}

//// SLL class /////////////////////////////////////
class SLL{
    constructor(list){
      this.head = list;     // Head points to first node
    }
}

//create a list of nodes following (1) -> (2) -> (3) -> null
// you can use the helper function printNode(node)
// you can create a new class by 
//    let a = new ClassName(val)

let a = new Node(1)         // Create 1st node
let b = new Node(2)         // Create 2nd node
a.next = b;                 // Point 1st node to 2nd node
let c = new Node(3)
b.next = c;
let d = new Node(4)
c.next = d;
let e = new Node(5)
d.next = e;

//create a SingleLinkedList with the above nodes. (1) is the head
// you can use the helper function printList(list) 

var sll = new SLL(a);       // Create new instance of SLL
printList(sll);

// ---------------HELPER FUNCTION --------------------
//Print the nodes
function printNode(node){
    var str="";
    var curr = node
    while(curr){
        str+=curr.val+" -> ";
        curr=curr.next;

    }
    str+="null";
    console.log(str)

}

//Print the SLL 
function printList(list){
    if(!list.head){
        return "Empty list"
    }
    var str="";
    console.log("List head: "+list.head.val)
    var curr = list.head;
    while(curr){
        str+=curr.val+" -> ";
        curr=curr.next;

    }
    str+="null";
    console.log(str)
}