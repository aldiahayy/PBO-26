package praktikum5.test.inheritance;
public class ChildClass extends AbstractClassKedua {
    public void methodChild() {
        System.out.println("Method dari ChildClass");
    }
    
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.methodPertama();
        obj.methodKedua();
        obj.methodChild();
    }
}
