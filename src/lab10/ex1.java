package lab10;

public class ex1 {

    public static void B(int x){
        System.out.println("Hello B "+x);
    }//B
    public static void main(String[] args) {
        System.out.println("Hello main");
        A();
        A();
        B(10);
        int s = C(10,20);
        System.out.println(s);A();
        System.out.println(C(50,50)*5);
    }//main
    public static void A(){
        System.out.println("Hello A");
    }//A
    public static int C(int x,int y){
        int z =x+y;
        System.out.println("Hello C "+z);
        B(z);

        return z;
    }

}
