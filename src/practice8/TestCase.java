package practice8;

import java.lang.annotation.*;

@Repeatable(TestCases.class)
public @interface TestCase {
   String params();
   String expected();   
}
