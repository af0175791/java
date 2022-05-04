public class NonStaticNestedClass {

int a = 25;
private int b = 45;
class Inner {
int res = a+b;
void show() {
System.out.println("value of res :" + res);
}
}
public static void main(String[] args) {
NonStaticNestedClass c = new NonStaticNestedClass();
NonStaticNestedClass.Inner i = c.new Inner();
i.show();
}
}