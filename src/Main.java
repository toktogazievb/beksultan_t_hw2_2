import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> footballers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            footballers.add(scanner.next());
        }
        System.out.println(footballers);
        ArrayList<String> f1Drivers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            f1Drivers.add(scanner.next());
        }
        System.out.println(f1Drivers);

        Collections.reverse(f1Drivers);
        ArrayList<String> sports = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sports.add(footballers.get(i));
            sports.add(f1Drivers.get(i));
        }
        System.out.println(sports);

        sports.sort(Comparator.comparing(String::length));
        System.out.println(sports);

    }
}