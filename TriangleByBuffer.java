import java.io.*;
public class TriangleByBuffer {
    public static void main(String [] arg) throws IOException{
        double a,b,c,s,area;
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of x: ");
        a=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of y: ");
        b=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of z: ");
        c=Integer.parseInt(ob.readLine());
        
        if((a+b)>c && (b+c)>a && (c+a)>b){
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
        else{
            System.out.println("Triangle is not possiable.");
        }
        
    }
}
