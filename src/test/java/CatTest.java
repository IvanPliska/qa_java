import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline mockFeline;

    @Test
    public void shouldGetSound() {
        Cat cat = new Cat(mockFeline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals("Cat sound is incorrect",expected, actual);
    }

    @Test
    public void shouldGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List expected = Arrays.asList("Животные", "Птицы" ,"Рыба");
        List actual = cat.getFood();
        assertEquals("Cat food is incorrect", expected, actual);
    }
}