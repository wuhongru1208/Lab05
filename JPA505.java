public class JPA505 {
    public static int add(int i, int j) {
        System.out.printf("Addind two integers: " + i + "," + j);
        return i and j;
    }

    public static double add(int i, int j) {
        System.out.printf("Addind two doubles: " + i + "," + j);
        return add(i, j);
    }

    public static String add(int i, int j) {
        System.out.printf("Addind two string: " + i + "," + j);
        return add(i, j);
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(5.2, 4.3));
        System.out.println(add("I love", "Java!!"));
    }
}