import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DemoSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
//
//        String baseUrl = "https://www.supremenewyork.com/";
//
////        driver.get(baseUrl);
////        driver.manage().window().fullscreen();
////        Thread.sleep(3000);
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        driver.findElement(By.xpath("//a[@class='shop_link']")).click();
////        Thread.sleep(3000);
//
        driver.get("https://www.supremenewyork.com/shop/accessories/hgu0ojmya/sbpfz50jd");
        List<WebElement> sizes = driver.findElements(By.xpath("//select[@id='s']/option"));
        Map<String,String> navidMap = new HashMap<>();
        for(int i = 0; i < sizes.size(); i++) {

            System.out.println(sizes.get(i).getAttribute("value"));
            navidMap.put(sizes.get(i).getText(), sizes.get(i).getAttribute("value"));

        }

        System.out.println(navidMap);
        Thread.sleep(3000);
        /*
        // we used css to locate multiple elements, hence By.Id was only returning 1 element
        sizes = driver.findElements(By.cssSelector("select[name='s'] > option"));

        for(int i = 0; i < sizes.size(); i++) {

            System.out.println(sizes.get(i).getAttribute("value"));
        }*/

        driver.close();
    }
}
