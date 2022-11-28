import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<S> ss = new TreeSet<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String cmd = in.next();
            if ("ENTER".equals(cmd)) {
                ss.add( new S(in.next(), in.nextDouble() * 1_000_000, in.nextInt()) );
            } else {
                if (!ss.isEmpty()) ss.remove( ss.first() );
            }
        }
        System.out.println( ss.isEmpty() ? "EMPTY" : ss.toString().replaceAll("[\\[\\]]", "").replace(", ", "\n"));
    }
}

class S implements Comparable<S> {
    String nn;
    int c;
    int t;

    public S(String nn, double c, int t) {
        this.nn = nn;
        this.c = (int) c;
        this.t = t;
    }

    @Override
    public String toString() {
        return nn;
    }

    @Override
    public int compareTo(S o) {
        int res = o.c - c;
        if (res == 0) res = nn.compareTo(o.nn);
        if (res == 0) res = t - o.t;
        return res;
    }
}
