package HW2;

public class Human implements Contestant {

    private final int MAX_JUMP = 2;
    private final int MAX_DISTANCE = 150;

    @Override
    public boolean jump(int hight) {
        if(MAX_JUMP <= hight && MAX_JUMP >= 0) {
            System.out.println("Кожанный " + this.toString() + " перепрыгнул через стену " + hight + "м");
            return true;
        } else {
            System.out.println("Кожанный " + this.toString() + " не перепрыгнул через стену " + hight + "м");
            return false;
        }
    }

    @Override
    public boolean run(int distance) {
        if(MAX_DISTANCE <= distance && MAX_DISTANCE >= 0) {
            System.out.println("Кожанный " + this.toString() + " пробежал " + distance + "м");
            return true;
        } else {
            System.out.println("Кожанный " + this.toString() + " не пробежал " + distance + "м");
            return false;
        }
    }
}

