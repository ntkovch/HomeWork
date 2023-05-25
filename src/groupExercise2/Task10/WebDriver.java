package groupExercise2.Task10;

public interface WebDriver {
    String getTitle();
    void open();
    void close();

}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}