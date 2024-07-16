import java.util.Arrays;

public class WorkShop {

    public static void main(String[] args) {
        Friend[] friends = {
                new Friend("Вася", 18, true, 3.2f),
                new Friend("Катя", 19, true, 1.2f),
                new Friend("Дима", 20, false, 2.0f),
                new Friend("Оля", 15, false, 1.0f)
        };

        System.out.println("My friends: " + Arrays.toString(friends));
    }
}

class Friend {

    private String name;
    private int age;
    private boolean isFriendFromSchool;
    private float hoursSpentTogetherLastWeek;

    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;


    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool= " + isFriendFromSchool +
                ", hoursSpentTogetherLastWeek= " + hoursSpentTogetherLastWeek +
                '}';
    }
}
