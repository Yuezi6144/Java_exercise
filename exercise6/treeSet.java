import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    double score;

    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return name+":"+score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score-o.score>0){
            return -1;
        }else{
            return 1;
        }
    }
}

public class treeSet {
    private void initData(){
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("刘德华",90));
        students.add(new Student("张学友",40));
        students.add(new Student("刘杰",55));
        students.add(new Student("张子怡",90));
        students.add(new Student("周迅",60));

        for (Student student:students
             ) {
            System.out.println(student);
        }
        double all = 0.0;
        for (Student student:students
             ) {
            all+=student.score;
        }
        System.out.println();
        System.out.println("平均成绩为："+all/students.size());
    }

    public static void main(String args[]){
        new treeSet().initData();
    }
}
