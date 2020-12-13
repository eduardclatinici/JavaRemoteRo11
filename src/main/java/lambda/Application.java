package lambda;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Application {

    public static void main(String[] args) {
        Person person1 = new Person("Eduard", "Clatinici", 24);
        Person person2 = new Person("Codrut", "Arotaritei", 18);

        Predicate<Person> personClassicPredicate = person -> {
            boolean someCondition = person.getLastName().startsWith("A");
            boolean someOtherCondition = person.getFirstName().startsWith("A");
            return someCondition && someOtherCondition;
        };

        Predicate<Person> lastNameStartWithA = person -> person.getLastName().startsWith("A");

        System.out.println("Last name of person 1 start with A: " + lastNameStartWithA.test(person1));
        System.out.println("Last name of person 2 start with A: " + lastNameStartWithA.test(person2));


        Runnable myRunnable = () -> {
            System.out.println("Running a runnable");
            try {
                Thread.sleep(1000);
                System.out.println("I just slept for 1 second");
                Thread.sleep(1000);
                System.out.println("Another one :)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        //myRunnable.run();

        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));


        // Method apply returns Integer and the type of the parameter is String
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("ABCDE"));
        // Method apply returns String and the type of the parameter is String
        Function<String, String> replaceCommasWithDotsFunction = s -> s.replace(',', '.');
        System.out.println(replaceCommasWithDotsFunction.apply("a,b,c"));
        System.out.println(replaceCommasWithDotsFunction.apply("java,.Net, python"));

        Predicate<Person> isAdultTest = Person::isAdult;
        System.out.println(isAdultTest.test(person1));

        System.out.println("Supplier");
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        int randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumberSupplier.get() + " another one: " + randomNumberSupplier.get());


        System.out.println("Consumer");
        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value: " + d);
        printWithPrefixConsumer.accept(10.5);

        System.out.println("UnaryOperator");
        UnaryOperator<Integer> toSquareUnaryOperator = myParatemer -> myParatemer * myParatemer;
        System.out.println(toSquareUnaryOperator.apply(5));

        System.out.println("UnaryOperator block of code");
        UnaryOperator<Integer> toSquareUnaryOperator1 = i -> {
            int result = i * i;
            System.out.println("Result: " + result);
            return result;
        };
        System.out.println(toSquareUnaryOperator1.apply(4));

        System.out.println("Optional");

        doSmth("asd");
        //doSmth(null);

        System.out.println("Opional usage");
        //doSmth2(null);
        doSmth2(null);
    }

    private static void doSmth(String myString){
        // of method does not allow null value
        Optional<String> stringOptional1 = Optional.of(myString);
        // ofNullable method does allow null value
        Optional<String> stringOptional2 = Optional.ofNullable(myString);
    }

    private static void doSmth2(String myString){
        Optional<String> myOptional = Optional.ofNullable(myString);
        if(myOptional.isPresent()){
            System.out.println("Is present");
        }
        myOptional.ifPresent(System.out::println);
        String value = myOptional.orElse("OtherString");
        String value2 = myOptional.orElseGet(() -> "smth" + new Random().nextInt());
        System.out.println(value);
        System.out.println(value2);
    }


}
