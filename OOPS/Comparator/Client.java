package OOPS.Comparator;

import OOPS.Comparable.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import static java.util.Collections.*;

public class Client {
    public static void main(String[] args) {
        List<Player> cricketTeam = new ArrayList<>();
        cricketTeam.add(new Player(1,"Virat",37));
        cricketTeam.add(new Player(5,"Rohit",34))
        ;
        cricketTeam.add(new Player(3,"Dhoni",39));

        //PlayerAgeComparator ageComparator = new PlayerAgeComparator();
        //Collections.sort(cricketTeam)
        //[OOPS.Comparable.Player@5f184fc6, OOP                                                             n           S.Comparable.Player@3feba861, OOPS.Comparable.Player@5b480cf9]
        //Collections.sort(cricketTeam);
        //System.out.println(cricketTeam);
        //To print actual value, override toString() method in the player class
        Collections.sort(cricketTeam, new PlayerAgeComparator());
    }
}
