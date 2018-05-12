import java.util.HashMap;

public class newhashMap {
    private String[] splitSting(String email){
        String em[] = email.split("@");
        return em;
    }
    private void setData(String email,HashMap<String,String> data){
        String[] em=splitSting(email);
        data.put(em[0],em[1]);
    }

    private void run(){
        HashMap<String,String> data = new HashMap<>();
        setData("zhangsan@sohu.com",data);
        setData("lisi@163.com",data);
        setData("wangwu@sina.com",data);

        System.out.println(data);
    }

    public static void main(String args[]){
        new newhashMap().run();
    }

}
