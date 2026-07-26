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

    public void delete_first_node(){
        if(head == null){
            System.out.println("Your Linked List is Empty...");
            return;
        }

        head = head.next;
    }

    public void delete_last_node(){
        // Case 1: Empty list
        if(head == null){
            System.out.println("Linked-list is empty sry....");
            return;
        }
        // Case 2: Only one node
        if(head.next == null){
            head = null;
            return;
        }
        // Move to the second-last node
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        // Delete the last node
        temp.next = null;
    }

    public boolean search(int n){

//        if(head == null){
//            return false;
//        }
          // no need of this....becoz if temp == null then also it is going to throw false..

        Node temp = head;
        while (temp != null){
            if(temp.data == n){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

   // do this again  watch shraddha video
    public void reverse_linked_list(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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



// delete first Node................
/*
Code
public void deleteFirst() {

    if (head == null) {
        System.out.println("Linked List is empty.");
        return;
    }

    head = head.next;
}
Step 1: Check if the list is empty
if (head == null) {
    System.out.println("Linked List is empty.");
    return;
}

Suppose the list is empty.

head
 |
 V
null

There is nothing to delete.

So we print a message and return.

Step 2: Move head
head = head.next;

This is the only line needed to delete the first node.

Let's understand why.

Example

Current list:

head
 |
 V
10 -> 20 -> 30 -> null
Memory representation
head
 |
 V
+---------+      +---------+      +---------+
| data=10 | ---> | data=20 | ---> | data=30 |
| next ---|      | next ---|      | next=null
+---------+      +---------+      +---------+

Currently,

head
  |
  +----> Node(10)
Execute
head = head.next;

First Java evaluates the right side:

head.next

Since head points to 10,

head.next

means

10.next

which points to the node containing 20.

So Java does:

head = Node(20);

Now the picture becomes:

head
 |
 V
20 -> 30 -> null

The node containing 10 is no longer referenced by head.

What happened to node 10?
10 -> 20 -> 30

No variable points to 10 anymore.

10 -> 20 -> 30
^
No reference

Since nothing references it, Java's Garbage Collector will eventually remove it from memory automatically.

You do not call free() or delete like in C/C++.

Example with one node

Before:

head
 |
 V
10 -> null

Execute

head = head.next;

head.next is null.

So

head = null;

Now

head
 |
 V
null

The list becomes empty.

Example with two nodes

Before:

head
 |
 V
10 -> 20 -> null

Execute

head = head.next;

After

head
 |
 V
20 -> null
Why don't we use temp?

We don't need to traverse.

The first node is already known:

head
 |
 V
First Node

So deleting it only requires changing one reference.

Time Complexity

Only one assignment happens:

head = head.next;

No loop.

Therefore:

Time Complexity = O(1)

Constant time.

Complete Method
public void deleteFirst() {

    if (head == null) {
        System.out.println("Linked List is empty.");
        return;
    }

    head = head.next;
}
Visual Summary
Before
head
 |
 V
10 -> 20 -> 30 -> null
Execute
head = head.next;
After
head
 |
 V
20 -> 30 -> null

The node 10 is no longer reachable, so Java's garbage collector will reclaim it later. This is why deleting the first node is one of the fastest linked list operations.
 */







// delete Last Node

/*
Deleting the last node is a little more involved because, unlike the first node, you have to find the second-last node first.

Code
public void deleteLast() {

    // Case 1: Empty list
    if (head == null) {
        System.out.println("Linked List is empty.");
        return;
    }

    // Case 2: Only one node
    if (head.next == null) {
        head = null;
        return;
    }

    Node temp = head;

    // Move to the second-last node
    while (temp.next.next != null) {
        temp = temp.next;
    }

    // Delete the last node
    temp.next = null;
}
Example

Suppose the list is:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null

Our goal is to remove 40.

Step 1: Check if the list is empty
if (head == null) {
    System.out.println("Linked List is empty.");
    return;
}

If:

head
 |
 V
null

there is nothing to delete.

Step 2: Check if only one node exists
if (head.next == null) {
    head = null;
    return;
}

Suppose the list is:

head
 |
 V
10 -> null

head.next is null, which means there is only one node.

So:

head = null;

Now:

head
 |
 V
null

The list becomes empty.

Step 3: Create a temporary pointer
Node temp = head;

Initially:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null
 ^
 |
temp
Step 4: Traverse to the second-last node

Notice the loop:

while (temp.next.next != null) {
    temp = temp.next;
}

Many beginners wonder why it is temp.next.next instead of temp.next.

The answer is that we want to stop one node before the last.

First iteration

temp is at 10.

10 -> 20 -> 30 -> 40 -> null
 ^
 |
temp

Check:

temp.next.next != null
temp.next → 20
temp.next.next → 30

30 is not null, so move:

temp = temp.next;

Now:

10 -> 20 -> 30 -> 40 -> null
       ^
       |
      temp
Second iteration

Now temp is 20.

Check:

temp.next → 30
temp.next.next → 40

40 is not null, so move again.

10 -> 20 -> 30 -> 40 -> null
             ^
             |
            temp
Third iteration

Now temp is 30.

Check:

temp.next → 40
temp.next.next → null

So the condition becomes:

null != null

which is false.

The loop stops.

Now temp is exactly at the second-last node.

Step 5: Remove the last node
temp.next = null;

Before:

30 -> 40 -> null

After:

30 -> null

Complete list:

head
 |
 V
10 -> 20 -> 30 -> null

The node 40 is no longer referenced and Java's garbage collector will eventually reclaim it.

Why not use while (temp.next != null)?

Suppose you did:

while (temp.next != null) {
    temp = temp.next;
}

The loop would stop with temp pointing to the last node:

10 -> 20 -> 30 -> 40 -> null
                  ^
                  |
                 temp

Now if you write:

temp.next = null;

nothing changes, because temp.next is already null.

You cannot delete the last node this way because you no longer have a reference to the second-last node, which is the one whose next needs to change.

Summary

Before:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null

After deleteLast():

head
 |
 V
10 -> 20 -> 30 -> null
Key points
If the list is empty → do nothing.
If there is only one node → set head = null.
Otherwise:

Traverse until temp reaches the second-last node using:

while (temp.next.next != null)

Disconnect the last node:

temp.next = null;
Time Complexity
Traversal takes O(n) in the worst case.
Changing temp.next takes O(1).

Overall time complexity: O(n).
 */








// search an element

/*
Searching in a linked list means visiting each node one by one until:

You find the required value, or
You reach the end of the list (null).

Since a linked list has no indexing like an array, you cannot directly access the 5th or 10th element.

Code
public boolean search(int key) {

    Node temp = head;

    while (temp != null) {

        if (temp.data == key) {
            return true;
        }

        temp = temp.next;
    }

    return false;
}
Example

Suppose the list is:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null

Search for:

30
Step 1: Create a temporary pointer
Node temp = head;

Memory:

head
 |
 V
10 -> 20 -> 30 -> 40 -> null
 ^
 |
temp

We use temp so that head remains unchanged.

Step 2: Check the first node
while(temp != null)

Currently,

temp = 10

Compare:

if(temp.data == key)

becomes

if(10 == 30)

False.

Move forward.

temp = temp.next;

Now:

10 -> 20 -> 30 -> 40 -> null
       ^
       |
      temp
Step 3: Check the second node

Compare

20 == 30

False.

Move:

temp = temp.next;

Now:

10 -> 20 -> 30 -> 40 -> null
             ^
             |
            temp
Step 4: Check the third node

Compare

30 == 30

True.

Execute

return true;

The method stops immediately.

Searching for an element that doesn't exist

Suppose we search for:

50

List:

10 -> 20 -> 30 -> 40 -> null

The comparisons are:

10 == 50 ❌
20 == 50 ❌
30 == 50 ❌
40 == 50 ❌

Then

temp = temp.next;

after 40 becomes

temp = null

The loop ends.

Finally,

return false;
Visual Dry Run

Search for 40

Initially
head
 |
 V
10 -> 20 -> 30 -> 40 -> null
 ^
 |
temp

↓

10 != 40

Move

↓

10 -> 20 -> 30 -> 40 -> null
       ^
       |
      temp

↓

20 != 40

Move

↓

10 -> 20 -> 30 -> 40 -> null
             ^
             |
            temp

↓

30 != 40

Move

↓

10 -> 20 -> 30 -> 40 -> null
                   ^
                   |
                  temp

↓

40 == 40

Return

true
Returning the position instead of true/false

Sometimes you want to know where the element is.

public int search(int key) {

    Node temp = head;
    int position = 1;

    while (temp != null) {

        if (temp.data == key) {
            return position;
        }

        temp = temp.next;
        position++;
    }

    return -1;
}

Example:

List:

10 -> 20 -> 30 -> 40

Calling

search(30);

returns

3

Calling

search(100);

returns

-1

which means the element was not found.

Time Complexity

In the worst case, you may have to check every node.

Example:

10 -> 20 -> 30 -> 40 -> 50

Searching for 50 (or a value not in the list) visits all nodes.

So:

Best case: O(1) (the first node matches)
Worst case: O(n) (the last node matches or the element isn't present)
Space complexity: O(1) (only one extra pointer, temp)
 */