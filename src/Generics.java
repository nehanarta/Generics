public class Generics {
        public void maxInt(int x, int y, int z) {
            if (x > y && x > z) {
                System.out.println("Maximum Integers is = " + x);
            }
            if (y > x && y > z) {
                System.out.println("Maximum Integers is = " + y);
            }
            if (z > x && z > y) {
                System.out.println("Maximum Integers is = " + z);
            }
        }
        public static void main(String[] args) {
            System.out.println("Maximum number");
            Generics obj=new Generics();
            obj.maxInt(60,30,50);
        }

    }

