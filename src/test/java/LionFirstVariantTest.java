import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionFirstVariantTest {

    private final String sex;
    private final boolean expected;

    public LionFirstVariantTest(String sex, boolean expected) throws Exception {
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
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals("Lion have mane Sex is incorrect", expected, actual);
    }

    @Test
    public void shouldEatMeat() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline );
        List expected = Arrays.asList("Животные", "Птицы" ,"Рыба");
        List actual = lion.getFood();
        assertEquals("Lion food is incorrect",expected, actual);
    }
}