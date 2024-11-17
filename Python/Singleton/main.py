from configuration_manager import ConfigurationManager
def main():
    # Initialize the configuration with valid data
    manager1 = ConfigurationManager("Initial Config")

    # Safely retrieve the configuration
    print("Manager Config:", manager1.get_config_data())

    # Attempt to create another instance with new data
    manager2 = ConfigurationManager("New Config")

    # Verify both instances are the same and show consistent data
    print("Manager2 Config:", manager2.get_config_data())

if __name__ == "__main__":
    main()
