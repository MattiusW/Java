package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Streams{

    public static void main(String[] args){
        List<Person> persons = getPersonList();
        persons.stream().forEach(p -> System.out.println(p.getName()));
        persons.stream().forEach(p -> System.out.println(p.getAge()));
        persons.stream().filter(o -> o.getAge() >= 18).forEach(p -> System.out.println(p.getName()));
        System.out.println(IntStream.range(1,10).average());
        IntStream.range(1,8).filter(l -> l % 2 == 0).forEach(n -> System.out.println(n));
    }
    
    public static List<Person> getPersonList(){
        List<Person> result = new ArrayList<Person>();
        result.add(new Person("Adrien", 20));
        result.add(new Person("Michael", 26));
        result.add(new Person("Mahda", 31));
        result.add(new Person("Nikita", 17));
        return result;
    }

}

