public class Generics {
    public void maxString(String s1,String s2,String s3) {
        String MaxS = s2;
        if (s1.compareTo(MaxS) > 0) {
            MaxS = s1;

        }
        if (s2.compareTo(MaxS) > 0) {
            MaxS = s2;
        }
        if (s3.compareTo(MaxS) > 0) {
            MaxS = s3;
        }
        System.out.println(MaxS);
    }
        public static void main(String[] args) {
            System.out.println("Maximum float");
            Generics obj1=new Generics();
            obj1.maxString("apple","peach","banana");
        }

    }

