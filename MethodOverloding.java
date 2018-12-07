class Over{
int cal(int a,int b){
    int c;
    c=a+b;
    System.out.println("Total is : "+c);
return 0;
}

float cal(float a,float b){
float c;
c=a+b;
    System.out.println("Total is : "+c);
    return 0;
}
int cal(int x){
    System.out.println(x);
return 0;
}
}
public class MethodOverloding {
    public static void main(String [] args){
    Over ob=new Over();
    ob.cal(10,20);
    ob.cal(10);
    ob.cal(10.6f,6.8f);
    }
}
