public class outerclass {
    public void display(){
        System.out.println("Outer class");
    }
    class inner{
        void display(){
            System.out.println("Inner class ");
        }
    }


}
class Main{
    public static void main(String[] args) {
        outerclass obj=new outerclass();
        obj.display();
        outerclass.inner obj2=obj.new inner();
        obj2.display();

    }
}
