public Fixed_STK  implements Interface_stk
{

    private int[] stack = new int [5];

    private int top = -1;

     Fixed_STK() {
        super();
        this.stack = stack;
        this.top = top;
    }


    public void push(int element) {
        if(isOverFlow())
            System.out.println("Stack is Full");
        else {
            top = top+1;
            stack[top] = element;
        }

    }


    public int pop() {
        int element;
        if(isUnderFlow())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            element = stack[top];
            top--;
        }
        return element;
    }


    public void displayStack() {
        System.out.println("Stack Element are: ");
        if(isUnderFlow())
        {
            System.out.println("Stack is empty");
        }
        for(int i=0;i<=top;i++)
            System.out.println(stack[i]);

    }

    public boolean isOverFlow() {
        if(top==(stack.length-1))
            return true;
        else
            return false;
    }


    public boolean isUnderFlow() {
        if(top==1)
            return true;
        else
            return false;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }
}
