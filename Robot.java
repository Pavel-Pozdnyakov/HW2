package HW2;

public class Robot implements Contestant {

    private final int MAX_JUMP = 5;
    private final int MAX_DISTANCE = 1000;

    public boolean jump(int hight) {
        if(MAX_JUMP <= hight && MAX_JUMP >= 0) {
            System.out.println("Робот " + this.toString() + " перепрыгнул через стену " + hight + "м");
            return true;
        } else {
            System.out.println("Робот " + this.toString() + " не перепрыгнул через стену " + hight + "м");
            return false;
        }
    }

    @Override
    public boolean run(int distance) {
        if(MAX_DISTANCE <= distance && MAX_DISTANCE >= 0) {
            System.out.println("Робот " + this.toString() + " пробежал " + distance + "м");
            return true;
        } else {
            System.out.println("Робот " + this.toString() + " не пробежал " + distance + "м");
            return false;
        }
    }
}

