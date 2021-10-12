import java.util.Scanner;

public class Box {
    public int l,b,h;
    Box(int a,int b,int c){
        l=a;
        this.b=b;
        h=c;
    }

}
class Box3d extends Box{
    int a;
    int v;

   Box3d(int a, int b, int c) {
        super(a, b, c);
    }

    public void area(int l,int b,int h){
        a=2*(l*b+b*h+h*l);
        System.out.println("Area is:"+a);

    }
    public void volume(int l,int b,int h){
        v=l*b*h;
        System.out.println("Volume is:"+v);

    }
}
class Demo{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int a=sc.nextInt();
        System.out.println("Enter Breadth");
        int b=sc.nextInt();
        System.out.println("Enter Height");
        int c=sc.nextInt();
        Box3d obj=new Box3d(a,b,c);
        obj.area(a,b,c);
        obj.volume(a,b,c);
    }

}

