package streams;

import lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        //how to make a stream from a collection
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael", "Monica");
        Stream<String> namesStream = names.stream();


        //how to collect from a stream into a collection
        List<String> namesCopy = names.stream()
                .filter(s -> s.startsWith("M"))
                .collect(Collectors.toList());

        //find first name in the collection if exists
        Optional<String> firstName = names.stream()
                .filter((s) -> s.startsWith("M"))
                .sorted()
                .findFirst();

        Optional<String> firstName1 = names.stream()
                .filter(s -> s.startsWith("M"))
                .findAny();

        List<String> names3 = Arrays.asList("Andrew", "Mrandon", "Michael", "Monica");
        OptionalDouble averageNameLengthOptional = names3.stream()
                .filter(s -> s.startsWith("M"))
                .mapToInt(String::length)
                .filter(i -> i>6)
                .average();
        averageNameLengthOptional.ifPresent(System.out::println);

        List<Person> personList = names.stream()
                .filter(s -> s.startsWith("M"))
                .map(name -> new Person(name, name, new Random().nextInt()))
                .collect(Collectors.toList());
        System.out.println(personList);
    }
}
