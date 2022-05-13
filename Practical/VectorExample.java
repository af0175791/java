import java.util.Vector;
public class VectorExample {
public static void main(String[] args) {
Vector<String> vc = new Vector<String>();
vc.add("Dog");
vc.add("Cat");
vc.add(0, "Tiger");
vc.add("Lion");

System.out.println(vc);

if(vc.contains("Cat")) {
System.out.println("element present");
}
else
System.out.println("not present");
}
}
