
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadQuestionFromFile {
    
    public static void main(String arg[]) throws FileNotFoundException, IOException{    
        
        String path = "E:\\JavaExam.txt";
        
        Question question_temp = new Question(); 
        
        FileReader fr = new FileReader(path);
        
        BufferedReader br = new BufferedReader(fr);
        
        ArrayList<Question> arraylist=new ArrayList<Question>();
        
        //label_question.
        
        String ar;
        
        while((ar = br.readLine())!=null){
            
            question_temp.setQuestion(ar);
            question_temp.setOption1(br.readLine());
            question_temp.setOption2(br.readLine());
            question_temp.setOption3(br.readLine());
            question_temp.setOption4(br.readLine());
            question_temp.setAnswer(br.readLine());
            
            System.out.println(question_temp.getQuestion());
            
            arraylist.add(new Question(question_temp));
            
            
        }
        
        for(Question a1 : arraylist){
            
            System.out.println(a1.getAnswer());
        }
    }
    
}
