import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args){
        List<List<String>> items = new ArrayList<>();

        List<String> listOne = new ArrayList<>();
        listOne.add("phone");
        listOne.add("blue");
        listOne.add("pixel");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("computer");
        listTwo.add("sliver");
        listTwo.add("lenovo");
          
        List<String> listThree = new ArrayList<>();
        listThree.add("phone");
        listThree.add("gold");
        listThree.add("iphone");

        items.add(listOne);
        items.add(listTwo);
        items.add(listThree);

        System.out.println(items);
        
    }
}
