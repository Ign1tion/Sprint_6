import com.example.Feline;
import com.example.Lion;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
 public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        int actualResult = lion.getKittens();
        int expectedResult = 5;
        assertEquals("Ошибка! Результат не совпал с ожидаемым", actualResult, expectedResult);
    }
    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Ошибка! Результат не совпал с ожидаемым", expectedResult, actualResult);
    }
    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedResult = false;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Ошибка! Результат не совпал с ожидаемым", expectedResult, actualResult);
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals("Ошибка! Результат не совпал с ожидаемым.", expectedResult, actualResult);
    }


}



