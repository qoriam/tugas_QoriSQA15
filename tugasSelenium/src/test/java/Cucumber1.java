import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cucumber1 {
    WebDriver driver;
    String URL = "https://demoqa.com";


    @Given("user click menu widgets")
    public void userClickMenuWidgets() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

        driver.navigate().to(URL+"/widgets");
    }

    @When("user click button back")
    public void userClickButtonBack() {
        driver.navigate().back();
    }

    @And("user clik button forward")
    public void userClikButtonForward() {
        driver.navigate().forward();
    }

    @And("user click button refresh")
    public void userClickButtonRefresh() {
        driver.navigate().refresh();
    }

    @Given("user open menu tex-box")
    public void userOpenMenuTexBox() {
        driver.navigate().to(URL+"//text-box");
    }

    @When("user input name {string}")
    public void userInputName(String arg0) {
        driver.findElement(By.id("userName")).sendKeys("Sekolah QA");
    }

    @And("user input email {string}")
    public void userInputEmail(String arg0) {
        driver.findElement(By.id("userEmail")).sendKeys("sekolahqa@gmail.com");
    }

    @And("user input address current {string}")
    public void userInputAddressCurrent(String arg0) {
        driver.findElement(By.id("currentAddress")).sendKeys("Alamat sekarang dimana nih");
    }

    @And("user input permanent Address {string}")
    public void userInputPermanentAddress(String arg0) {
        driver.findElement(By.id("permanentAddress")).sendKeys("Alamat permanennya mana");
    }

    @Then("user click button submit")
    public void userClickButtonSubmit() {
        driver.findElement(By.id("submit")).submit();
    }

    @Given("user open menu checkbox")
    public void userOpenMenuCheckbox() {
        driver.navigate().to(URL + "/checkbox");
    }

    @When("user click checkbox Home")
    public void userClickCheckboxHome() {
        driver.findElement(By.className("rct-checkbox")).click();
    }

    @Then("checkbox is selected")
    public void checkboxIsSelected() {
        Select checkSelect = new Select(driver.findElement(By.xpath("")));
        checkSelect.selectByVisibleText("You have selected ");

        //assertion for checkbox is selected, but im wrong anw
    }

    @When("user clik menu radio button")
    public void userClikMenuRadioButton() {
        driver.navigate().to(URL + "/radio-button");
    }

    @And("user clik button Impressive")
    public void userClikButtonImpressive() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
    }

    @Then("radio button Impressive is selected")
    public void radioButtonImpressiveIsSelected() {
        Select dropTutorial = new Select(driver.findElement(By.xpath("Select dropTutorial = new Select(driver.findElement(By.id(\"navbtn_tutorials\")));\n" +
                "        dropTutorial.selectByVisibleText(\"Learn HTML\");")));
        dropTutorial.selectByVisibleText("You have selected ");
    }

    @When("user click menu selec-menu")
    public void userClickMenuSelecMenu() {
        driver.navigate().to(URL + "/select-menu");
    }

    @And("user click menu Group {int}")
    public void userClickMenuGroup(int arg0) {
        driver.findElement(By.id("withOptGroup")).click();
    }


    @Then("Group{int} is selected")
    public void groupIsSelected(int arg0) {
        driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]")).click();
    }
}
