package Bridge;

public class TestBridge {

	public static void main(String[] args) {
		System.out.println("Evaluare cunostinte Rotaru Marian");
		System.out.println("---------------------------------------------------------");  
		QuestionFormat questions = new QuestionFormat("Cunostinte OOP");

		questions.question = new ImplemQuestions();
	
		
		questions.newOne("Care sunt principiile OOP?");
		questions.displayAll();
	}

	}


