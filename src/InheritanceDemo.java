public class InheritanceDemo extends Parent{

    public static void main(String[] args) {
        Parent idemo = new Parent();
        idemo.basicFunction();
    }
}
class Parent{
    public void basicFunction(){
        System.out.println("Inside parent class");
    }
}

