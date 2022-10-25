import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final String sex;
    private final boolean expected;

    public LionTest(String sex, boolean expected) throws Exception {
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

    @Test
    public void shouldDoesHaveManeSex() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Mock
    Lion mockLion;


    @Test
    public void shouldGetKittensToLion() {
        mockLion.getKittens();
        Mockito.verify(mockLion).getKittens();
        Mockito.when(mockLion.getKittens()).thenReturn(5);
        assertEquals(5, mockLion.getKittens());
    }

    @Test
    public void shouldEatMeat() throws Exception {
        mockLion.getFood();
        Mockito.verify(mockLion).getFood();
    }
}