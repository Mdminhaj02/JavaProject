class Student{
String Name;
int Roll;
void getData(){
Name="Minhaj";
Roll=380936;
}
void getDisplay(){
System.out.println("Student Name: "+Name);
System.out.println("Student Roll : "+Roll);
}
}
class Exam extends Student{

int mark;
void getData(){
mark=98;
}
void getDisplay(){
System.out.println("Student Mark : "+mark);
}
}
class Result extends Exam{
Student ob=new Student();
Exam ob1=new Exam();
void getData(){
ob.getData();
ob1.getData();
}
void Display(){
ob.getDisplay();
ob1.getDisplay();
}
}

public class Multiple_Inheritance {
    public static void main (String[] args){
    Result ob3=new Result();
    ob3.getData();
    ob3.Display();
    }
}

