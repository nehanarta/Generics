public class Generics {
        public static <T extends Comparable> T printMaxNum(T x, T y, T z) {
            T max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            return max;
        }
        public static void main(String[] args) {
            System.out.println("three two one generics");
            Generics obj1=new Generics();
            obj1.printMaxNum(60,89,90);
            obj1.printMaxNum(1.1f,1.2f,1.3f);
            obj1.printMaxNum("apple","peach","banana");
        }

    }

