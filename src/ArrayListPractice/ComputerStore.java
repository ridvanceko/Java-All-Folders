package ArrayListPractice;

import java.util.ArrayList;

public class ComputerStore {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Apple", "Macbook Pro", 500, 13d);
        Computer computer2 = new Computer("Apple", "Macbook", 2000, 16d);
        Computer computer3 = new Computer("Dell", "XPS", 1500, 13d);
        Computer computer4 = new Computer("Asus", "Envy", 1600, 14d);
        Computer computer5 = new Computer("HP", "Packard", 1500, 15d);
        Computer computer6 = new Computer("Lenovo", "Yoga", 900, 15d);
        Computer computer7 = new Computer("Microsoft", "SurfacePro", 800, 13d);


        ArrayList <Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);

        Computer computerCheapest = computers.get(0);

//    //only Apple computers
//        for (int i = 1; i < computers.size(); i++) {
//            if (computers.get(i).manufacturer.equals("Apple")) {
//                computerCheapest = computers.get(i);
//            }
//        }

        //I need computer which price is in the range of $500-900
        System.out.println("computer which price is in the range of $500-900");
        for (int i = 0; i < computers.size(); i++) {
            if(computers.get(i).price>=500 && computers.get(i).price<=900 ){
                System.out.println(computers.get(i));
            }
        }
        System.out.println(computerCheapest.toString());


    }


}
