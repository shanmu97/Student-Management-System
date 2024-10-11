import java.util.*;

public class StudentData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> oneStudents = new ArrayList<>();
        ArrayList<Student> twoStudents = new ArrayList<>();
        ArrayList<Student> threeStudents = new ArrayList<>();
        ArrayList<Student> fourStudents = new ArrayList<>();
        // Commands

        System.out.println("1 - Enroll single Student" +
                "\n2 - Enroll Multiple Students");
        System.out.print("Enter the command: ");

        int n = sc.nextInt();
        // Create the number of students with respect to input
        if (n == 2) {
            System.out.print("Enter the number of Students to Enroll: ");
            int studentsCount = sc.nextInt();
            for (int i = 0; i < studentsCount; i++) {
                Student st = new Student();
                st.courseData();
                st.enroll();
                st.payBalance();
                if (st.year() == 1)
                    oneStudents.add(st);
                if (st.year() == 2)
                    twoStudents.add(st);
                if (st.year() == 3)
                    threeStudents.add(st);
                if (st.year() == 4)
                    fourStudents.add(st);
            }
        }
        if (n == 1) {
            Student st = new Student();
            st.courseData();
            st.enroll();
            st.payBalance();
            if (st.year() == 1)
                oneStudents.add(st);
            if (st.year() == 2)
                twoStudents.add(st);
            if (st.year() == 3)
                threeStudents.add(st);
            if (st.year() == 4)
                fourStudents.add(st);
        }
        // display the students info
        for (int i = 0; i < oneStudents.size(); i++) {
            oneStudents.get(i).showInfo();
        }
        for (int i = 0; i < twoStudents.size(); i++) {
            twoStudents.get(i).showInfo();
        }
        for (int i = 0; i < threeStudents.size(); i++) {
            threeStudents.get(i).showInfo();
        }
        for (int i = 0; i < fourStudents.size(); i++) {
            fourStudents.get(i).showInfo();
        }
    }

}
