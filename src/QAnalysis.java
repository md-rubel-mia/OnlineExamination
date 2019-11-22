
public class QAnalysis extends Question {
    
    private int yourAnswer;
    private int correctAnswer;
    
    public QAnalysis(Question q , int correctAnswer , int yourAnswer){
        
        super(q);
        this.correctAnswer = correctAnswer;
        this.yourAnswer = yourAnswer;
    }
    
    int getYourAnswer() {
        return yourAnswer;
    }

    public void setYourAnswer(int yourAnswer) {
        this.yourAnswer = yourAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
