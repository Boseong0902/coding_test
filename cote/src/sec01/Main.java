package sec01;

class A{
    int n = 1;
    @Override
    public String toString() {
        return "필드값 n = " + n;
    }
}

public class Main{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
    }
}