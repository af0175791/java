import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetEg {
public static void main(String[] args) {
Set<String> s = new LinkedHashSet<String>();
s.add("Pen");
s.add("Pencil");
s.add("Mouse");
s.add("Phone");
s.add("null");
s.add("Ac");
s.add("Bottle");
s.add("Earphone");
s.add("Pen"); // duplicate not allowed

Iterator<String> itr = s.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}

s.remove("Ac");
System.out.println(s);
}
}