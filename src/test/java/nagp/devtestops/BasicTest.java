package nagp.devtestops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

  @Test
  public void compareWhenFirstNumberIsGreater() {
    Basic basic = new Basic();
    int value = basic.compare(2, 1);
    Assert.assertEquals(1, value,"Values are not equal");
  }
  @Test
  public void compareTwoEqualNumbers() {
    Basic basic = new Basic();
    int value = basic.compare(2, 2);
    Assert.assertEquals(0, value,"Values are not equal");
  }
}
