public class TestScoresClass {

	public static void main(String[] args) {
		
		int Scores[] = {163, -2, 95, 89, 75, 100}; 
		int testnumb = 1;
		TestScores t = new TestScores(Scores);
		
		for (int i = 0; i < Scores.length; i++) {
			System.out.println("Test " + testnumb++ + ": " + Scores[i]);
		}
		System.out.println("\n");
		
		System.out.println("The average of the scores are " + t.getAverage());
		
	}

}