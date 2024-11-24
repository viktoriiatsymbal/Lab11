package ua.edu.ucu.apps.task1;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Sasha").age(18).mark(100).grades(Arrays.asList(99, 100)).gender("w").build();
        System.out.println(user);
    }
}
