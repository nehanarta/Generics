public class Generics2<T extends Comparable>{
    T x;
    T y;
    T z;
    public Generics2(T x,T y,T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public T m1() {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;

    }
}

