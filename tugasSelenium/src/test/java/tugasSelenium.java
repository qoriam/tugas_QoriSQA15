import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.rmi.server.ExportException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class tugasSelenium {
    static WebDriver driver;
    static String URL = "https://demoqa.com";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

//        driver.manage().window().maximize();
    }

    @Test
    public void b_Behavior() throws Exception{
        driver.navigate().to(URL+"/widgets");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        String titleWeb = driver.getTitle();
        System.out.println("Title webnya adalah " + titleWeb);

        String pageSource = driver.getPageSource();
        System.out.println("Isian Page Source yang sangat banyak");
        System.out.println(pageSource);

        Thread.sleep(3000);
    }

    @Test
    public void c_WebElement() throws Exception{
        driver.navigate().to(URL + "/frames");

        String ambilText = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText();
        System.out.println("Ini loh isi Textnya: " + ambilText);

        String ambilCss = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).getCssValue("background");
        System.out.println("Warna Backgroundnya adalah " + ambilCss);

        String ambilAtribut = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).getAttribute("class");
        System.out.println("Ini adalah Atribut class nya : " + ambilAtribut);

        Thread.sleep(3000);
    }

    @Test
    public void d_Interaction() throws Exception{
        driver.navigate().to(URL + "/text-box");
        driver.findElement(By.id("userName")).sendKeys("Sekolah QA");
        driver.findElement(By.id("userEmail")).sendKeys("sekolahqa@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Alamat sekarang dimana nih");
        driver.findElement(By.id("permanentAddress")).sendKeys("Alamat permanennya mana");
        driver.findElement(By.id("submit")).submit();

        Thread.sleep(3000);
    }

    @Test
    public void e_checkBox() throws Exception{
        driver.navigate().to(URL + "/checkbox");
        driver.findElement(By.className("rct-checkbox")).click();
    }

    @Test
    public void f_radioButton() throws Exception{
        driver.navigate().to(URL + "/radio-button");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();

        Select dropTutorial = new Select(driver.findElement(By.xpath("Select dropTutorial = new Select(driver.findElement(By.id(\"navbtn_tutorials\")));\n" +
                "        dropTutorial.selectByVisibleText(\"Learn HTML\");")));
        dropTutorial.selectByVisibleText("You have selected ");

        Thread.sleep(3000);
    }

    @Test
    public void g_Dropdown() throws Exception{
        driver.navigate().to(URL + "/select-menu");
        driver.findElement(By.id("withOptGroup")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]")).click();
    }

    @Test
    public void h_HandleAlert() throws Exception{
        driver.navigate().to(URL + "/alerts");
        driver.findElement(By.id("alertButton")).click();

        Alert alertnya = driver.switchTo().alert();
        alertnya.dismiss();
    }




    @AfterClass
    public static void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }


}
