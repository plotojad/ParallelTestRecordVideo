package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecordedTest2 implements RecordedMain {

    private WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = new ChromeDriver();
    }


    @Test
    public void testRecordChrome() throws Exception {

        driver.get("http://www.google.ru");

        VideoRecorder recorder = new VideoRecorder();
        recorder.setRECORD_DIRECTORY("/home/plotoSUSE/IdeaProjects/chatRecVideo/Stream2/");
        recorder.startRecording(driver);

        try {
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("Shoooock!");
            element.submit();
        } finally {
            recorder.stopRecording("Google send Shoooock!");
        }

    }

    @After
    public void closeDriver() {
//        driver.quit();
        driver.close();
    }
}


