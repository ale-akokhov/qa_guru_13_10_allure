package qa.guru.allure;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    public void testGithubIssueSearch () {
        Selenide.open("https://github.com/");
        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").sendKeys("selenide/selenide");
        $("#query-builder-test").submit();

        $(linkText("selenide/selenide")).click();
        $(partialLinkText("Issues")).click();
        $("body").shouldHave(text("Selenide allows downloading multiple files with a single click"));



    }
}
