package homework33;

public class Solution {
    public static void main(String[] args) {

        Course course1 = new Course("Biology", 200, "Emma");
        Course course2 = new Course("Geography", 150, "Victoria");
        Course course3 = new Course("History", 250, "Jack");
        Course course4 = new Course("Mathematics", 350, "Jhon");
        Course course5 = new Course("English", 300, "Bill");

        Student student1 = new Student("William", "Terner", 3);
        Student student2 = new Student("Sallivan",new Course[]{course1,course2, course3, course4, course5});

        CollegeStudent collegeStudent1 = new CollegeStudent("Daniel", "Craig", 5);
        CollegeStudent collegeStudent2 = new CollegeStudent("Murray", new Course[]{course1,course2, course3, course4, course5});
        CollegeStudent collegeStudent3 = new CollegeStudent("Oxford", 54, 5673);
        
        SpecialStudent specialStudent1 = new SpecialStudent("David", "May", 7);
        SpecialStudent specialStudent2 = new SpecialStudent("Cambridge", 46, 6743);
        SpecialStudent specialStudent3 = new SpecialStudent(678498);
    }
}
