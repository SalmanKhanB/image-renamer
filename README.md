<p align="center">
  <img src="images/banner.png" width="800" alt="ImageRenamer Banner">
</p>

<h1 align="center">🖼️ ImageRenamer</h1>
<p align="center">
  <b>Batch Normalize Image Filenames for Clean Project Assets</b><br>
  <sub>Made with ❤️ for Developers & Designers</sub>
</p>

---

## ✨ Features

| **Functionality**         | **Supported Formats**          | **Operations**                      |
|---------------------------|---------------------------------|--------------------------------------|
| Lowercase conversion      | `.jpg` `.jpeg` `.png` `.gif`   | Batch rename all matching files      |
| Space replacement         | `.bmp` `.webp`                 | Non-destructive file operations      |
| Extension normalization   |                                 | Smart case detection                 |

---

## 🚀 Quick Start

### Prerequisites
- Java Runtime Environment (JRE 8+)
- Terminal/Command Prompt access

### Installation
```bash
# 1. Clone repository
git clone https://github.com/yourusername/ImageRenamer.git

# 2. Navigate to project directory
cd ImageRenamer

# 3. Compile (only first time)
javac ImageRenamer.java
Usage
bash
# Place images in project root directory then run:
java ImageRenamer

# Sample output:
✅ Renamed: "British Virgin Islands.jpg" → "british_virgin_islands.jpg"
❌ Failed: "readme.txt" (not an image)
📸 Before & After Examples
File Transformation
diff
- Czech Republic.PNG
+ czech_republic.png

- SCREENSHOT 2023.JPEG 
+ screenshot_2023.jpeg
Directory Structure
raw_assets/                           processed_assets/
├── Photo 1.JPG                       ├── photo_1.jpg
├── IMG_2023.PNG                      ├── img_2023.png
└── mixed CASE.gif                    └── mixed_case.gif
🛠️ Use Cases
Ideal For
Category	Example Implementation
📱 Mobile Development	Android drawable assets
🌐 Web Projects	CMS image uploads
🎨 Design Systems	Icon library standardization
🌍 Localization	Country flag assets
Common Scenarios
Preparing app store screenshots

Organizing e-commerce product images

Processing user-uploaded content

Converting designer exports to dev format

📂 Project Structure
ImageRenamer/
├── src/
│   └── ImageRenamer.java         # Main application logic
├── images/                       # Documentation assets
│   ├── banner.png                # Header image
│   ├── before.png                # Example input
│   └── after.png                 # Example output
├── LICENSE                       # MIT License
└── README.md                     # This documentation
🤝 Contributing
Fork the repository

Create a feature branch:
git checkout -b feat/awesome-feature

Commit changes:
git commit -m 'Add some awesome feature'

Push to branch:
git push origin feat/awesome-feature

Open a Pull Request

📜 License
This project is licensed under the MIT License - see the LICENSE file for details.

<p align="center"> Need help? Open an issue or ⭐ star if useful! </p> ```
Key features of this README:

Visual Hierarchy

Banner image with proper dimensions

Feature comparison table

Emoji-enhanced section headers

Clear code blocks with syntax highlighting

Practical Implementation Guides

Step-by-step installation

Before/after code diffs

Directory structure visualization

Use Case Focus

Implementation table for different scenarios

Common real-world applications

Developer-Friendly

Clear contribution guidelines

License information

Project structure overview

To complete your repository:

Create /images directory with:

banner.png (recommended 1280x640px)

before.png & after.png comparison shots

Add LICENSE file with MIT license text

Place Java file in root directory for easy access
