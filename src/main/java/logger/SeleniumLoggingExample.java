package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeleniumLoggingExample
{

    private static final Logger LOGGER = Logger.getLogger(SeleniumLoggingExample.class.getName());

    public static void main(String[] args) {
        // Configure logger and handlers
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        LOGGER.addHandler(consoleHandler);
        LOGGER.setLevel(Level.ALL);

        // Use the logger to log messages
        LOGGER.info("Starting Selenium WebDriver...");
        LOGGER.warning("This is a warning message.");
        LOGGER.severe("An error occurred!");

        // Perform Selenium actions and log accordingly
        // ...

        LOGGER.info("Test completed successfully.");

        // Close the browser and cleanup
        // ...
    }
}
