import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
    private WebDriver webDriver;
   @Test(description = "opening link or not")
   public void sample1() {
       System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
       webDriver  = new ChromeDriver();
       webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

   }

    @Test(description = "Search  taking input")
    public void Sample2() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.quit();
    }

    @Test(description = "verify that the more relevant product for the search term is displayed on top for a particular search item ")
    public void sample3() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.quit();
    }

    @Test(description = "to verify a user able to login with a valid username and pass word")
    public void sample4() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//a[@name='Login']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.quit();
    }

    @Test(description = "verify if a user can login with a valid user name and invalid password ")
    public void sample5() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//a[@name='Login']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("test");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.quit();
    }

    @Test(description = "PLACE ORDER BUTTON IS WORKING")
    public void sample6() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElements(By.xpath("//select[@name='select_Qty']")).size();
        webDriver.findElement(By.xpath("//button[@class='btn app-button btn-success']")).click();
        webDriver.quit();

    }

    @Test(description = "verify that user can add product to cart")
    public void sample7() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();


        webDriver.quit();

    }

    @Test(description = "verify that user can buy the products added to the cart after signing to the application")
    public void sample8() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.quit();
    }

    @Test(description = "verify if the data in password field is either visible in astrerisk or bullet signs")
    public void sample9() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");

        webDriver.quit();
    }

    @Test(description = "verify that user can add multiple  products to cart")
    public void sample10() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("HP Pavilion 15-n039TX Laptop");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@caption='ADD TO CART']")).click();


        webDriver.quit();

    }

    @Test(description = "verify that we can add new address or not on clicking the + symbol")
    public void sample11(){
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElement(By.xpath("//button[@name='button5']")).click();
        webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//i[@class='app-icon wi wi-plus ng-star-inserted']")).click();
        webDriver.findElement(By.xpath("//input[@name='address_formWidget']")).sendKeys("Hyderabad");
        webDriver.findElement(By.xpath("//input[@name='city_formWidget']")).sendKeys("hyderabad");
        webDriver.findElement(By.xpath("//input[name='state_formWidget']")).sendKeys("Telangana");
        webDriver.findElement(By.xpath("//input[@name='country_formWidget']")).sendKeys("India");
        webDriver.findElement(By.xpath("//input[@name='pincode_formWidget']")).sendKeys("500100");
        webDriver.findElement(By.xpath("//button[@name='save']")).click();

        webDriver.quit();


    }



    @Test(description = "verify that the page as both save and reset button at the end")
    public void sample12() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElements(By.xpath("//select[@name='select_Qty']")).size();
        webDriver.findElement(By.xpath("//button[@class='btn app-button btn-success']")).click();
        webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//i[@class='app-icon wi wi-plus ng-star-inserted']")).click();
        webDriver.quit();
    }


    @Test(description = "verify that the clicking reset button after entering all details , resets all the fields")
    public void sample13() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElements(By.xpath("//select[@name='select_Qty']")).size();
        webDriver.findElement(By.xpath("//button[@class='btn app-button btn-success']")).click();
        webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//i[@class='app-icon wi wi-plus ng-star-inserted']")).click();
        webDriver.findElement(By.xpath("//input[@name='address_formWidget']")).sendKeys("Hyderabad");
        webDriver.findElement(By.xpath("//input[@name='city_formWidget']")).sendKeys("hyderabad");
        webDriver.findElement(By.xpath("//input[@name='state_formWidget']")).sendKeys("Telangana");
        webDriver.findElement(By.xpath("//input[@name='country_formWidget']")).sendKeys("India");
        webDriver.findElement(By.xpath("//input[@name='pincode_formWidget']")).sendKeys("500100");
        webDriver.findElement(By.xpath("//button[@name='reset']")).click();
        webDriver.quit();
    }

    @Test(description = "verify that not filling mandatory fields and clicking save button leads to validation error")
    public void sample14() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElements(By.xpath("//select[@name='select_Qty']")).size();
        webDriver.findElement(By.xpath("//button[@class='btn app-button btn-success']")).click();
        webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//i[@class='app-icon wi wi-plus ng-star-inserted']")).click();
        webDriver.findElement(By.xpath("//input[@name='address_formWidget']")).sendKeys("Hyderabad");
        webDriver.findElement(By.xpath("//input[@name='city_formWidget']")).sendKeys("hyderabad");
        webDriver.findElement(By.xpath("//input[@name='country_formWidget']")).sendKeys("India");
        webDriver.findElement(By.xpath("//input[@name='pincode_formWidget']")).sendKeys("500100");
        webDriver.findElement(By.xpath("//button[@name='save']")).click();

        webDriver.quit();
    }


    @Test(description = "verify that user is able to cancel the order")
    public void sample15() {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Moto G (Black, with 8 GB)");
        webDriver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
        webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        webDriver.findElements(By.xpath("//select[@name='select_Qty']")).size();
        webDriver.findElement(By.xpath("//button[@class='btn app-button btn-success']")).click();
        webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//i[@class='app-icon wi wi-plus ng-star-inserted']")).click();
        webDriver.findElement(By.xpath("//input[@name='address_formWidget']")).sendKeys("Hyderabad");
        webDriver.findElement(By.xpath("//input[@name='city_formWidget']")).sendKeys("hyderabad");
        webDriver.findElement(By.xpath("//input[@name='state_formWidget']")).sendKeys("telangana");
        webDriver.findElement(By.xpath("//input[@name='country_formWidget']")).sendKeys("India");
        webDriver.findElement(By.xpath("//input[@name='pincode_formWidget']")).sendKeys("500100");
        webDriver.findElement(By.xpath("//button[@name='save']")).click();
        webDriver.findElement(By.xpath("//i[@class='app-icon wi wi-chevron-right']")).click();
        webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//button[@name='doneBtn_wizard_payment']")).click();
        webDriver.findElement(By.xpath("//button[@name='button3']")).click();
        webDriver.findElement(By.xpath("//button[@class='btn app-button btn-primary ok-action']")).click();
        webDriver.quit();
    }











    }







    






