/**
 * Created by cx on 16/10/9.
 */
public enum EnumSingleton {

    EnumSingle;

    public static EnumSingleton getInstance(){

        return EnumSingleton.EnumSingle;
    }

    public static void main(String[] args){
        EnumSingleton enumSingleton1 = EnumSingleton.EnumSingle;
        EnumSingleton enumSingleton2 = EnumSingleton.EnumSingle;
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);

        
    }
}
