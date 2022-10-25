import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void shouldEatMeat() throws Exception {
        List expected = Arrays.asList("Животные", "Птицы" ,"Рыба");
        List actual = feline.eatMeat();
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetKittens() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}