import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        WordCounter();
    }

    public static void taskOne() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void taskTwo() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;

            }
        }
    }

    public static void taskThree() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void WordCounter() {
            List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

            Map<String, Integer> wordCounts = new HashMap<>();

            for (String word : strings) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }

            for (int count : wordCounts.values()) {
                System.out.println(count);
            }
        }
    }

