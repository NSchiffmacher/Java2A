package stacks;

public class WrongStackMain  {
    public static void main(String[] args) {
        WrongStack<String> stack = new WrongStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.add("d");

        String s = stack.pop();

        System.out.println(stack);
        System.out.println(s);
    }
}
