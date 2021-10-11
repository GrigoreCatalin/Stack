public class main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);

        stack.pop();
        System.out.println("Minimum element from stack -> " + stack.getMinimum());
        stack.pop();
        System.out.println("Minimum element from stack -> " + stack.getMinimum());
        stack.pop();
        System.out.println("Minimum element from stack -> " + stack.getMinimum());


    }
}
