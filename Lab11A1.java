import java.io.*;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String toString(){
        return  "Name : "+name+" Age :"+age;
    }
}
public class Lab11A1 {
   public static void main(String[] args) {
        String filename = "abc.text";
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("Darshan,20\n");
            bw.write("Deep,22\n");
            bw.write("Diya,23");
            bw.close();
            System.out.println("Data written succefully");
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while((line=br.readLine())!=null){
                String name_age [] =line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student st = new Student(name,age);
                System.out.println(st);
               
            }
            br.close();

        } catch(Exception ex){
            ex.printStackTrace();
        }
 }
}