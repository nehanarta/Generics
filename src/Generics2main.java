public class Generics2main {
    public static void main(String[] args){
        Generics2<Integer>G1=new Generics2<>(8,6,5);
        Generics2<Float>G2=new Generics2<>(1.3f,1.4f,1.9f);
        Generics2<String>G3=new Generics<>("apple","peach","Banana");
        G1.m1();
        G2.m1();
        G3.m1();
    }
}
