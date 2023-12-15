import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args){
        List<List<String>> items = new ArrayList<>();
        String ruleKey = "color";
        String ruleValue = "sliver";

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
        System.out.println(countMatches(items, ruleKey, ruleValue));
        
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        String[] rule = {"type", "color", "name"}; 

        for(int i = 0; i < items.size(); i++){
            for(int j = 0; j < items.get(i).size(); j++){
                if(items.get(i).get(j).equals(ruleValue) && rule[j].equals(ruleKey)){
                    count++;
                }
            }
        }
        return count;
    }
}
