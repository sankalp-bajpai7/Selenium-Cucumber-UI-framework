package edBitExercise;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void test1() {
        assertThat(PrefixVsSuffix.isPrefix("automation", "auto-"), is(true));
    }

    @Test
    public void test2() {
        assertThat(PrefixVsSuffix.isPrefix("superfluous", "super-"), is(true));
    }

    @Test
    public void test3() {
        assertThat(PrefixVsSuffix.isPrefix("oration", "mega-"), is(false));
    }

    @Test
    public void test4() {
        assertThat(PrefixVsSuffix.isPrefix("retrospect", "sub-"), is(false));
    }

    @Test
    public void test5() {
        assertThat(PrefixVsSuffix.isSuffix("arachnophobia", "-phobia"), is(true));
    }

    @Test
    public void test6() {
        assertThat(PrefixVsSuffix.isSuffix("rhinoplasty", "-plasty"), is(true));
    }

    @Test
    public void test7() {
        assertThat(PrefixVsSuffix.isSuffix("movement", "-scope"), is(false));
    }

    @Test
    public void test8() {
        assertThat(PrefixVsSuffix.isSuffix("vocation", "-logy"), is(false));
    }
}
