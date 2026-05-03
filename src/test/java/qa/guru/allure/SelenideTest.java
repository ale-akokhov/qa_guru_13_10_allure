package qa.guru.allure;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class SelenideTest {

    @Test
    public void testGithubIssueSearch () {
        Selenide.open("https://github.com/");

    }
}
