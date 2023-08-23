import java.util.*;

class Person_Travel {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        int total, hour, min, res_hour;
        float res_min, final_time, out;

        System.out.println("Enter hours: ");
        hour = z.nextInt();
        System.out.println("Enter minute: ");
        min = z.nextInt();

        total = (hour * 60) + min;
        out = 1440 - total;

        final_time = out / 60;
        res_hour = (int) final_time;
        res_min = final_time - res_hour;
        float op_min = res_min * 60;
        int minute = (int) op_min;

        // System.out.println("Hour :" + res_hour + " Min :" + minute);
        System.out.println(res_hour+"::"+minute);
        z.close();
    }
}