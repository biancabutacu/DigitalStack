package Bridge;

public class QuestionManager {
	
protected Questions question;
	
	public String catalog;
	
	public QuestionManager(String catalog) {
		super();
		this.catalog = catalog;
	}
	
	public void next() {  
		question.nextQuestion();  
	    }
	
	public void prev() {
		question.prevQuestion();  
	}  
	
	public void newOne(String questions) {  
	    	question.newQuestion(questions);  
	}  
	
	public void delete(String questions) {  
	    	question.deleteQuestion(questions);  
	}
	
	public void display() {  
	    	question.displayQuestion();  
	    } 
	public void displayAll() {  
        System.out.println("Setul de intrebari pentru evaluare : " + catalog);  
    question.displayAllQuestions();  
    }  
}
