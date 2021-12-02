public class Main {

    public static void main(String[] args) {
        Compare<Long> firstCompare = new Compare<>(1L, 2L, 3L);
        Compare<Long> secondCompare = new Compare<>(3L, 2L, 1L);
        Compare<Long> thirdCompare = new Compare<>(5L, 5L, 5L);
        System.out.println(firstCompare.compareTo(secondCompare));  // (-1 + 0 + 1) / 3
        System.out.println(secondCompare.compareTo(firstCompare));  // (1 + 0 + (-1)) / 3
        System.out.println(thirdCompare.compareTo(firstCompare));   // (1 + 1 + 1) / 3
    }
}
