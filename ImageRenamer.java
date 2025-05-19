import java.io.File;

public class ImageRenamer {

    public static void main(String[] args) {
        File folder = new File(".");

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        // Supported image file extensions
        String[] imageExtensions = {"jpg", "jpeg", "png", "gif", "bmp", "webp"};

        File[] files = folder.listFiles();
        if (files == null) {
            System.out.println("No files found.");
            return;
        }

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
                    String newName = name.toLowerCase().replace(" ", "_");
                    if (!newName.equals(name)) {
                        File newFile = new File(file.getParent(), newName);
                        if (file.renameTo(newFile)) {
                            System.out.println("Renamed: " + name + " → " + newName);
                        } else {
                            System.out.println("Failed to rename: " + name);
                        }
                    }
                }
            }
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
}
