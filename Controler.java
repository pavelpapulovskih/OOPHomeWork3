import java.util.List;

public class Controler {
    
    private final StudentGroupService studentGroupService = new StudentGroupService();
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }
    
        private Potok service;
    
        public Controler() {
            this.service = new Potok();
        }
    
        public void addGroup(StudentGroup group) {
            service.addGroup(group);
        }
    
        public void sortGroups() {
            service.sortGroups();
        }
    
}