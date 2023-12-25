public class School {
    public Employee[] Employees;
    public Teacher[] Teachers;
    public Learner[] Learners;
    public String Address;
    public String Name;
    public Class[] Classes;
    public Elective[] Electives;
    public Section[] Sections;

    public Teacher[] getListTeachers() {
        return Teachers;
    }

    public Employee[] getListEmployees() {
        return Employees;
    }

    public Learner[] getListLearners() {
        return Learners;
    }
    public void getElectronicJournal(){
        //Не сказано, что конкретно возвращать
    }
    public Participant[] getParticipants(){
        Participant[] participants = new Participant[Employees.length+ Teachers.length+ Learners.length];
        for (int i=0; i<Employees.length; i++){
            participants[i]=Employees[i];
        }
        for (int i=0; i< Teachers.length;i++){
            participants[i+ Employees.length]=Teachers[i+ Employees.length];
        }
        for (int i=0; i< Learners.length;i++){
            participants[i+ Employees.length+ Teachers.length]=Learners[i+ Employees.length+ Teachers.length];
        }
        return participants;
    }
    public Person[] AllPersonInSchool(){
        Person[] people = new Person[Employees.length+ Teachers.length+ 3*Learners.length];
        for (int i=0; i<Employees.length; i++){
            people[i]=Employees[i];
        }
        for (int i=0; i< Teachers.length;i++){
            people[i+ Employees.length]=Teachers[i+ Employees.length];
        }
        for (int i=0; i< Learners.length;i++){
            people[i+ Employees.length+ Teachers.length]=Learners[i+ Employees.length+ Teachers.length];
        }
        for (int i=0; i< 2*Learners.length;i++){
            people[i+ Employees.length+ Teachers.length+Learners.length]=Learners[i/2+ Employees.length+ Teachers.length].Parents[i%2];
        }
        return people;
    }
}
