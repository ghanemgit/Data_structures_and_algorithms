package CodeChallenges.Challenge11;

import CodeChallenges.Challenge10.Node;
import CodeChallenges.Challenge10.Stack;

public class PseudoQueue {

    Stack stack1;
    Stack stack2;

    public PseudoQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public void enqueue (int value){
        stack1.push(value);
        System.out.println(stack1.toString());
    }

    public String dequeue () {
        if(stack1.isEmpty())
        {
            return "your queue is empty";
        }
        while (stack1.top!=null) //reverse in another stack to pop the last element (will be the first)
        {
            stack2.push(stack1.pop());
        }
        int num = stack2.pop();
        if(stack2.isEmpty())
        {
            stack1=stack2;
            return "your queue is now empty";
        }
        while (stack2.top!=null){   // reverse the stack again to its normal situation
            stack1.push(stack2.pop());
        }
        return num+"";
    }


}
