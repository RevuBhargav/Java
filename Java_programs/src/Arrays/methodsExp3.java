package Arrays;

public class methodsExp3 {
    int[][] math1() {
    	int[][] arr = {{2,3,4},{4,5,1},{9,4,5}};
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    		if((arr[i][j]==2) || (arr[i][j]==3)){
    			arr[2][1]=2;
    		}
    		}
    	}
    	return arr;
    }
    public static void main(String[] args) {
    	methodsExp3 obj = new methodsExp3();
    	int result[][]=obj.math1();
    	for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
	}

