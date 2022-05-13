import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListEg {
public static void main(String[] args) {
LinkedList<String> aL = new LinkedList<String>();
aL.add("Ayshu");
aL.add("Keerthi");
aL.add("Yogesh");
aL.add("Sekar");
aL.add("Selvi");
aL.add(0, "Yamu");
aL.addFirst("Preethi");
aL.add(2, "Aadhira");
aL.addLast("Swathi");

Iterator<String> itr = aL.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}

aL.removeLast();
aL.removeFirst();
aL.remove(2);

System.out.println("List after removal");
Iterator<String> itr1 = aL.iterator();
while(itr1.hasNext()) {
System.out.println(itr1.next());
}

System.out.println("List in reverse order");
Iterator<String> itrr = aL.descendingIterator();
while(itrr.hasNext()) {
System.out.println(itrr.next());
}
}
}