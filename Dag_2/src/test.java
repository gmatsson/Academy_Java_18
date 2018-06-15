import java.text.DecimalFormat;

public class test {
    public static void main(String[] arg) {
        int n = 3;
        double x = 1;
        double sum = 0;
        String total = "";
        for(int i = 0; i < n; i++) {
            sum += 1/x;
            x += 3;
        }
        DecimalFormat dc = new DecimalFormat("#.##");
        total = String.valueOf(dc.format(sum));
        System.out.println(total);
    }

}

