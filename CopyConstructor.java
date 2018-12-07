class Student12{
String Name;
int Roll;
double mark;
Student12(String N,double m,int R){
    Name=N;
    Roll=R;
    mark=m;
}
Student12(Student12 ob){
Name=ob.Name;
Roll=ob.Roll;
mark=ob.mark;
}
 void getDisplay(){
 System.out.println("Mame is : "+Name);
 System.out.println("Roll : "+Roll);
 System.out.println("Total Mark : "+mark);    
 }
}
public class CopyConstructor {
    public static void main(String [] args){
   Student12 ob=new Student12("Minhaj",98,380936) ;
   Student12 ob1=new Student12(ob) ;
   ob.getDisplay();
   ob1.getDisplay();

}
}

