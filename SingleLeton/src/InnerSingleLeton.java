/**
 * Created by cx on 16/10/9.
 */
public class InnerSingleLeton {

    private InnerSingleLeton(){

    }
    public static InnerSingleLeton getInstance(){
        return Singleton.innerSingleLeton;
    }

    public static class Singleton{
        private static InnerSingleLeton innerSingleLeton = new InnerSingleLeton();
    }

    public static void main(String args[]){
        InnerSingleLeton innerSingleLeton1 = InnerSingleLeton.getInstance();
        InnerSingleLeton innerSingleLeton2 = InnerSingleLeton.getInstance();
        System.out.println(innerSingleLeton1);
        System.out.println(innerSingleLeton2);
    }
}
