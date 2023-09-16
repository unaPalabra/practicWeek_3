public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kirill Dimidov", "1042", 2, 76.5f);
        Student student2 = new Student("Ivan Sokolov", "4201", 3, 90.1f);
        Student student3 = new Student("Andrey Goravec", "2023", 2, 81.7f);

        University university1 = new University("1023", "Новосибирский государственный медицинский университет", "НГМУ", 1965, StudyProfile.MEDICINE);
        University university2 = new University("995", "Институт земной коры", "ИЗК", 1949, StudyProfile.GEOLOGY);
        University university3 = new University("1002", "Государственный университет просвещения", "ГУП", 1971, StudyProfile.LINGUISTICS);

        System.out.println("Информация о студентах:\n" + student1 + "\n" + student2 + "\n" + student3);
        System.out.println("Учебные заведения:\n" + university1 + "\n" + university2 + "\n" + university3);
    }
}
