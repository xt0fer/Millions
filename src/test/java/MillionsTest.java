import static org.junit.Assert.*;

public class MillionsTest {

    @org.junit.Test
    public void loops() {
        Integer upperlimit = 1000000;
        Millions m = new Millions(upperlimit);

        m.loops(upperlimit);

        upperlimit = 5000000;
        m = new Millions(upperlimit);

        m.loops(upperlimit);

        upperlimit = 10000000;
        m = new Millions(upperlimit);

        m.loops(upperlimit);

        upperlimit = 20000000;
        m = new Millions(upperlimit);

        m.loops(upperlimit);

        upperlimit = 50000000;
        m = new Millions(upperlimit);

        m.loops(upperlimit);

        upperlimit = 70000000;
        m = new Millions(upperlimit);

        m.loops(upperlimit);

    }
}