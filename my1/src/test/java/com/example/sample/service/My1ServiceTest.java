package myapp.service;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = My1Service.class)
public class My1ServiceTest {

  @Autowired
  My1Service service;

  @Test
  public void testBuildMessage() {
    String expected = "Hello test-user. This is a sample spring boot template project.";
    Assert.assertEquals(expected, service.buildMessage("test-user"));
  }
}
