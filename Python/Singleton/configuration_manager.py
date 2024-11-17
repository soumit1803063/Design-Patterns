from threading import Lock

class ConfigurationManager:
    _instance = None
    _lock = Lock()  # Lock for thread-safety

    def __new__(cls, config_data=None):
        # Double-checked locking for Singleton
        if not cls._instance:
            with cls._lock:
                if not cls._instance:
                    cls._instance = super(ConfigurationManager, cls).__new__(cls)
                    cls._instance._initialize(config_data)
        return cls._instance

    def _initialize(self, config_data):
        # Private method for initialization
        self.config_data = config_data

    def get_config_data(self):
        # Method to retrieve configuration data
        return self.config_data
