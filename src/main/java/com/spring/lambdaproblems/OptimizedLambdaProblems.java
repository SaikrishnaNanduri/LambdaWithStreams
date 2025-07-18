package com.spring.lambdaproblems;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptimizedLambdaProblems {

    // 1. Runnable using Lambda
    public static void simpleRunnableExample() {
        Runnable r = () -> System.out.println("1. simpleRunnableExample => Hello, Lambda!");
        new Thread(r).start();
    }

    // 2. List iteration with forEach
    public static void iterateListWithLambda() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        System.out.println("2. iterateListWithLambda:");
        list.forEach(System.out::println);
    }

    // 3. Filtering elements that start with 'J'
    public static void filterListWithLambda() {
        List<String> list = Arrays.asList("Java", "Javascript", "Python", "C");
        List<String> filtered = list.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println("3. filterListWithLambda => starts with 'J':");
        filtered.forEach(System.out::println);
    }

    // 4. Alphabetical sorting
    public static void sortListWithLambda() {
        List<String> sorted = Arrays.asList("Java", "Kafka", "Lambda");
        sorted.sort(String::compareTo);
        System.out.println("4. sortListWithLambda => sorted alphabetically:");
        sorted.forEach(System.out::println);
    }

    // 5. Custom Functional Interface for Calculator
    public static void useCustomFunctionalInterface() {
        Calculator add = Integer::sum;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("5. useCustomFunctionalInterface => Addition: " + add.calculate(5, 3));
        System.out.println("5. useCustomFunctionalInterface => Multiplication: " + multiply.calculate(4, 3));
    }

    // 6. Iterating Map with Lambda
    public static void lambdaWithMapIteration() {
        Map<String, Integer> map = Map.of("Java", 8, "SpringBoot", 5, "Lambda", 1);
        System.out.println("6. lambdaWithMapIteration:");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    // 7. Thread with Lambda
    public static void threadWithLambda() {
        new Thread(() -> System.out.println("7. threadWithLambda => Thread with Lambda!")).start();
    }

    // 8. Comparator sorting by string length
    public static void lambdaInComparator() {
        List<String> list = Arrays.asList("Java", "Kafka", "Lambda");
        list.sort(Comparator.comparing(String::length));
        System.out.println("8. lambdaInComparator => sorted by length:");
        list.forEach(System.out::println);
    }

    // 9. Method Reference Example
    public static void methodReferenceExample() {
        List<String> list = Arrays.asList("Java", "Kafka", "Lambda");
        System.out.println("9. methodReferenceExample:");
        list.forEach(System.out::println);
    }

    // 10. Optional with ifPresent
    public static void lambdaWithOptional() {
        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(s -> System.out.println("10. lambdaWithOptional => Value is present: " + s));
    }

    // 11. Predicate to check empty string
    public static void lambdaWithPredicate() {
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println("11. lambdaWithPredicate => isEmpty(\"\"): " + isEmpty.test(""));
        System.out.println("11. lambdaWithPredicate => isEmpty(\"Java\"): " + isEmpty.test("Java"));
    }

    // 12. BiFunction for addition
    public static void lambdaWithBiFunction() {
        BiFunction<Integer, Integer, Integer> addition = Integer::sum;
        System.out.println("12. lambdaWithBiFunction => 2 + 3 = " + addition.apply(2, 3));
    }

    // 13. Consumer example
    public static void lambdaWithConsumer() {
        Consumer<String> print = s -> System.out.println("13. lambdaWithConsumer => " + s);
        print.accept("Hello World Consumer!");
    }

    // 14. Supplier returns value
    public static void lambdaWithSupplier() {
        Supplier<String> supplier = () -> "Java Supplier";
        System.out.println("14. lambdaWithSupplier => " + supplier.get());
    }

    // 15. Function to get string length
    public static void lambdaWithFunction() {
        Function<String, Integer> length = String::length;
        System.out.println("15. lambdaWithFunction => Length of 'Lambda with function': " +
                length.apply("Lambda with function"));
    }

    // 16. UnaryOperator for square
    public static void lambdaWithUnaryOperator() {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("16. lambdaWithUnaryOperator => Square of 5: " + square.apply(5));
    }

    // 17. BinaryOperator for multiplication
    public static void lambdaWithBinaryOperator() {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("17. lambdaWithBinaryOperator => 2 * 3 = " + multiply.apply(2, 3));
    }

    // 18. Predicate for even check
    public static void checkEvenNumbersWithLambda() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("18. checkEvenNumbersWithLambda => 4 is even: " + isEven.test(4));
        System.out.println("18. checkEvenNumbersWithLambda => 5 is even: " + isEven.test(5));
    }

    // 19. Custom sort descending
    public static void customSortingWithLambda() {
        List<String> list = Arrays.asList("Apple", "Pear", "Grapes");
        list.sort(Comparator.reverseOrder());
        System.out.println("19. customSortingWithLambda => Descending:");
        list.forEach(System.out::println);
    }

    // 20. Convert to uppercase
    public static void uppercaseConversionWithLambda() {
        List<String> list = Arrays.asList("java", "spring", "lambda");
        List<String> upperList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("20. uppercaseConversionWithLambda:");
        upperList.forEach(System.out::println);
    }

    // 21. Reduce to sum
    public static void streamReduceWithLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("21. streamReduceWithLambda => Sum: " + sum);
    }

    // 22. Distinct elements
    public static void streamDistinctWithLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("22. streamDistinctWithLambda => Unique values:");
        numbers.stream().distinct().forEach(System.out::println);
    }

    // 23. Filter even numbers
    public static void streamFilterWithLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("23. streamFilterWithLambda => Even numbers:");
        evenNumbers.forEach(System.out::println);
    }

    // 24. Map to lowercase
    public static void streamMapWithLambda() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        System.out.println("24. streamMapWithLambda => Lowercase:");
        list.stream().map(String::toLowerCase).forEach(System.out::println);
    }

    // 25. Sorted stream
    public static void streamSortedWithLambda() {
        List<String> list = Arrays.asList("Banana", "Pear", "Grapes");
        System.out.println("25. streamSortedWithLambda => Sorted:");
        list.stream().sorted().forEach(System.out::println);
    }

    // 26. Lambda with Stream Count
    public static void streamWithCount() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        long count = numbers.stream().count();
        System.out.println("26. streamWithCount => Count: " + count);
    }

    // 27. Lambda with Stream AnyMatch
    public static void streamSearchWithAnyMatch() {
        List<String> list = Arrays.asList("Banana", "Pears", "Grapes");
        boolean containsJava = list.stream().anyMatch(s -> s.equals("Java"));
        System.out.println("27. streamSearchWithAnyMatch => Contains 'Java': " + containsJava);
    }

    // 28. Lambda with Stream AllMatch
    public static void streamWithAllMatch() {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = list.stream().allMatch(n -> n % 2 == 0);
        System.out.println("28. streamWithAllMatch => All even: " + allEven);
    }

    // 29. Lambda with Stream NoneMatch
    public static void streamWithNoneMatch() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean noPython = list.stream().noneMatch(s -> s.equals("Python"));
        System.out.println("29. streamWithNoneMatch => Contains no Python: " + noPython);
    }

    // 30. Lambda with Stream FindFirst
    public static void streamWithFindFirst() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Optional<String> first = list.stream().findFirst();
        System.out.print("30. streamWithFindFirst => First element: ");
        first.ifPresent(System.out::println);
    }

    // 31. Lambda with Stream FindAny
    public static void streamWithFindAny() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Optional<String> any = list.stream().findAny();
        System.out.print("31. streamWithFindAny => Any element: ");
        any.ifPresent(System.out::println);
    }

    // 32. Lambda for Summing Integers
    public static void streamForSummingIntegers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("32. streamForSummingIntegers => Sum: " + sum);
    }

    // 33. Lambda for Max Integers
    public static void streamForMaxIntegers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("33. streamForMaxIntegers => Max: " + max);
    }

    // 34. Lambda for Min Integers
    public static void streamForMinIntegers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println("34. streamForMinIntegers => Min: " + min);
    }

    // 35. Lambda with Stream for Joining Strings
    public static void streamForJoiningStrings() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String joined = list.stream().collect(Collectors.joining(","));
        System.out.println("35. streamForJoiningStrings => Joined: " + joined);
    }

    // 36. Lambda with Stream MapToInt
    public static void streamMapToInt() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        System.out.println("36. streamMapToInt => String lengths:");
        list.stream().mapToInt(String::length).forEach(System.out::println);
    }

    // 37. Lambda with Stream collect to Set
    public static void streamCollectToSet() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Spring");
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println("37. streamCollectToSet => Unique elements:");
        set.forEach(System.out::println);
    }

    // 38. Lambda with Stream GroupingBy
    public static void streamGroupingBy() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Java");
        Map<String, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("38. streamGroupingBy => Frequency count:");
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    // 39. Lambda with Stream PartitioningBy
    public static void streamWithPartitioningBy() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitions = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("39. streamWithPartitioningBy => Partitioned:");
        partitions.forEach((k, v) -> System.out.println((k ? "Even" : "Odd") + ": " + v));
    }

    // 40. Lambda with Stream Counting
    public static void streamWithCounting() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        long count = list.stream().collect(Collectors.counting());
        System.out.println("40. streamWithCounting => Count: " + count);
    }

    // 41. Lambda with Stream SummarizingInt
    public static void streamWithSummarizingInt() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("41. streamWithSummarizingInt:");
        System.out.println("  Sum: " + stats.getSum());
        System.out.println("  Average: " + stats.getAverage());
        System.out.println("  Max: " + stats.getMax());
        System.out.println("  Min: " + stats.getMin());
    }

    // 42. Lambda with Stream Grouping by Length
    public static void streamGroupingByLength() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("42. streamGroupingByLength => Grouped by length:");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    // 43. Lambda with Stream Joining without Delimiter
    public static void streamJoiningWithoutDelimiter() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String joined = list.stream().collect(Collectors.joining());
        System.out.println("43. streamJoiningWithoutDelimiter => " + joined);
    }

    // 44. Lambda with Stream ToMap
    public static void streamWithToMap() {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("44. streamWithToMap => String to length mapping:");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    // 45. Lambda for Creating a Stream
    public static void createStream() {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda");
        System.out.println("45. createStream => Created stream:");
        stream.forEach(System.out::println);
    }

    // 46. Lambda with Stream Limit
    public static void streamWithLimit() {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        System.out.println("46. streamWithLimit => First 2 elements:");
        stream.limit(2).forEach(System.out::println);
    }

    // 47. Lambda with Stream Skip
    public static void streamWithSkip() {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        System.out.println("47. streamWithSkip => Skip first 2 elements:");
        stream.skip(2).forEach(System.out::println);
    }

    // 48. Lambda with Stream Peek
    public static void streamWithPeek() {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        System.out.println("48. streamWithPeek => Peek at elements:");
        List<String> result = stream.peek(s -> System.out.println("  Processing: " + s))
                .collect(Collectors.toList());
        System.out.println("  Result: " + result);
    }

    // 49. Lambda with Optional OrElse
    public static void streamWithOptionalOrElse() {
        Optional<String> optional = Optional.empty();
        String result = optional.orElse("Default Value");
        System.out.println("49. streamWithOptionalOrElse => " + result);
    }

    // 50. Lambda with CompletableFuture (Async Processing)
    public static void lambdaWithCompletableFuture() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Async Lambda Result";
        });

        future.thenAccept(result ->
                System.out.println("50. lambdaWithCompletableFuture => " + result)
        );

        // Wait for completion (in real scenarios, you might handle this differently)
        try {
            future.get(); // This will block until completion
        } catch (Exception e) {
            System.err.println("Error in async operation: " + e.getMessage());
        }
    }

    // Custom Functional Interface
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    // Main method to run all examples
    public static void main(String[] args) {
        System.out.println("=== Lambda Expressions Examples ===\n");

        // Run all 50 examples
        simpleRunnableExample();
        iterateListWithLambda();
        filterListWithLambda();
        sortListWithLambda();
        useCustomFunctionalInterface();
        lambdaWithMapIteration();
        threadWithLambda();
        lambdaInComparator();
        methodReferenceExample();
        lambdaWithOptional();
        lambdaWithPredicate();
        lambdaWithBiFunction();
        lambdaWithConsumer();
        lambdaWithSupplier();
        lambdaWithFunction();
        lambdaWithUnaryOperator();
        lambdaWithBinaryOperator();
        checkEvenNumbersWithLambda();
        customSortingWithLambda();
        uppercaseConversionWithLambda();
        streamReduceWithLambda();
        streamDistinctWithLambda();
        streamFilterWithLambda();
        streamMapWithLambda();
        streamSortedWithLambda();
        streamWithCount();
        streamSearchWithAnyMatch();
        streamWithAllMatch();
        streamWithNoneMatch();
        streamWithFindFirst();
        streamWithFindAny();
        streamForSummingIntegers();
        streamForMaxIntegers();
        streamForMinIntegers();
        streamForJoiningStrings();
        streamMapToInt();
        streamCollectToSet();
        streamGroupingBy();
        streamWithPartitioningBy();
        streamWithCounting();
        streamWithSummarizingInt();
        streamGroupingByLength();
        streamJoiningWithoutDelimiter();
        streamWithToMap();
        createStream();
        streamWithLimit();
        streamWithSkip();
        streamWithPeek();
        streamWithOptionalOrElse();
        lambdaWithCompletableFuture();

        System.out.println("\n=== All 50 Lambda Examples Completed ===");
    }
}