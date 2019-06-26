package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecordedTest implements RecordedMain {

    private WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = new ChromeDriver();
    }


    @Test
    public void testRecordChrome() throws Exception {

        driver.get("http://www.google.ru");

        VideoRecorder recorder = new VideoRecorder();
        recorder.setRECORD_DIRECTORY("/home/plotoSUSE/IdeaProjects/chatRecVideo/Stream/");
        recorder.startRecording(driver);

        try {
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("Cheese!");
            element.submit();
        } finally {
            recorder.stopRecording("Google send Cheese");
        }

    }

    @After
    public void closeDriver() {
//        driver.quit();
        driver.close();
    }

}
