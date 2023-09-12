package Lambda;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
    }
}
