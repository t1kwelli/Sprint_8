import io.qameta.allure.Description;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    @Description("Проверка на то что в строке может быть один пробел")
    public void oneSpaceOfStringTest() {
        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        boolean expectedResult = true;
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Description("Проверка на то что в строке не может быть двух пробелов")
    public void twoSpaceOfStringTest() {
        String name = "Тим Моти Шаламе";
        Account account = new Account(name);
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Description("Проверка на то что пробел стоит не в начале строки")
    public void spaceNotStartOfString() {
        String name = " ТимотиШаламе";
        Account account = new Account(name);
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Description("Проверка на то что пробел стоит не в конце строки")
    public void spaceNotEndOfString() {
        String name = "ТимотиШаламе ";
        Account account = new Account(name);
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }
}
