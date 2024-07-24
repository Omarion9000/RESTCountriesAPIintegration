# JavaFX REST Countries API Integration

## Description

This project is a JavaFX application that allows users to search for information about countries using the REST Countries API. The application makes an HTTP request to the API, parses the JSON response, and displays the data in the user interface.

## Features

- **User Interface**: A simple interface that allows users to enter a country's name and get information about that country.
- **HTTP Request**: Uses `HttpURLConnection` to make GET requests to the REST Countries API.
- **JSON Parsing**: Uses the `Gson` library to parse JSON responses into Java objects.
- **Dynamic UI Updates**: Updates the user interface with the data obtained from the API.

## Requirements

- **Java 11 or higher**
- **JavaFX 11 or higher**
- **Gson Library**

## Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/your_username/your_repository.git
    cd your_repository
    ```

2. **Set up the project in IntelliJ IDEA**:
    - Open IntelliJ IDEA.
    - Select `File` > `Open` and choose the project directory.
    - Make sure the JavaFX and Gson dependencies are correctly configured.

3. **Add Dependencies**:
    - If you are using Maven, add the following to your `pom.xml`:
        ```xml
        <dependencies>
            <dependency>
                <groupId>com.google.code.gson</groupId>
                <artifactId>gson</artifactId>
                <version>2.8.8</version>
            </dependency>
            <dependency>
                <groupId>org.openjfx</groupId>
                <artifactId>javafx-controls</artifactId>
                <version>11</version>
            </dependency>
            <!-- Add other JavaFX dependencies as needed -->
        </dependencies>
        ```

    - If you are using Gradle, add the following to your `build.gradle`:
        ```groovy
        dependencies {
            implementation 'com.google.code.gson:gson:2.8.8'
            implementation 'org.openjfx:javafx-controls:11'
            // Add other JavaFX dependencies as needed
        }
        ```

## Usage

1. **Run the Application**:
    - Run the `HelloApplication` class to start the application.

2. **Enter a Country**:
    - Type the name of a country in the text field and press the "Fetch Country Info" button.

3. **View Results**:
    - The results will be displayed in the text area, including the country's name, capital, bordering countries, and spoken languages.

## Project Structure

- `src/main/java/org/example/week11/`
  - `HelloApplication.java`: The main class that sets up the user interface and handles API requests.
  - `APIService.java`: Class that handles HTTP requests to the REST Countries API and parses JSON responses.
  - `CountryResponse.java`: Model class representing the structure of the country data.



