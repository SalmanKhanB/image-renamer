import java.io.File;
import java.util.Scanner;

public class ImageRenamer {

    public static void main(String[] args) {
        String directoryPath;
        
        // If no command line argument is provided, ask for directory path
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the directory path containing images:");
            directoryPath = scanner.nextLine().trim();
            scanner.close();
        } else {
            directoryPath = args[0];
        }

        File folder = new File(directoryPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Error: Invalid directory: " + directoryPath);
            return;
        }

        // Supported image file extensions
        String[] imageExtensions = {"jpg", "jpeg", "png", "gif", "bmp", "webp"};

        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Error: No files found in directory: " + directoryPath);
            return;
        }

        System.out.println("Processing files in: " + directoryPath);
        int renamedCount = 0;
        int errorCount = 0;

        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                String extension = getFileExtension(name).toLowerCase();

                // Check if it's an image
                boolean isImage = false;
                for (String ext : imageExtensions) {
                    if (ext.equals(extension)) {
                        isImage = true;
                        break;
                    }
                }

                if (isImage) {
                    // Clean the filename: remove special characters and replace spaces with underscores
                    String newName = cleanFileName(name);
                    if (!newName.equals(name)) {
                        File newFile = new File(file.getParent(), newName);
                        try {
                            if (file.renameTo(newFile)) {
                                System.out.println("Success: Renamed " + name + " to " + newName);
                                renamedCount++;
                            } else {
                                System.out.println("Error: Could not rename " + name);
                                errorCount++;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Failed to rename " + name + " - " + e.getMessage());
                            errorCount++;
                        }
                    }
                }
            }
        }

        System.out.println("\nProcess completed:");
        System.out.println("- Files renamed: " + renamedCount);
        if (errorCount > 0) {
            System.out.println("- Errors encountered: " + errorCount);
        }
    }

    // Helper to get the file extension
    private static String getFileExtension(String fileName) {
        int lastDot = fileName.lastIndexOf('.');
        if (lastDot == -1 || lastDot == fileName.length() - 1) {
            return "";
        }
        return fileName.substring(lastDot + 1);
    }

    // Helper to clean filename
    private static String cleanFileName(String fileName) {
        // Get the extension
        String extension = getFileExtension(fileName);
        String nameWithoutExt = fileName.substring(0, fileName.length() - (extension.isEmpty() ? 0 : extension.length() + 1));
        
        // Convert to lowercase and replace spaces with underscores
        String cleaned = nameWithoutExt.toLowerCase()
            .replace(" ", "_")
            .replaceAll("[^a-z0-9_]", ""); // Remove all special characters
        
        // Add back the extension if it exists
        return extension.isEmpty() ? cleaned : cleaned + "." + extension;
    }
}
