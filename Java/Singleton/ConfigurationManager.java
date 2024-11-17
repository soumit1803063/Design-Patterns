package Java.Singleton;

public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private String configData;

    // Private constructor to prevent direct instantiation
    private ConfigurationManager(String configData) {
        this.configData = configData;
    }

    // Public method to get the single instance
    public static ConfigurationManager getInstance(String configData) {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager(configData);
                }
            }
        }
        return instance;
    }

    // Method to retrieve configuration data
    public String getConfigData() {
        return configData;
    }
}
