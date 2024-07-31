package HW2;

public class Rat implements Contestant {

    private final int MAX_JUMP = 1;
    private final int MAX_DISTANCE = 100;

    @Override
    public boolean jump(int hight) {
        if(MAX_JUMP <= hight && MAX_JUMP >= 0) {
            System.out.println("Крыса " + this.toString() + " перепрыгнула через стену " + hight + "м");
            return true;
        } else {
            System.out.println("Крыса " + this.toString() + " не перепрыгнула через стену " + hight + "м");
            return false;
        }
    }

    @Override
    public boolean run(int distance) {
        if(MAX_DISTANCE <= distance && MAX_DISTANCE >= 0) {
            System.out.println("Крыса " + this.toString() + " пробежала " + distance + "м");
            return true;
        } else {
            System.out.println("Крыса " + this.toString() + " не пробежала " + distance + "м");
            return false;
        }
    }
}
