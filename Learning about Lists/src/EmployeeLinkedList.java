/* This class implements the singly linked list functionality. It primarily manages a
series of EmployeeNode objects linked together.
 */
public class EmployeeLinkedList {
        private EmployeeNode head;
        // 'node.setNext(head)' sets the new added employee to the previous head and then sets
        // the head to that new employee using 'head = node';
        public void addToFront(Employee employee) {

            EmployeeNode node = new EmployeeNode(employee);
            node.setNext(head);
            head = node;
        }

        public void printList() {

            EmployeeNode current = head;
            System.out.print("Head -> ");

            // This will print until we hit the end of the list and showcase how the employees are linked
            // together in a linked list
            while (current != null) {
                System.out.print(current);
                System.out.print(" -> ");
                current = current.getNext();
            }
            System.out.println("Null");
        }
    }

