import com.codeborne.selenide.*;

import org.junit.Test;

import com.codeborne.selenide.Selenide;

import org.openqa.selenium.By;
import static java.lang.Thread.sleep;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import org.openqa.selenium.Keys;

import javax.xml.xpath.XPath;

public class Homework5 {

    @Test

    public void TestCrome() throws InterruptedException {
        Configuration.browser="chrome";
        Configuration.baseUrl="https://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        Configuration.startMaximized=true;

        Selenide.open("https://www.facebook.com/");
        sleep(3000);
        $("#u_0_2").click();
        sleep(3000);
        $(byName("firstname")).setValue("Sofio");
        $(byName("lastname")).setValue("Buadze");
        $(byName("reg_email__")).setValue("555961714");
        $("#password_step_input").setValue("Password1");
        $("#month").selectOption("Feb");
        $(byName("birthday_day")).selectOption("18");
        $("#year").selectOption("1990");
        $(byText("Custom")).click();
        $(byText("Select your pronoun")).shouldBe(Condition.visible);
        $(byName("preferred_pronoun")).selectOption("She: \"Wish her a happy birthday!\"");
        $(byName("custom_gender")).setValue("Female");


        sleep(3000);

    }
}
