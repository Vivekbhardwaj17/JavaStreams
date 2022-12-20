import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args ){
        Stream<String> streamEmpty = Stream.empty();
        streamEmpty =
                Stream.<String>builder().add("a").add("b").add("c").build();
        streamEmpty =
                Stream.generate(() -> "element").limit(10);
        Stream<Integer> streamIterated =
                Stream.iterate(40, n -> n + 2).limit(20);

        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
    }
}
