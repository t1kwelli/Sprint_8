import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountLengthTest {

    private final String name;

    private final boolean expectedResult;

    public AccountLengthTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getNameData () {
        return new Object[][]{
                {"Ти", false},
                {"Тим", true},
                {"ТимотиШаламеПлюс555", true},
                {"ТимотиШаламеПлюс5555", false},
        };
    }

    @Test
    @Description("Проверка на то что в строке не меньше 3 и не больше 19 символов")
    public void lengthTest() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }
}
