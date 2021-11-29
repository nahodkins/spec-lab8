import com.project.stack.MyStackImproved;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        MyStackImproved<Number> stackNumber = new MyStackImproved<>();
        MyStackImproved<Integer> stackInteger = new MyStackImproved<>();
        MyStackImproved<Double> stackDouble = new MyStackImproved<>();

        IntStream.range(0, 3)
                .forEach(i -> {
                    stackInteger.push(i);
                    stackDouble.push((double) (i + 3));
                });

        System.out.println( "Integer stack: " + stackInteger);
        System.out.println( "Double stack: " + stackDouble);

        stackNumber.addAll( stackInteger );
        stackDouble.moveElementsTo( stackNumber );

        System.out.println( "Number stack: " + stackNumber);
    }
}
