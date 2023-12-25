public class Class {
    public String Number;
    public Teacher ClassTeacher;
    public Learner[] Learners;

    public Learner[] getList(){
        return Learners;
    }
    public Parent[] getListParents(){
        Parent[] parents=new Parent[2*Learners.length];
        for (int i=0; i<2*Learners.length;i++){
            parents[i]=Learners[i/2].Parents[i%2];
        }
        return parents;
    }
}
