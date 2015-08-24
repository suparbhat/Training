package Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num;
		num = new int[10];
		int[] ref;
		ref=num;
		ref[5]=5;
		System.out.print(num[5]);
		for(int data:num){
			System.out.println(data);
		}
		System.out.println("begin");
		int[][][] num1;
		num1 = new int[5][3][3];
		num1[0][0][0]=1;
		num1[1][0][0]=2;
		num1[2][0][0]=3;
		num1[3][0][0]=4;
		num1[4][0][0]=5;
		
		for(int[][] data:num1)
		{
			for( int m[] :data)
			{
				for(int n : m){
					
				
			
				System.out.print(n+ " ");
			
		}
				System.out.println("  ");
			}
		}
	}

}
