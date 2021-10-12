/*Create class point with following instance variable and methods.
        Instance variable: private int x,y
        Constructors : public Point(), Point(int x, int y)
        Methods : public void setX(int x), setY(int y), setXY(int x, int y)*/


        import java.util.Scanner;

public class point {
    private int x,y;
    public point(){


    }
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int  setX(int x) {
        this.x = x;
        return x;
    }

    public int getY() {
        return y;
    }

    public int  setY(int y) {
        this.y = y;
        return y;
    }
    public void  setXY(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        point obj=new point();
        point obj1=new point(a,b);
        System.out.println(obj.setX(a));
        System.out.println(obj.setY(b));
        obj1.setXY(a,b);

    }
}
