package Bridge;

import java.util.ArrayList;
import java.util.List;

public class ImplemQuestions implements Questions {
	private int current = 0;
	 private List <String> questions = new ArrayList<String>();
	 public ImplemQuestions() {
		 questions.add("Ce este o clasa?");
		 questions.add("Ce design pattern-uri cunosti?");
		 questions.add("Ce este o clasa abstracta?");
		 questions.add("Diferenta dintre interfata si clasa abstracta?");	 
	 }
	@Override
	public void nextQuestion() {
		if( current <= questions.size()-1 )  
		    current++;  
		    System.out.print(current);
		
	}

	@Override
	public void prevQuestion() {
		 if( current > 0 )  
			    current--;  
		
	}

	@Override
	public void newQuestion(String question) {
		questions.add(question);  
		
	}

	@Override
	public void deleteQuestion(String question) {
		   questions.remove(question);  
		
	}

	@Override
	public void displayQuestion() {
		System.out.println( questions.get(current) );
		
	}
	@Override
	public void displayAllQuestions() {
		for (String quest : questions) {  
		    System.out.println(quest);  
		 }  
		
	}
}
