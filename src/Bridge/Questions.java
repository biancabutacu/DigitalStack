package Bridge;

public interface Questions {
	public void nextQuestion();  
    public void prevQuestion();  
    public void newQuestion(String question);  
    public void deleteQuestion(String question);  
    public void displayQuestion();
    public void displayAllQuestions();
}
