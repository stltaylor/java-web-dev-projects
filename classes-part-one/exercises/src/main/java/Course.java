import java.util.ArrayList;

public class Course {

        private String topic;
        public Teacher instructor;
        private ArrayList<Student> enrolledStudents;

        public void setTopic(String topic) {
            this.topic= topic;
        }
        public void setInstructor(Teacher instructor) {
            Teacher.getLastName() = instructor;
        }
        public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
            this.enrolledStudents= enrolledStudents;
        }
}
