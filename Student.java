import java.util.List;

import javax.swing.text.StringContent;

public class Student {
        private String firstName, lastName;
        private int studentNumber;
        private List<String> listOfActivities;
        public Student(String firstName, String lastName, int studentNumber, List<String> listOfActivities) {
            setFirstName(firstName);
            setLastName(lastName);
            setStudentNumber(studentNumber);
            this.listOfActivities = listOfActivities;
        }
        public String getFirstName() {
            return firstName;
        }
        private String sanetizeName(String name)
        {
            return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
        }
        public void setFirstName(String firstName) {
            this.firstName = sanetizeName(firstName);
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = sanetizeName(lastName);
        }
        public int getStudentNumber() {
            return studentNumber;
        }
        public void setStudentNumber(int studentNumber) {
            if (studentNumber < 0){
                throw new IllegalArgumentException("wrong id");
            }
            this.studentNumber = studentNumber;
        }
        public List<String> getListOfActivities() {
            return listOfActivities;
        }
        public void setListOfActivities(List<String> listOfActivities) {
            this.listOfActivities = listOfActivities;
        }
        
}
