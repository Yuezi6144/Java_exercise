import java.util.LinkedList;

class Student{
    String name;
    double score;

    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setScore(double score){
        this.score = score;
    }

    public double getScore(){
        return score;
    }

    public String toString(){
        return name+":"+score;
    }
}

public class newLinkedlist {
    private void deletPerson(String name,LinkedList<Student> student){
        for (Student students:student
                ) {
            if(name.equals(students.name)){
                student.remove(students);
            }
        }
    }

    private void reScore(String name,double score,LinkedList<Student> students){
       for (Student student:students
            ) {
           if(name.equals(student.name)){
               student.setScore(score);
           }
       }
    }

    private void lowScore(LinkedList<Student> students){
       for (Student student:students
            ) {
           if(student.score<60){
               System.out.println(student.name);
           }
       }
    }

    public void run(){
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("刘德华",90));
        students.add(new Student("张学友",40));
        students.add(new Student("刘杰",55));
        students.add(new Student("章子怡",90));
        students.add(new Student("周迅",60));
        System.out.println("Linkedlist中元素个数为："+students.size());
        System.out.println();
        System.out.println("删除人员：");
        deletPerson("周迅",students);
        System.out.println(students);
        System.out.println();

        System.out.println("成绩更改：");
        reScore("张学友",90,students);
        System.out.println(students);
        System.out.println();

        System.out.println("不及格人员：");
        lowScore(students);

    }

    public static void main(String args[]){
        new newLinkedlist().run();
    }
}
