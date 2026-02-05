import ru.netology.stats.StatsService;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        System.out.println(service.sumSales(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.avgSales(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.monthHighSales(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.monthMinSales(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.countMonthMinAvg(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.countMonthMaxAvg(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));

    }
}
