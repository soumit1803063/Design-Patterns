package Java.Singleton;

public class Main {
    public static void main(String[] args) {
        // Initialize the configuration with valid data
        ConfigurationManager manager1 = ConfigurationManager.getInstance("Initial Config");
        
        // Safely retrieve the configuration
        System.out.println("Manager Config: " + manager1.getConfigData());

        // Attempt to create another instance with new data
        ConfigurationManager manager2 = ConfigurationManager.getInstance("New Config");
        
        // Verify both instances are the same and show consistent data
        System.out.println("Manager2 Config: " + manager2.getConfigData());

    }
}
