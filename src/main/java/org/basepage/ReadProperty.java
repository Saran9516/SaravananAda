package org.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	

	    private Properties properties;

	    public ReadProperty() {
	        properties = loadProperties();
	    }

	    private Properties loadProperties() {
	        Properties properties = new Properties();
	        FileInputStream input = null;

	        try {
	            // Load the properties from the config.properties file in the classpath
	            input = new FileInputStream("src/main/resources/configure.properties");
	            properties.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (input != null) {
	                try {
	                    input.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	        return properties;
	    }

	    public String getUrl() {
	        return properties.getProperty("url");
	    }

	    // Add methods for other properties if needed
	}
