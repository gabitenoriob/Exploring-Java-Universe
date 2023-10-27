package cap_4;

public class StudentTest {
    public static void main(String[] args)
    {
        Student student = new Student("Gabriela", 7.5);
        System.out.printf("%s sua nota é %s\n", student.getName(), student.getLetterGrade());
    }
}
