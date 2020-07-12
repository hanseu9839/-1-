package study;

public class Array {

	public static void main(String[] args) {
	  int []scores = {10,20,30};
	  int sum=0;
	  System.out.println(scores[0]);
	  System.out.println(scores[1]);
	  System.out.println(scores[2]);
	  
	  for(int i=0;i<scores.length;i++) {
		  sum+=scores[i];
	  }
	  System.out.println("ÃÑ ÇÕÀÇ ¼ö: "+sum);
	  double avg = (double)sum/3;
	  System.out.println("Æò±Õ : "+avg);
	}
	
}
