package testng;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

    @Test
    public void testCase1(){
        String result;
        System.out.println("test");
        try {
            HttpGet httpGet = new HttpGet("http://www.baidu.com");
            HttpClient httpClient = new DefaultHttpClient();
            HttpResponse response = httpClient.execute(httpGet);
            System.out.println(response.getStatusLine().getStatusCode());
            result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

}
