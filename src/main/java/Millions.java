import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Millions {


    private Integer[] aArray;
    private ArrayList<Integer> aList;

    public Millions(Integer limit) {
        aArray = new Integer[limit];
        aList = new ArrayList<Integer>();
        System.out.printf("Limit is %,d\n", limit);
    }

    public void printDuration(String msg, Instant start, Instant finish) {
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("%s: Elapsed time (ms): %s (secs): %s \n", msg, String.valueOf(timeElapsed),
                String.valueOf(timeElapsed/1000));
    }

    public void loops(Integer limit) {
        Instant start;
        Instant finish;
        Integer tempInt = 0;

        start = Instant.now();
        for (int i = 0; i < limit; i++) {
            aArray[i] = i;
        }
        finish = Instant.now();
        printDuration("Array Set", start, finish);

        start = Instant.now();
        for (int i = 0; i < limit; i++) {
            tempInt = aArray[i];
            tempInt = i;
        }
        finish = Instant.now();
        printDuration("Array Get", start, finish);

        start = Instant.now();
        for (int i = 0; i < limit; i++) {
            aList.add(i);
        }
        finish = Instant.now();
        printDuration("ArrayList Set", start, finish);

        start = Instant.now();
        for (int i = 0; i < limit; i++) {
            tempInt = aList.get(i);
            tempInt = i;
        }
        finish = Instant.now();
        printDuration("ArrayList Get", start, finish);
    }
}
