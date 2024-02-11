import java.util.Arrays;

class StudentManager {
    private Student[] students;
    private Grade[][] grades;
    private int studentCount;

    public StudentManager() {
        this.students = new Student[10];
        this.grades = new Grade[10][];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount == students.length) {
            int newCapacity = students.length * 2;
            students = Arrays.copyOf(students, newCapacity);
            grades = Arrays.copyOf(grades, newCapacity);
            for (int i = studentCount; i < newCapacity; i++) {
                grades[i] = new Grade[0];
            }
        }


        students[studentCount] = student;
        grades[studentCount] = new Grade[0];
        System.out.println("Student " + student.name + " aded");
        studentCount++;
    }

    public void addGrade(Student student, String subject, double grade) {
        int studentIndex = findStudentIndex(student);
        if (studentIndex != -1) {
            Grade newGrade = new Grade(student, subject, grade);
            Grade[] studentGrades = grades[studentIndex];
            Grade[] newGrades = new Grade[studentGrades.length + 1];
            System.arraycopy(studentGrades, 0, newGrades, 0, studentGrades.length);
            newGrades[newGrades.length - 1] = newGrade;
            grades[studentIndex] = newGrades;
            System.out.println("Mark " + grade + " subject " + subject + " for student " + student.name + " added");
        } else {
            System.out.println("Student " + student.name + " not found");
        }
    }

    public double getAverageGrade(Student student) {
        int studentIndex = findStudentIndex(student);
        if (studentIndex != -1) {
            Grade[] studentGrades = grades[studentIndex];
            if (studentGrades.length > 0) {
                double sum = 0.0;
                for (Grade grade : studentGrades) {
                    sum += grade.grade;
                }
                return sum / studentGrades.length;
            } else {
                System.out.println("Studet " + student.name + " has no marks");
            }
        } else {
            System.out.println("Student " + student.name + " not ffound");
        }
        return 0.0;
    }



    private int findStudentIndex(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }
}