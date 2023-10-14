import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionSexTest {
private final String sex;
Feline feline;
public LionSexTest(String sex){
    this.sex = sex;
}
@Parameterized.Parameters
    public static Object[][] getLionSex(){
    return new Object[][]{
            {"Female"},
            {"Male"},
            {"Лев"},
            {"Львица"},
            {null},
    };
}
@Test(expected = Exception.class)
    public void lionSexTest() throws Exception {
    Lion lion = new Lion(sex, feline);

    }
}
