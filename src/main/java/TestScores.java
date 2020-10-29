/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class TestScores {
	private int testScores[];
	public TestScores(int scores[]) {
		testScores = scores;
		
		for(int i = 0; i < testScores.length; i++) {
			String errorMsg = "";
			if(scores[i] < 0 || scores[i] > 100) {
				errorMsg += Integer.toString(i + 1);
				System.out.println("Test score " + errorMsg + " is invalid");
			}
		}
	}

	public void setTestScore(int score[]) {
		testScores = score;
	}
	
	public int[] getTestScores() {
		return testScores;	
	}
	
	public int getAverage() {
		int total = 0;
		
		for(int i = 0; i < testScores.length; i++) {
			total = total + testScores[i];
		}
		return (int)total / testScores.length;
	}
}