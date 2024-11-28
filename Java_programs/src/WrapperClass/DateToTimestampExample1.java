package WrapperClass;

   
import java.util.Date;    
 public class DateToTimestampExample1 {    
       public static void main(String args[]){    
                Date date = new Date();  
                DateToTimestampExample1 ts=new DateToTimestampExample1((date.getTime());  
                System.out.println(ts);                     
        }    
}    
