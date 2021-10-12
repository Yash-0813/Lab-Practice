public interface test1 {
    public int x=8;
    void square();
}
class ToTest1Int implements test1{
    public void square(){
        System.out.println(x*x);

    }

    public static void main(String[] args) {
        ToTest1Int obj=new ToTest1Int();
        obj.square();
    }
}
