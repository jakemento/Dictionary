import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();


  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Add New Word");
  }

  @Test
  public void wordFormTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add New Word"));
    assertThat(pageSource()).contains("Add a word");
  }

  @Test
  public void wordsDisplayTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add New Word"));
    fill("#wordName").with("Dog");
    submit(".btn");
    assertThat(pageSource()).contains("Dog");
  }

  @Test
  public void wordsDisplayMultipleTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add New Word"));
    fill("#wordName").with("Dog");
    submit(".btn");
    click("a", withText("Add New Word"));
    fill("#wordName").with("Cat");
    submit(".btn");
    assertThat(pageSource()).contains("Dog");
    assertThat(pageSource()).contains("Cat");
  }

  @Test
  public void wordPageDisplayTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add New Word"));
    fill("#wordName").with("Dog");
    submit(".btn");
    assertThat(pageSource()).contains("Dog");
  }

  @Test
  public void definitionAddTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add New Word"));
    fill("#wordName").with("dog");
    submit(".btn");
    click("a", withText("dog"));
    click("a", withText("Add a new Definition"));
    fill("#wordMeaning").with("a canine animal friend");
    submit(".btn");
    assertThat(pageSource()).contains("a canine animal friend");
  }
}
