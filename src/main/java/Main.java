import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                ReadingXLS.readXlsUniversity("src/main/resources/universityInfo.xlsx");
        for (University university : universities) {
            System.out.println(university);
        }

        System.out.println();

        List<Student> students =
                ReadingXLS.readXlsStudents("src/main/resources/universityInfo.xlsx");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

