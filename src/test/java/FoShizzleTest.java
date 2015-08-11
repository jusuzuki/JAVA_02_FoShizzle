import org.junit.*;
import static org.junit.Assert.*;

public class FoShizzleTest {

  @Test
  public void FoShizzle_Hello(){
    FoShizzle test = new FoShizzle();
    assertEquals("hello", test.foShizzle("hello"));
  }

  @Test
  public void FoShizzle_Suzan(){
    FoShizzle test = new FoShizzle();
    assertEquals("Suzan", test.foShizzle("Susan"));
  }

  @Test
  public void FoShizzle_skillz(){
    FoShizzle test = new FoShizzle();
    assertEquals("skillz", test.foShizzle("skills"));
  }

  @Test
  public void FoShizzle_McSweet(){
    FoShizzle test = new FoShizzle();
    assertEquals("McSweet", test.foShizzle("McSweet"));
  }

}
