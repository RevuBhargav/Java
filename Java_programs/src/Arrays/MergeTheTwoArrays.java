package Arrays;

public class MergeTheTwoArrays {
public static void main(String[] args) {
	int arr1[]= {2,3,4,5};
	int arr2[]= {4,6,7,8,9};
	int merge[] = new int[arr1.length+arr2.length];
	int c=0;
	for(int i=0;i<arr1.length;i++) {
		merge[i]=arr1[i];
		c++;
	}
	for(int j=0;j<arr2.length;j++) {
		merge[c++]=arr2[j];
	}
	for(int i=0;i<merge.length;i++) {
		System.out.print(merge[i]+"");
	}
}
}
