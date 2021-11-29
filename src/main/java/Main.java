import com.project.stack.MyStack;

import java.util.stream.IntStream;

public class Main {

    private static MyStack<Integer> initStack() {
        MyStack<Integer> stack = new MyStack<>();
        IntStream.range(0, 5)
                .forEach(stack::push);
        return stack;
    }

    public static void main(String[] args) {
        MyStack<Integer> first = initStack();
        MyStack<Integer> second = initStack();
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        //Equal stacks
        System.out.println("compare: " + first.compareTo(second));
        //Second is bigger than the first
        first.pop();
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("compare: " + first.compareTo(second));
        //First is bigger then the second
        first.push(10);
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("compare: " + first.compareTo(second));
    }
}
