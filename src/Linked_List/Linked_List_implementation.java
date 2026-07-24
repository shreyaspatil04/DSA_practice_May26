package Linked_List;

public class Linked_List_implementation {

    Node head;

    // insert at beginning.......

    public void insert_at_beginning(int n){
        Node newNode = new Node(n);
        // if linked list is empty
        if(head== null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;

    }

    // insertion at end
    public void insertion_at_end(int n){
        Node newNode = new Node(n);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next= newNode;
    }


    public void display(){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}


// insertion at beginning

/*
This is the standard algorithm for inserting a node at the beginning of a singly linked list. Let's go through it line by line.

public void insertAtBeginning(int data) {
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;
}
Step 1: Create a new node
Node newNode = new Node(data);

Suppose you call:

        list.insertAtBeginning(10);

A new node is created:

newNode
   |
V
+---------+
        | data=10 |
        | next=null
        +---------+

At this point:

newNode.data = 10
newNode.next = null (set by the constructor)
Step 2: Point the new node to the current head
newNode.next = head;
Case 1: List is empty

Initially:

head
 |
V
null

So this line becomes:

newNode.next = null;

Memory:

newNode
   |
V
+---------+
        | data=10 |
        | next -----> null
        +---------+

Nothing changes visually because head was already null.

Case 2: List already has nodes

Suppose the list is:

head
 |
V
10 -> 20 -> 30 -> null

Now call:

insertAtBeginning(5);

A new node is created:

newNode

5 -> null

head

10 -> 20 -> 30 -> null

Now execute:

newNode.next = head;

head points to the node containing 10, so newNode.next is made to point there.

newNode
   |
V
5 ------+
        |
V
10 -> 20 -> 30 -> null

head
 |
V
10

Notice that head hasn't changed yet.

Step 3: Move head
head = newNode;

Now head starts pointing to the new node.

        head
 |
V
5 -> 10 -> 20 -> 30 -> null

The insertion is complete.

Why this order?

You must write:

newNode.next = head;
head = newNode;

If you reverse them:

head = newNode;
newNode.next = head;

then after the first line:

head
 |
V
5 -> null

The old list (10 -> 20 -> 30) is no longer referenced.

The second line becomes:

newNode.next = head;

which means:

        5
        |
        +----+
        |
V
     5

The node points to itself, and the original list is lost.

Summary

Suppose the list is:

head
 |
V
10 -> 20 -> 30 -> null

After executing:

Node newNode = new Node(5);
newNode.next = head;
head = newNode;

The list becomes:

head
 |
V
5 -> 10 -> 20 -> 30 -> null

the list.

The complete insertion-at-beginning logic is:

void insertAtBeginning(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

*/




// insert at end...................................................................................................
/*
Step 1: Create a new node
Node newNode = new Node(data);

Suppose you call:

insertAtEnd(40);

A node is created:

newNode
   |
   V
+---------+
| data=40 |
| next=null
+---------+
Step 2: Check if the list is empty
if (head == null) {
    head = newNode;
    return;
}

Suppose the list is empty:

head
 |
 V
null

Then:

head = newNode;

Now:

head
 |
 V
40 -> null

The method ends because of:

return;

No traversal is needed.

Step 3: Create a temporary pointer

Suppose the list is:

head
 |
 V
10 -> 20 -> 30 -> null

We execute:

Node temp = head;

Now:

head
 |
 V
10 -> 20 -> 30 -> null
 ^
 |
temp
Why not use head directly?

If you wrote:

head = head.next;

you would lose the beginning of the list.

Instead, we use another reference (temp) to walk through the list while keeping head unchanged.

Step 4: Traverse to the last node
while (temp.next != null) {
    temp = temp.next;
}
First iteration

temp is at 10.

head
 |
 V
10 -> 20 -> 30 -> null
 ^
 |
temp

Check:

temp.next != null

10.next points to 20, so the condition is true.

Move:

temp = temp.next;

Now:

10 -> 20 -> 30 -> null
       ^
       |
      temp
Second iteration

20.next points to 30.

Again:

temp = temp.next;

Now:

10 -> 20 -> 30 -> null
             ^
             |
            temp
Third iteration

Now temp is at 30.

Check:

temp.next != null

But:

30.next = null

Condition becomes:

null != null

which is false, so the loop stops.

Now temp is at the last node.

Step 5: Attach the new node
temp.next = newNode;

Previously:

30 -> null

Now:

30 -> 40 -> null

Final list:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null
Why do we use temp?

Imagine the list:

head
 |
 V
10 -> 20 -> 30 -> null

If you traverse using head:

while (head.next != null) {
    head = head.next;
}

After the loop:

10    20
       \
        30
         ^
         |
        head

head now points to 30.

You've lost the reference to the first node (10), so the linked list is effectively broken.

Using temp avoids this problem:

Node temp = head;

temp moves, while head always stays at the first node.

Visual Summary

Initially:

head
 |
 V
10 -> 20 -> 30 -> null

newNode
   |
   V
40 -> null

After traversal:

head
 |
 V
10 -> 20 -> 30 -> null
             ^
             |
            temp

After:

temp.next = newNode;

Result:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null
Time Complexity
Creating the node: O(1)
Traversing to the last node: O(n), where n is the number of nodes.
Linking the new node: O(1)

Overall time complexity: O(n), because in the worst case you visit every node to reach the end.

 */


// ..........................................................................................................//

// now display()

/*
    }

Let's understand the display() method step by step.

public void display() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}
Suppose the linked list is
head
 |
 V
10 -> 20 -> 30 -> null
Step 1: Create a temporary pointer
Node temp = head;

Now both head and temp point to the first node.

head
 |
 V
10 -> 20 -> 30 -> null
 ^
 |
temp
Why use temp?

Because we only want to read the list.

If we moved head itself, we'd lose the beginning of the list.

Step 2: Check the loop condition
while (temp != null)

Is temp null?

Currently:

temp
 |
 V
10

No.

So enter the loop.

First Iteration
Print
System.out.print(temp.data + " -> ");

Output:

10 ->
Move to the next node
temp = temp.next;

Now:

head
 |
 V
10 -> 20 -> 30 -> null
       ^
       |
      temp
Second Iteration

Again,

temp != null

Yes.

Print:

20 ->

Move:

temp = temp.next;

Now:

head
 |
 V
10 -> 20 -> 30 -> null
             ^
             |
            temp
Third Iteration

Print:

30 ->

Move:

temp = temp.next;

Since 30.next is null,

head
 |
 V
10 -> 20 -> 30 -> null
                   ^
                   |
                  temp

Now temp = null.

Fourth Check

Loop condition:

while (temp != null)

Now:

temp == null

So the loop stops.

Last Statement
System.out.println("null");

This prints:

null

Final output:

10 -> 20 -> 30 -> null
What if the list is empty?

Initially:

head
 |
 V
null

Then

Node temp = head;

means

temp
 |
 V
null

Now,

while (temp != null)

is immediately false.

The loop never runs.

Only this executes:

System.out.println("null");

Output:

null

which correctly represents an empty list.

Why do we write temp != null and not temp.next != null?

If you wrote:

while (temp.next != null)

consider this list:

10 -> 20 -> 30 -> null
temp = 10 → print 10
temp = 20 → print 20
temp = 30

Now temp.next == null, so the loop stops before printing 30.

Output would be:

10 -> 20 ->

The last node is skipped.

That's why the correct condition is:

while (temp != null)

It ensures every node is visited, including the last one.
 */