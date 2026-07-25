package Linked_List;

public class Main {
    static void main() {
        Linked_List_implementation link_list = new Linked_List_implementation();

        link_list.insert_at_beginning(11);
        link_list.insert_at_beginning(10);
        link_list.insertion_at_end(12);
        link_list.insertion_at_end(13);
        link_list.insertion_at_end(14);

        link_list.display();

        link_list.delete_first_node();
        link_list.display();

        link_list.delete_last_node();
        link_list.display();
    }
}


/*
Level 1 (Must know)
Delete first node
Delete last node
Delete at a given position
Search an element
Find length of linked list
Level 2 (Important interview problems)
Reverse a linked list ⭐
Find middle of linked list ⭐
Detect cycle (Floyd's algorithm) ⭐
 */