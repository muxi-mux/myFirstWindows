import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public void executeStreams1(){
      Stream.iterate(0, s -> s + 1 ).filter(s -> s % 2 == 0).limit(1000).forEach(System.out::println);
      List<Integer> li2 = new ArrayList<>();
     for (int i2 = 0 ; i2< 2001; i2++){
         if (i2%2 == 0){
             li2.add(i2);
         }
     }
    }

    public void executeStreams2(){
         Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] }).limit(92).forEach(p->System.out.println(p[0]));
    }

    public void executeStreams3(){
        Integer [] r = {1,2,3,4,5,6};
        Arrays.stream(r).mapToDouble(i -> i.doubleValue()).max();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.executeStreams1();
        m.executeStreams2();
    }
}
