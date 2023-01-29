import org.apache.commons.lang3.StringUtils;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public int numberSpacesOfString(String name) {
        return StringUtils.countMatches(name, " ");
    }

    /*
     Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
     Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
    */
    public boolean checkNameToEmboss() {
        if(((name.length() >= 3) && (name.length() <= 19)) && (numberSpacesOfString(name) <= 1) && (name.trim()).equals(name)) {
            return true;
        }
        else return false;
    }

}