public class Teacher {
//    Within the same package, create a class Teacher that has
//        four fields: firstName, lastName, subject, and yearsTeaching.
//    Add getters and setters to the class and add the access level to each field and
//        method in the class. When adding your getters and setters,
//    think about what we read about in the section on Encapsulation.
        private String firstName;
        private String lastName;
        private String subject;
        private double yearsTeaching;

        public void setFirstName(String firstName) {
            this.firstName= firstName;
        }
        public static void setLastName(String lastName) {
            this.lastName= lastName;
        }
        public void setSubject(String subject) {
            this.subject= subject;
        }
        public void setYearsTeaching(double yearsTeaching) {
            this.yearsTeaching= yearsTeaching;
        }
        public String getFirstName(){
            return firstName;
        }
        public static String getLastName() {
            return lastName;
        }
        public String getSubject() {
            return subject;
        }
        public double setYearsTeaching() {
            return yearsTeaching;
        }


}
