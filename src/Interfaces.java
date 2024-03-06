import java.util.Arrays;

public class Interfaces {
    public interface IPrintable{
        void print();
    }

    public interface ICountable{
        int length();
    }

    public static class CustomVector<T> implements ICountable, IPrintable {


        int size;
        T[] body;

        public CustomVector(T... body) {
            this.body = body;
            this.size = body.length;
        }

        @Override
        public void print() {
            System.out.println(Arrays.toString(body));
        }

        @Override
        public int length() {
            return size;
        }
    }

    public static void main(String[] args) {
        IPrintable customVector1 = new CustomVector<>(5,7,4,3);
        ICountable customVector2 = new CustomVector<>(5,7,4,3);
        customVector1.print();
        //customVector1.length(); //-ошибка
        System.out.println(customVector2.length());
        //System.out.println(customVector1.length()); //-ошибка
    }
}
