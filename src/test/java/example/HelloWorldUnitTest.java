package example;

import org.junit.Test;

public class HelloWorldUnitTest {

  @Test
  public void test1() {
    new HelloWorld().coveredByUnitTest1();
  }

  @Test
  public void test2() {
    new HelloWorld().coveredByUnitTest2();
  }

}
