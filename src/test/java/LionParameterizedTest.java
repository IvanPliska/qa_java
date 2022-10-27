import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final String sex;
    private final boolean expected;

    public LionParameterizedTest(String sex, boolean expected) throws Exception {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline mockFeline;

    @Test
    public void shouldDoesHaveManeSex() throws Exception {
        Lion lion = new Lion(sex, mockFeline);
        boolean actual = lion.doesHaveMane();
        assertEquals("Lion have mane Sex is incorrect", expected, actual);
    }

    @Test
    public void shouldEatMeat() throws Exception {
        Lion lion = new Lion(sex, mockFeline);
        List expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.eatMeat()).thenReturn(expected);
        List actual = lion.getFood();
        assertEquals("Lion food is incorrect", expected, actual);
    }
}