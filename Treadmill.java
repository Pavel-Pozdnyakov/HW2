package HW2;

public class Treadmill implements Challenge{

    private int distance;

    Treadmill(int distasce) {
        this.distance = distasce;
    }

    @Override
    public boolean contest (Contestant contestant) {
        if(contestant.run(distance)) {
            System.out.println(contestant.toString() + " справился с дистанцией " + distance + " метров!");
            return true;
        } else {
            System.out.println(contestant.toString() + " обосрался на дистанции" + distance + " метров!");
            return false;
        }
    }
}
