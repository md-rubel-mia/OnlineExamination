
public class Question implements QuestionInterface {
        
    Question(Question q){
        
        this.question = q.question;
        this.option1 = q.option1;
        this.option2 = q.option2;
        this.option3 = q.option3;
        this.option4 = q.option4;
        this.answer = q.answer;
        this.time = q.time;
        this.marks = q.marks;
    }
    
    Question(){
        
    }
    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String getOption1() {
        return option1;
    }

    @Override
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    @Override
    public String getOption2() {
        return option2;
    }

    @Override
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    @Override
    public String getOption3() {
        return option3;
    }

    @Override
    public void setOption3(String option3) {
        this.option3 = option3;
    }

    @Override
    public String getOption4() {
        return option4;
    }

    @Override
    public void setOption4(String option4) {
        this.option4 = option4;
    }
    
    
    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    @Override
    public String getTime(){
        return time;
    }
    
    @Override
    public void setTime(String time){
        
        this.time = time;
    }
    
    @Override
    public String getMarks(){
        return marks;
    }
    
    @Override
    public void setMarks(String marks){
        
        this.marks = marks;
    }
    
    private String question , option1 , option2 , option3 , option4 , answer , time , marks;

}
