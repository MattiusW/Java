package Lambda;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

class Main
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Stephan");
        names.add("Matthew");
        names.add("Steve");
        names.add("Julia");
        names.add("Mark");
        names.add("Jennifer");

        System.out.println(names);

        System.out.println(names.size()); //List size

        //Lambda
        names.sort((object1, object2) -> {
            return Integer.compare(object1.length(), object2.length());
        });

        System.out.println(names);

        //Lambda v2
        Function<Integer, Boolean> isPositive = x -> x > 0;
        Function<Integer, Boolean> isDivisionByTwo = x -> x % 2 == 0;
        Function<Integer, Boolean> isTwoDigit = x -> Math.abs(x) > 9 && Math.abs(x) < 100;

        printResult(isPositive, 9);
        printResult(isDivisionByTwo, 100);
        printResult(isTwoDigit, 10);
        printResult(isDivisionByTwo, 3);
        printResult(isPositive, -2);
        printResult(isTwoDigit, 7);
    }

    private static void printResult(Function<Integer, Boolean> function, Integer number) //Get function as argument 
    {
        System.out.println("Result: " + function.apply(number)); //Need .apply too pass argument and function
    }
}
