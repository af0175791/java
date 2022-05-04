public class NonStaticLNestedClass {

int a = 25;
private int b = 45;
class Inner {
int res = a+b;
void show() {
System.out.println("value of res :" + res);
}
}
Inner i = new Inner();
i.show();
}
public static void main(String[] args) {
NonStaticLNestedClass c = new NonStaticLNestedClass();
NonStaticLNestedClass.Inner i = c.new Inner();
n.display();
}
