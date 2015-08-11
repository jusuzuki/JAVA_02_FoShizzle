import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import static spark.Spark.*;
import spark.ModelAndView;
import java.util.Map;
import java.lang.*;

public class FoShizzle {
  public static void main(String[] args){}

  public static String foShizzle (String input){

    String toChar = input;
    char firstChar = toChar.charAt(0);


    if(firstChar == 'S' || firstChar == 's'){
    String afterFirstLetter = input.substring(1);
    String shizzled = afterFirstLetter.replace('s','z');
    return firstChar+shizzled;
    }
    else {
    String shizzled = input.replace('s','z');
    return shizzled;
  }

  }

}
