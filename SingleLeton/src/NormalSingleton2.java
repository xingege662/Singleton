/**
 * Created by cx on 16/10/9.
 */
public class NormalSingleton2 {
    private static NormalSingleton2 normalSingleton2 = null;

    private NormalSingleton2() {
    }

    public static synchronized NormalSingleton2 getNormalSingleton2() {
        if (normalSingleton2 == null) {
            normalSingleton2 = new NormalSingleton2();
        }
        return normalSingleton2;
    }

    public static void main(String[] args){
        NormalSingleton2 normalSingleton1 = NormalSingleton2.getNormalSingleton2();
        NormalSingleton2 normalSingleton2 = NormalSingleton2.getNormalSingleton2();

        System.out.println(normalSingleton1==normalSingleton2);
    }

}
