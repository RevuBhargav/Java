package OneDArray;

public class TrueRfalse {
public static void main(String[] args) {
	boolean arr[][]= {{true,false,true},{false,true,false}};
	
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		if(arr[i][j]) {
			System.out.print("t"+" ");
		}
		
		else {
			System.out.print("f"+" ");
		}
		
}
	System.out.println();
}
}
}

