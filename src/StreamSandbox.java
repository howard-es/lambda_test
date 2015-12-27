import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by sugita on 2015/12/10.
 */
public class StreamSandbox {

    public static void main(String[] args) {
        StreamSandbox app = new StreamSandbox();
        app.testFilter();
        app.testMap();
        app.testMin();
        app.testFlatMap();


    }

    private void testFilter(){
        System.out.println("testing filter() functionality: testFilter()");
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(integer -> integer > 2).forEach(System.out::println);
    }

    private void testMap(){
        System.out.println("testing map() functionality: testMap()");
        Stream.of(1,2,3,4,5,6,7,8,9,10).map(integer -> integer * 2).forEach(System.out::println);
    }

    private void testMin(){
        System.out.println("testing map() functionality: testMin()");
        Stream.of(5,6,7,8,9,10).min(Comparator.comparing(integer -> integer)).ifPresent(System.out::println);

    }

    private void testFlatMap(){

    }
}
