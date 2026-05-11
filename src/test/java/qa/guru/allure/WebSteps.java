package qa.guru.allure;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage () {
        Selenide.open("https://github.com/");
    }

    @Step("Ищем репозиторий по имени {repository}")
    public void searchForRepository(String repository) {
        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").sendKeys(repository);
        $("#query-builder-test").submit();
    }

    @Step("В результатах поиска переходим по ссылке репозитория {repository}")
    public void openRepositoryLink(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Открываем таб Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Проверяем, что существует Issue с номером {issueNumber}")
    public void shouldSeeIssueWithNumber(Integer issueNumber) {
        $(withText("#" + issueNumber)).should(exist);
    }
}
