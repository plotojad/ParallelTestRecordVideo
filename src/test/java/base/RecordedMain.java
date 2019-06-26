package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public interface RecordedMain {


    @Before
    public void setUpDriver() throws MalformedURLException;


    @Test
    public void testRecordChrome() throws Exception;

    @After
    public void closeDriver();

}