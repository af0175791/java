class ArrayExample{

public static void main(String args[]){
String[]names={"Keerthi","Yogii","Ayshu","Mamta"};
for(int i=0; i<names.length; i++){
System.out.println(names[i]);
}
System.out.println();

int[]phone={123,234,345,456,567,678,890};
for(int n:phone){
System.out.println(n);
}
}
}