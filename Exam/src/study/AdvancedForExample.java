package study;

public class AdvancedForExample {

	public static void main(String[] args) {
		int [] scores= {90,87,80,70,97};
		
		int sum =0;
		for(int score:scores) {
			sum+=score;
		}
		System.out.println(sum);
		double avg = (double) sum/scores.length;
		System.out.println(avg);

	}

}
