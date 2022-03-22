package CodeChallenges.Challenge10;

public class Stack<T> {

    public Node top;

    public Stack() {
        this.top = null;
    }

        //Check the whether of the stack if empty or not
    public boolean isEmpty() {

        return this.top == null;
    }
        //Insert element into the top of stack.
    public void push(int item) {

        Node newNode = new Node();//create new node and position the pointer(top) at the beginning
        newNode.data = item;//assign the item value to the new node
        if (isEmpty()) {
            //if empty let the next node pointer to null and make the top pointer point to new node value
            newNode.next = null;
        } else {
            //else let new node pointer to old value of top
            newNode.next = top;
        }
        //let the top pointer point to new node value
        top = newNode;
    }

        //Return the top element from the stack.
    public T pop() {

        if (isEmpty()) {
            System.err.println("The stack is empty");
            return null;
        } else {
            //make int variable to save the deleted value in it to allow us return it later
            T deletedValue;
            //make new pointer because if we used the top pointer for this process the old value of pointer will keep stored in the memory.
            Node deletePointer = top;
            deletedValue = (T) top.data;
            top = top.next;
            deletePointer = null;
            return deletedValue;

        }

    }

        //Return the value of top element
    public T peek() {

        if (isEmpty()) {
            System.err.println("The stack is empty");
            return null;
        } else {
            return (T) top.data;
        }
    }

        //Print all element of stack.
    public String printAll() {
        String str = "";
        Node newNode = top;
        if (isEmpty()) {
            str += "The stack is empty";
        } else {
            str += "Your stack is => ";
            while (newNode != null) {
                str += "{ " + newNode.data + " } => ";
                newNode = newNode.next;
            }
            str += "null";

        }
        return str;
    }


}
