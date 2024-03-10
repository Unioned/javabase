package switchex;

public class SwitchDemo3 {

    public static void main(String[] args) {
        int day = 4;
        WeekDay(day);
    }

    public static void WeekDay(int day){
        switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("工作日");
            }
            case 6, 7 -> {
                System.out.println("休息日");
            }
            default -> {
                System.out.println("日期不存在");
            }
        }
    }
}
