<p align="center">
  <img src="images/banner.png" width="500" alt="Flag Renamer Banner">
</p>

<h1 align="center">🇺🇳 Flag File Normalizer</h1>
<p align="center">
  <b>From inconsistent naming to perfectly standardized flag files</b><br>
  <sub>Transform "United Kingdom.png" → "united_kingdom.png" with one command</sub>
</p>

---

## 📸 Visual Transformation

### Before: Mixed Format Chaos
<img src="images/before.png" width="600" alt="Before renaming example">

Common issues fixed:
- Random capitalization ("Algeria" vs "belarus")
- Spaces in filenames ("aland islands")
- Inconsistent extensions (".PNG" vs ".jpg")

### After: Perfect Consistency
<img src="images/after.png" width="600" alt="After renaming example">

Results you get:
- Uniform lowercase ("austria" not "Austria")
- Spaces → underscores ("british_virgin_islands")
- Standardized extensions (all .png)

---

## 🚀 How It Works

```java
// Sample transformation logic:
String original = "Czech Republic.PNG";
String normalized = original.toLowerCase().replace(" ", "_");
// Result: "czech_republic.png"
💻 Usage
Place your flag images in a folder

Run the tool:

bash
java ImageRenamer
Watch the magic happen:

Processing flag images...
✔ Renamed: "United States.png" → "united_states.png"
✔ Renamed: "South Korea.jpg" → "south_korea.jpg"
✔ Renamed: "Côte d'Ivoire.gif" → "cote_d_ivoire.gif"
🌟 Key Features
Before	After	Benefit
<img src="before.png" width="200">	<img src="after.png" width="200">	Consistent naming for easier coding
Photo 1.JPG	photo_1.jpg	Lowercase standardization
SCREENSHOT 2023.PNG	screenshot_2023.png	Space handling
🛠️ Technical Details
Supported Formats:

PNG (recommended for flags)

SVG (vector support)

JPG/WebP (fallback formats)

Special Cases Handled:

bash
"St. Kitts & Nevis"  → "st_kitts_and_nevis"
"Åland Islands"      → "aland_islands"
"São Tomé"          → "sao_tome"
📂 Ideal Project Structure
/flags/
├── /raw/                  # Original mixed-format files
│   ├── before.png         # Your source files
│   └── Example Flag.JPG   
│
└── /processed/            # After running ImageRenamer
    ├── after.png          # Consistent output
    └── example_flag.jpg
<p align="center"> <img src="banner.png" width="400" style="border: 1px solid #eee; margin-top: 20px;"> </p><details> <summary>🔄 Click to see full transformation example</summary>
Before	After
<img src="images/before.png" width="300">	<img src="images/after.png" width="300">
</details> 

## 🧠 Use Cases

### 🎯 Perfect for:

#### 🟢 Mobile & Web Development
- **Android Development**
  - Prepare `res/drawable/` folders for Android Studio
  - Standardize asset names for Material Design components
  - Batch process app icons and splash screens

- **Flutter Projects**
  - Organize assets in `assets/` directory
  - Normalize image names for pubspec.yaml
  - Prepare consistent asset references

- **React Native**
  - Standardize image imports
  - Normalize asset names for require() statements
  - Prepare consistent image references

#### 🧩 Design & Development Workflow
- **Dev-Design Handoff**
  - Convert design asset names to developer-friendly format
  - Maintain consistent naming across design tools (Figma, Sketch)
  - Streamline asset delivery process

#### 📦 Asset Management
- **UI Component Libraries**
  - Batch cleanup for scalable UI projects
  - Standardize icon collections
  - Prepare consistent asset packages

- **Country Flag Collections**
  - Normalize flag image names
  - Prepare flag sets for internationalization
  - Create consistent flag libraries

- **Icon Libraries**
  - Standardize icon naming conventions
  - Prepare icon sets for various platforms
  - Create consistent icon packages

### 💡 Benefits
- **Time Saving**: Process hundreds of files in seconds
- **Consistency**: Maintain uniform naming across projects
- **Error Prevention**: Eliminate naming-related bugs
- **Better Organization**: Create clean, predictable file structures

## 👨‍💻 About the Developer

Created by [Salman Khan](https://www.linkedin.com/in/salman-khan-458489154/) 

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal (PowerShell, Command Prompt, or Terminal)

### Step-by-Step Guide

1. **Download the Tool**
   ```bash
   git clone https://github.com/yourusername/image-renamer.git
   cd image-renamer
   ```

2. **Prepare Your Images**
   - Create a folder for your images (e.g., `input_images/`)
   - Place all your flag images in this folder
   - Supported formats: PNG, SVG, JPG, WebP

3. **Open Terminal in Project Directory**
   ```bash
   # Navigate to the directory containing ImageRenamer.java
   cd path/to/image-renamer
   ```

4. **Compile the Program**
   ```bash
   # Make sure you're in the directory containing ImageRenamer.java
   # Then compile the Java file
   javac ImageRenamer.java
   
   # This will create ImageRenamer.class in the same directory
   ```

5. **Run the Tool**
   ```bash
   # Run the program using the .class file
   java ImageRenamer input_images/
   ```

6. **View Results**
   - Processed images will be saved in `output_images/` folder
   - Check the console for progress and results
   - Example output:
     ```
     Processing images...
     ✔ Renamed: "United States.png" → "united_states.png"
     ✔ Renamed: "South Korea.jpg" → "south_korea.jpg"
     ✔ Renamed: "Côte d'Ivoire.gif" → "cote_d_ivoire.gif"
     ✅ Process completed: 3 files renamed
     ```

### Command Line Options
```bash
java -jar image-renamer.jar [options] <input_directory>

Options:
  --output-dir <dir>    Specify output directory (default: output_images/)
  --format <format>     Set output format (default: png)
  --recursive          Process subdirectories
  --dry-run            Show what would be renamed without making changes
  --help               Show help message
```

### Example Usage
```bash
# Basic usage
java -jar image-renamer.jar flags/

# Custom output directory
java -jar image-renamer.jar --output-dir processed_flags/ flags/

# Process subdirectories
java -jar image-renamer.jar --recursive flags/

# Preview changes without renaming
java -jar image-renamer.jar --dry-run flags/
```
 
```


