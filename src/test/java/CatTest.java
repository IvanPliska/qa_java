import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    Cat cat = new Cat(feline);
    @Test
    public void shouldGetSound() {
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected , actual);
    }

    @Mock
    Cat mockCat;

    @Test
    public void shouldGetFood() throws Exception {
        mockCat.getFood();
        Mockito.verify(mockCat).getFood();
    }
}