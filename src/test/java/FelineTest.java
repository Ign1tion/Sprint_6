import static org.junit.Assert.*;
import org.junit.Test;
import com.example.Feline;
import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatTest()throws Exception{
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
    assertEquals("Ошибка! Результат не совпал с ожидаемым", expectedResult, actualResult);

    }
    @Test
    public void getFamilyTest(){
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Ошибка! Результат не совпал с ожидаемым", expectedResult, actualResult);
    }
    @Test
    public void getKittensWithParamTest(){
    int expectedResult = 6;
    int actualResult = feline.getKittens(6);
    assertEquals("Ошибка! Результат не совпал с ожидаемым", expectedResult, actualResult);
    }
    @Test
    public void getKittensTest(){
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Ошибка! Результат не совпал с ожидаемым", expectedResult, actualResult);
    }
}
