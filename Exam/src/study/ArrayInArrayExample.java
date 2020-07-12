package study;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int [][] mathScores = new int[2][3];
		for(int i=0;i<mathScores.length;i++)
		{
			for(int j=0;j<mathScores[i].length;j++) {
				System.out.println(mathScores[i][j]);
			}
		}
		int [][]englishScores = new int[2][];
		englishScores[0]=new int[3];
		englishScores[1]=new int[2];
		for(int i=0;i<englishScores.length;i++) {
			for(int j=0;j<englishScores[i].length;j++) {
				System.out.println(englishScores[i][j]);
			}
		}
		int [][]javaScores= {{90,80,87},{78,16,49}};
	}

}
