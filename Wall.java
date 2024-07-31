package HW2;

public class Wall implements Challenge{
    private int hight;

    Wall(int hight){
        this.hight = hight;
    }

    @Override
    public boolean contest (Contestant contestant) {
        if(contestant.run(hight)) {
            System.out.println(contestant.toString() + " справился со стеной " + hight + " метров!");
            return true;
        } else {
            System.out.println(contestant.toString() + " обосрался на стене " + hight + " метров!");
            return false;
        }
    }
}

