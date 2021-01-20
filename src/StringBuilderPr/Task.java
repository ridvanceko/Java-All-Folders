package StringBuilderPr;

public class Task {

    public static void main(String[] args) {

        StringBuilder [] names = {new StringBuilder("David"), new StringBuilder("Kushal"),
        new StringBuilder("Renas"), new StringBuilder("Muammer")};

        // create one method will accept the StringBuilder names and replace middle char with '$'
        // from every name which has length is odd number
        // -- Da$id Re$as Mua$mer

        for (int i = 0; i < names.length; i++) {
            if(names[i].length()%2==1){
                names[i].replace(names[i].length()/2,names[i].length()/2+1,"$");
            }
            System.out.println(names[i]);


    }}
}
