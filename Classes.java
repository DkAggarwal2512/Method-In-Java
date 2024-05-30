

class Student{
    String name;
     int id;
     String email;
    

    public void display_name(){
        System.out.println(name +""+id+""+ email);
        
    }

}

public class Classes {
    public static void main(String[] args){
        Student a1 = new Student();
        Student b1 = new Student();
        Student c1 = new Student();


        a1.name="Seema ";
        a1.id=1 ;
        a1.email="Dk@gmail.com ";

        b1.name="Diksha";
        b1.id=2 ;
        b1.email="Ok@gmail.com ";

        c1.name="Dk";
        c1.id=3 ;
        c1.email="Sa@gmail.com ";
        

        a1.display_name();
        b1.display_name();
        c1.display_name();

        
    }

}