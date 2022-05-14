package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream()
                .map(i -> i.intValue())
                .map(n -> Math.sqrt(n))
                .map(Double::intValue)
                .collect(toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users) {
        return users.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .distinct()
                .toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream()
                .limit(limit)
                .toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return Math.toIntExact(users.stream()
                .filter(d -> d.getAge() > 25)
                .count());
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::valueOf)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream()
                .mapToInt(w -> w.intValue())
                .sum();

    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream()
                .skip(toSkip)
                .toList();

    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream()
                .map(d -> d.split(" "))
                .findFirst()
                .map(key -> names.get(1))
                .stream().toList();


    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream()
                .map(c -> c.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
//        throw new UnsupportedOperationException();
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream()
                .map(User::getName)
                .collect(joining(", "));

    }

    public static double getAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .max()
                .getAsInt();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .min()
                .getAsInt();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
//        return users.stream()
//                .filter(User::isMale)
//                .count();
        throw new UnsupportedOperationException();

    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream()
                .anyMatch(w -> w.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream()
                .anyMatch(w -> w.getAge() != age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream()
                .findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();

    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return IntStream.of(stream.toArray())
                .boxed();

    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream
                .range(2, 30)
                .filter(number -> IntStream.range(2, number)
                        .noneMatch(divider -> number % divider == 0))
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {

        return Stream.generate(new Random()::nextInt)
                .limit(10).toList();

    }

    public static User findOldest(List<User> users) {
        return users.stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .get();

    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .mapToInt(w -> w.intValue())
                .sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .mapToInt(w -> w.intValue())
                .summaryStatistics();

    }


}

