import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorEg {
   public static void main(String[] args) {
      List<String> aList = new ArrayList<String>();
      aList.add("Yogii");
      aList.add("Keerthi");
      aList.add("Ayshu");
      aList.add("Pavi");
      aList.add("Mamta");
      Iterator i = aList.iterator();
      System.out.println("The ArrayList elements are:");
      while (i.hasNext()) {
         System.out.println(i.next());
      }
   }
}