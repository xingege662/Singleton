/**
 * Created by cx on 16/10/9.
 */
public class NormalSingleton {

    private static NormalSingleton normalSingleton = new NormalSingleton();

    private NormalSingleton() {
    }

    public static NormalSingleton getInstance() {
        return normalSingleton;
    }

    public static void main(String[] args) {
        NormalSingleton normalSingleton1 = NormalSingleton.getInstance();
        NormalSingleton normalSingleton2 = NormalSingleton.getInstance();

        System.out.println(normalSingleton1);
        System.out.println(normalSingleton2);
        System.out.println(normalSingleton1 == normalSingleton2);
    }
}
