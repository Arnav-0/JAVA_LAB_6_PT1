public class StackDemo {
    public static void main(String[] args)
    {
        int[] stack = new int [5];
        int t = -1;
        Fixed_STK fixed_stk = new Fixed_STK();
        fixed_stk.push(1);
        fixed_stk.push(2);
        fixed_stk.push(3);
        fixed_stk.displayStack();
        fixed_stk.pop();
        fixed_stk.displayStack();
    }
}
