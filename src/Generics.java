public class Generics {
        public void maxFloat(float x, float y, float z) {
            if (x > y && x > z) {
                System.out.println("Maximum Float is = " + x);
            }
            if (y > x && y > z) {
                System.out.println("Maximum Float is = " + y);
            }
            if (z > x && z > y) {
                System.out.println("Maximum Float is = " + z);
            }
        }
        public static void main(String[] args) {
            System.out.println("Maximum float");
            Generics obj1=new Generics();
            obj1.maxFloat(2.1f,3.3f,4.4f);
        }

    }

