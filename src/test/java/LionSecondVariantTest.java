import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionSecondVariantTest {

    @Mock
    Feline mockFeline;

    @Test
    public void shouldGetKittensToLion() throws Exception {
        Lion lion = new Lion("Самка", mockFeline);
        int expected = 2;
        int actual = lion.getKittens();
        assertEquals("Lion kittens is incorrect", expected, actual);
    }

    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = null;
        try {
            new Lion("Неизвестный", mockFeline);
        } catch (Exception ex) {
            exception = ex;
        }
        assertEquals("Exception message is incorrect","Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
