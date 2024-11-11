# WordWiz - Dictionary Checker

**WordWiz** is a Java-based application that allows users to check if a word exists in a dictionary and provides suggestions for similar words. The application uses a **Trie data structure** for efficient word search and suggestions.

## Features

- Check if a word exists in the dictionary.
- Get suggestions for words based on a given prefix.
- Displays word definitions.
- Command-line interface (CLI) for user interaction.

## Technologies Used

- Java
- Trie Data Structure
- JSON (for storing dictionary data)

## Project Structure

```
WordWiz/
│
├── DictionaryApp.java      # Main class to run the application.
├── DictionaryLoader.java   # Class for loading dictionary from JSON.
├── Trie.java               # Trie implementation for word search.
├── English_Dictionary.json # JSON file containing dictionary data.
├── libs/                   # External libraries (e.g., json-simple)
│
└── README.md               # This file.
```

## Setup Instructions

### 1. **Download or Clone the Repository**

To get started, you can either **download** the project or **clone** it using the following command:

```bash
git clone https://github.com/your-username/WordWiz.git
```

### 2. **Install Java (if not already installed)**

Make sure you have **Java 8 or higher** installed on your system.

- To check if Java is installed, run:

  ```bash
  java -version
  ```

- If it's not installed, download and install it from the [official Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### 3. **Install JSON.simple Library**

This project uses the **json-simple** library for parsing the JSON file. You will need to download the `json-simple-1.1.1.jar` and place it in the `libs/` folder within the project.

- Download **json-simple** from [Maven Repository](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1).
- Place the `.jar` file in the `libs/` directory.

### 4. **Compile and Run the Application**

After setting up Java and the necessary library, follow these steps:

1. Open a terminal/command prompt in the project directory.

2. Compile the Java files with the following command:

   ```bash
   javac -cp ".;libs/json-simple-1.1.1.jar" *.java
   ```

3. Run the application:
   ```bash
   java -cp ".;libs/json-simple-1.1.1.jar" DictionaryApp
   ```

### 5. **Usage Instructions**

Once the application is running, it will ask for a word to check. Type a word and press Enter to check its validity in the dictionary.

#### Example 1: Checking a Word

```bash
Enter a word to check: nice
The word "nice" exists in the dictionary.
```

#### Example 2: Word Not Found (Suggestions Provided)

```bash
Enter a word to check: app
The word "app" is not found.
Suggestions:
- apparatus
- apparaillyng
- apparel
- apparence
- apparency
```

### 6. **Dictionary File Format**

The project uses a JSON file to store the dictionary words and their definitions. Here's an example of how the `English_Dictionary.json` file should be structured:

```json
{
  "uniclinal": "See Nonoclinal.",
  "sarong": "A sort of petticoat worn by both sexes in Java and the Malay Archipelago. Balfour (Cyc. of India)",
  "turcoman": "A member of a tribe of Turanians inhabiting a region east of the Caspian Sea.",
  "corrugator": "A muscle which contracts the skin of the forehead into wrinkles.",
  "self-murder": "Suicide.",
  "anacardium": "A genus of plants including the cashew tree. See Cashew.",
  "knurly": "Full of knots; hard; tough; hence, capable of enduring or resisting much.",
  "pock": "A pustule raised on the surface of the body in variolous and vaccine diseases. Of pokkes and of scab every sore. Chaucer.",
  "neuroma": "A tumor developed on, or connected with, a nerve, esp. one consisting of new-formed nerve fibers.",
  "hawser": "A large rope made of three strands each containing many yarns. Note: Three hawsers twisted together make a cable; but it nautical usage the distinction between cable and hawser is often one of size rather than of manufacture. Hawser iron, a calking iron.",
  "jolty": "That jolts; as, a jolty coach. [Colloq.]",
  "proterandry": "The condition of being proterandrous.",
  "leucic": "Pertaining to, or designating, an acid obtained from leucin, and called also oxycaproic acid.",
  "petrescence": "The process of changing into stone; petrification.",
  "bathos": "A ludicrous descent from the elevated to the low, in writing or speech; anticlimax."
}
```

### 7. **Troubleshooting**

If you encounter any issues, here are some common solutions:

- **Library not found**: Ensure that you have placed the `json-simple-1.1.1.jar` file in the `libs/` folder.
- **Java errors**: Make sure that you are using Java 8 or higher.

### 8. **Contributing**

Feel free to fork the repository and submit pull requests if you want to contribute. If you encounter bugs or have feature requests, create an issue on GitHub.

### 9. **License**

This project is open source and available under the MIT License.
