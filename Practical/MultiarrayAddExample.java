class MultiarrayAddExample{
public void display(){
 int arr[][]={{1,2,3},{4,5,5},{7,6,8}};
 int arr1[][]={{1,2,3},{4,5,5},{7,6,8}};

//matrix to store sum of matrices
int result[][] = new int[3][3];

//adding & print addition of 2 matrices
for(int i=0; i<3; i++){
   for(int j=0; j<3; j++){
   result[i][j] = arr[i][j]+arr1[i][j];
   System.out.print(result[i][j] + " ");
   }
   System.out.println();
}
}
public static void main(String args[]){
MultiarrayAddExample obj = new MultiarrayAddExample();
obj.display();
}
}