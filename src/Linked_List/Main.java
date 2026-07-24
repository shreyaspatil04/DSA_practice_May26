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
    }
}
