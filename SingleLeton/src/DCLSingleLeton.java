import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by cx on 16/10/8.
 */
public class DCLSingleLeton implements Serializable{

    private static volatile DCLSingleLeton dclSingleLeton = null;

    private DCLSingleLeton() {

    }

    private static DCLSingleLeton getInstance() {
        if (dclSingleLeton == null) {
            synchronized (DCLSingleLeton.class) {
                if (dclSingleLeton == null) {
                    dclSingleLeton = new DCLSingleLeton();
                }
            }
        }
        return dclSingleLeton;
    }

    /**
     * 避免反序列化重新创建对象
     * @return
     * @throws ObjectStreamException
     */
    private static Object readResolve() throws ObjectStreamException{
        return dclSingleLeton;
    }

    public static void main(String[] args) {
        DCLSingleLeton singleLeton1 = DCLSingleLeton.getInstance();
        DCLSingleLeton dclSingleLeton2 = DCLSingleLeton.getInstance();
        System.out.println(singleLeton1);
        System.out.println(dclSingleLeton2);
    }
}
