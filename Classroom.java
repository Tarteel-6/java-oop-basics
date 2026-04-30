public class Classroom {

        private String[] students;

        public void setStudents(String [] students){
            this.students = students;
        }
        public String[] getStudents(){
            return students;
        }


        public String toString(){
            return "the name of the student is " + getStudents();
        }

}
