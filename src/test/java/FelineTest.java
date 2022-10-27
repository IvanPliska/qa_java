import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void shouldEatMeat() throws Exception {
        List expected = Arrays.asList("Животные", "Птицы" ,"Рыба");
        List actual = feline.eatMeat();
        assertEquals("Feline food is incorrect",expected, actual);
    }

    @Test
    public void shouldGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Feline family is incorrect", expected, actual);
    }

    @Test
    public void shouldGetKittens() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Feline kittens is incorrect",expected, actual);
    }
}