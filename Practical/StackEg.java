import java.util.EmptyStackException;
import java.util.Stack;
public class StackEg {
public static void main(String[] args) {
Stack<Integer> st = new Stack<Integer>();

// checking stack is empty or not
boolean b = st.empty();
System.out.println(b);

// throws exception if the stack is empty
try {
st.pop();
}
catch(EmptyStackException e) {
System.out.println("empty stack" + e);
}

// adding elements in stack
st.push(22);
st.push(98);
st.push(12);
st.push(78);

// printing stack
System.out.println(st);

// adding elements in existing stack
st.push(86);
st.push(20);

System.out.println(st);

// fetch top element of stack
Integer i = st.peek();
System.out.println("top element : " + i);

// remove element from stack
st.pop();
System.out.println(st);

int j = st.search(78);
System.out.println("position is : " + j);
}
}
