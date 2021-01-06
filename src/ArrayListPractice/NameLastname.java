package ArrayListPractice;
import java.util.ArrayList;
public class NameLastname {
    public static void main(String[] args) {

        ArrayList<String> studentName=new ArrayList<>();

        studentName.add("Ramis");
        studentName.add("Ari");
        studentName.add("Ela");
        studentName.add("Chopa");

        ArrayList<String> studentLastname=new ArrayList<>();

        studentLastname.add("Lopez");
        studentLastname.add("Whatever");
        studentLastname.add("Grande");
        studentLastname.add("Gomez");

        for (int i = 0; i < studentName.size(); i++) {
            
            for (int j = 0; j < studentName.size(); j++) {
                if(studentName.get(i).charAt(0)<studentName.get(j).charAt(0)){

                    String temp="";
                    temp=studentName.get(i);
                    studentName.set(i, studentName.get(j));
                    studentName.set(j, temp);
                    temp="";
                    temp=studentLastname.get(i);
                    studentLastname.set(i, studentLastname.get(j));
                    studentLastname.set(j, temp);
                }
            }
        }
        System.out.println(studentName);
        System.out.println(studentLastname);
    }
}



