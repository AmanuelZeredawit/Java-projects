
/**
 * Write a description of CiesarEnc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;
public class CiesarEnc{
    private int key;
    private String input;
    public CiesarEnc(String input,int key){
        //this.key=key;
        this.input=input;
        this.key=key;
    }
    public String encrypt(){
        
        StringBuilder encrypted= new StringBuilder(input);
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet=alphabets.substring(key) + 
        alphabets.substring(0,key);
        for(int i=0;i<encrypted.length();i++){
            char currchar=encrypted.charAt(i);
            int idx=alphabets.indexOf(currchar);
            if(idx !=-1){
                encrypted.setCharAt(i,shiftedAlphabet.charAt(idx));
            }
            
        }
        return encrypted.toString();
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Message");
        //int key=sc.nextInt();
        //System.out.println("enter the message");
        String input= sc.nextLine();
        System.out.println("enter key");
        int key= sc.nextInt();
        sc.close();
        CiesarEnc enc1= new CiesarEnc(input,key);
        System.out.println(enc1.encrypt());
        
        
        
            
        
        
        
    }
}
