package composite_pattern;

public class client {
    public static void main(String[] args) {
        University university = new University("Tusing hua university","top class university");
        College college = new College("computer science","useful");
        Department department = new Department("ggg","gggggg");

        university.add(college);
        college.add(department);

        university.print();
//        college.print();
    }
}
