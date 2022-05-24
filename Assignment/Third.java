public class Third{
public static void main(String[] args){
String string = "The quick brown fox jumps over the lazy dog";
string = string.toLowerCase();
char[] letters = new char[26];
for(int i = 0; i < letters.length; i++){
letters[i] = (char)('a' + i);
}
System.out.println(Arrays.toString(letters));

for(int i = 0; i < letters.length; i++){
for(int j = 0; j < string.length(); j++){
if(letters[i] == string.charAt(j)){
System.out.println(letters[i] + " is at index " + j);
}
}
}
}
}