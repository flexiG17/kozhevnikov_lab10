package ApacheCommonsExample;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ApacheCommonsExample {
    private static String filePath = "src/main/java/ApacheCommonsExample/text.txt";
    private static final File file = new File(filePath);

    ApacheCommonsExample(String filePath) {
        ApacheCommonsExample.filePath = filePath;
    }

    public void writeSingleLineToFile(String line) throws IOException {
        FileUtils.writeStringToFile(file, line, "utf-8", true);
    }

    public void writeLinesListToFile(List<String> linesList) throws IOException {
        FileUtils.writeLines(file, "utf-8", linesList, true);
    }

    public File getFile() {
        return file;
    }

    public long getFileSize() {
        return FileUtils.sizeOf(file);
    }


    public long getLastModified() {
        long lastModified = 0;
        try {
            lastModified = FileUtils.lastModified(file);
        }
        catch (Exception e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
        return lastModified;
    }

    @Override
    public String toString() {
        String content =file.getName();

        try {
            content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }

        return content;
    }
}

