package Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        // Note: Left side (Variable type of the object) will decide which method to call
        // Right side of the object will decide which method to create in java memory.

        TreeSet<String> soccerTeam = new TreeSet<>();

        soccerTeam.add("New York City");
        soccerTeam.add("Chicago Fire");
        soccerTeam.add("Galaxy");
        soccerTeam.add("Atlanta United");
        soccerTeam.add("Inter Miami");

        System.out.println(soccerTeam);

        System.out.println(soccerTeam.contains("Galaxy"));

        System.out.println(soccerTeam.first());
        System.out.println(soccerTeam.last());
        System.out.println(soccerTeam);


       // pollFirst = it will et the first element and remove the first element from TreeSet
        System.out.println(soccerTeam.pollFirst());

        // pollLastit will get the last element and remove the last element from TreeSet
        System.out.println(soccerTeam.pollLast());

        System.out.println(soccerTeam);
    }
}
