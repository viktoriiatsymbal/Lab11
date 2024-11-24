package ua.edu.ucu.apps.task1;
import java.util.List;
import lombok.experimental.SuperBuilder;
import lombok.Singular;
import lombok.ToString;

@SuperBuilder
@ToString(callSuper=true)
public class Student extends User {
    @Singular("mark")
    private List<Integer> grades;
}
