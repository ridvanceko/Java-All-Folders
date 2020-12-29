package Array;

public class ForEachDimensional {
    public static void main(String[] args) {

        String [][] blackBox={{"Apple","Microsoft","Google"}, {"Apple","Samsung","Huawei"}, {"Boss","LG","Beats"}};


        //print the brand name if it is equal to "Apple" using foreach loop

        for (String [] blueBox: blackBox) {
            for (String stars: blueBox) {
                if(stars.equalsIgnoreCase("apple")){
                    System.out.print(stars+" ");
                }
            }
            System.out.println();
        }

    }
}


/// for (String[] arr : products) {
//            for (String value : arr)
//              if (value.equals("Apple")){
//                System.out.println(value+" ");
//        }


//for(String [] array:product){
//            for(String name:array){
//        if(name.equals("Apple"))
//                System.out.println(name);
//            }
//        }