
import java.io.*;
public class Sqrt1 {
    public static void main(String [] args) throws IOException{
    int x;
    double y;
    //String s;
        
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    
    x=Integer.parseInt(ob.readLine());
    y=Math.sqrt(x);
    System.out.println(y);
    
    }
}
