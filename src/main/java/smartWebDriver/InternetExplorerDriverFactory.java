package smartWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class InternetExplorerDriverFactory extends AbstractWebDriverFactory {
    @Override
    public WebDriver getRemoteWebDriver(String seleniumHubUrl) throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
        return getRemoteWebDriverFromHub(seleniumHubUrl, capability);
    }

    @Override
    public WebDriver getLocalWebDriver() {
        System.setProperty("webdriver.id.driver", ".\\bin\\iedriverserver32\\IEDriverServer.exe");
        return new InternetExplorerDriver();
    }
}
