import java.util.LinkedList;

class Student {
    String name;
    double score;

    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return name+":"+score;
    }

    public void setScore(double score){
        this.score = score;
    }

    public String reName(){
        return name;
    }
}

public class Main{

    private void delName(String name,LinkedList<Student> studel){
        for (Student students:studel
             ) {
            if(name.equals(students.reName())){
                studel.remove(name);
                break;
            }
        }
    }

    private void rewriteScore(String name,double score,LinkedList<Student> stu){
        for (Student restu:stu
                ) {
            if(name.equals(restu.name)){
                restu.setScore(score);
            }
        }
    }

    private void scoreLow(LinkedList<Student> stu){
        for (Student student:stu
                ) {
            if(student.score<60){
                System.out.println(student.reName());
            }
        }
    }
    private void run(){
        LinkedList<Student> stu = new LinkedList<>();
        stu.add(new Student("刘德华",90));
        stu.add(new Student("张学友",40));
        stu.add(new Student("刘杰",55));
        stu.add(new Student("章子怡",90));
        stu.add(new Student("周迅",60));
        System.out.println("LinkedList的元素个数："+stu.size()+"\n");

        delName("周迅",stu);
        System.out.println(stu);
        System.out.println();

        System.out.println("不及格名单：");
        scoreLow(stu);
        System.out.println();

        System.out.println("成绩修改：");
        rewriteScore("张学友",90,stu);
        System.out.println(stu);


    }
    public static void main(String args[]){
        new Main().run();
    }
}
