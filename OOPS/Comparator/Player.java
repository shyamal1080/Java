package OOPS.Comparator;

public class Player implements Comparable<Player>{
    private int ranking;
    private String name;
    private int age;

    public int getRanking() {
        return ranking;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Player(int ranking, String name, int age){
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Player o) {
        //Option -1: Compare based on ranking i.e based on just one parameter
        //return this.ranking - o.ranking;
        //OR 
        if (this.ranking < o.ranking) {
            return -1;
        } else if (this.ranking > o.ranking) {
            return 1;

        }
        return 0;
    }
    @Override
    public String toString(){

        return this.ranking + " " + this.name+ " "+this.age;
    }
}
