package ApacheCommonsExample;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        ApacheCommonsExample apacheCommonExampleFile = new ApacheCommonsExample("src/main/java/ApacheCommonsExample/text.txt");

        apacheCommonExampleFile.writeSingleLineToFile("Я искал твою тень\n");
        apacheCommonExampleFile.writeSingleLineToFile("Среди каменных стен\n");

        List<String> firstVerseEnd = List.of("Нет! Я цеплялся за свет", "В темноте\n");
        apacheCommonExampleFile.writeLinesListToFile(firstVerseEnd);

        List<String> secondVerseStart = List.of("Я звонил и бросал", "я писал и стирал", "Я бежал за тобой", "по знакомым следам");
        apacheCommonExampleFile.writeLinesListToFile(secondVerseStart);

        System.out.println("Содержимое файла: ");
        System.out.println(apacheCommonExampleFile);

        System.out.println("Размер файла: " + apacheCommonExampleFile.getFileSize());
        System.out.println("Последнее изменение: " + apacheCommonExampleFile.getLastModified());
    }
}
