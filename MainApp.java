package HW2;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Contestant> contestants = new ArrayList<>() {{
            add(new Human());
            add(new Robot());
            add(new Rat());
        }};

        ArrayList<Challenge> challenges = new ArrayList<>() {{
            add(new Treadmill(100));
            add(new Wall(1));
            add(new Treadmill(55));
            add(new Treadmill(1001));
            add(new Wall(2));
            add(new Wall(150));
        }};

        for(Contestant contestant : contestants) {
            for(Challenge challenge : challenges) {
                if(!challenge.contest(contestant)) {
                    break;
                }
            }

        }
    }
}
