package arraysinjava;

public class TwoDArrayExample {

	public static void main(String[] args) {
		int marks[][]= {
				{55,67,78,87},
				{77,44,89,54},
				{86,56,59,76},
				{67,78,98,69}
		};
		
		System.out.println(marks[2][0]);
		int marks1[][]=new int[4][5];//15 values
		System.out.println(marks1.length);
		//first row
		marks1[0][0]=55;
		marks1[0][1]=67;
		marks1[0][2]=78;
		marks1[0][3]=87;
		//second row
		marks1[1][0]=77;
		marks1[1][1]=44;
		marks1[1][2]=89;
		marks1[1][3]=54;
		//third row
		marks1[2][0]=86;
		marks1[2][1]=56;
		marks1[2][2]=59;
		marks1[2][3]=76;
		//fourth row
		marks1[3][0]=67;
		marks1[3][1]=78;
		marks1[3][2]=98;
		marks1[3][3]=69;
		
		System.out.println(marks1[3][2]);
		//for row
		for(int i=0;i<marks1.length;i++)
		{
			//for column
			for(int j=0;j<marks1.length;j++)
			{
				System.out.print(marks1[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
