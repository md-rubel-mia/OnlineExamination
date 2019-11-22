
import java.util.ArrayList;


public class Main {
    
    static ArrayList<Integer> arraylist=new ArrayList<Integer>();
    
    public static void main(String arg[]){
        
        
        int a = 124;
        arraylist.add(a);
        a=678;
        arraylist.add(a);
        
        for(int x : arraylist)System.out.println(x);
    }
}
