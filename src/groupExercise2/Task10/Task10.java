package groupExercise2.Task10;



public class Task10 {
    /*
    Provide Implementation for the diagram below. Then create a test class
    in which you need to create Objects of ChromeDriver, FirefoxDrive and
    SafariDriver classes and see which methods available to them.
     */
    public static void main(String[] args) {
        ChromeDriver a=new ChromeDriver();
        System.out.println(a.getTitle());
        a.open();
        a.getScreenshot();
        a.navigate();
        a.close();
        System.out.println("---------------------------------");
        FirefoxDriver b=new FirefoxDriver();
        System.out.println(b.getTitle());
        b.open();
        b.getScreenshot();
        b.navigate();
        b.close();
        System.out.println("---------------------------------");
        SafariDriver c=new SafariDriver();
        System.out.println(c.getTitle());
        c.open();
        c.getScreenshot();
        c.navigate();
        c.close();

    }
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public String getTitle() {
        return "ChromeDriver";
    }

    @Override
    public void open() {
        System.out.println("ChromeDriver open");
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver close");
    }

    @Override
    public void getScreenshot() {
        System.out.println("ChromeDriver get screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("ChromeDriver navigate");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public String getTitle() {
        return "FirefoxDriver";
    }

    @Override
    public void open() {
        System.out.println("FirefoxDriver open");
    }

    @Override
    public void close() {
        System.out.println("FirefoxDriver close");
    }

    @Override
    public void getScreenshot() {
        System.out.println("FirefoxDriver get screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("FirefoxDriver navigate");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public String getTitle() {
        return "SafariDriver";
    }

    @Override
    public void open() {
        System.out.println("SafariDriver open");
    }

    @Override
    public void close() {
        System.out.println("SafariDriver close");
    }

    @Override
    public void getScreenshot() {
        System.out.println("SafariDriver get screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("SafariDriver navigate");
    }
}

