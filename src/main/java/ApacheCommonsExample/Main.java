package ApacheCommonsExample;

import java.io.IOException;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        ApacheCommonsExample apacheCommonExample = new ApacheCommonsExample("src/main/java/ApacheCommonsExample/text.txt");

        apacheCommonExample.writeSingleLineToFile("Я искал твою тень\n");
        apacheCommonExample.writeSingleLineToFile("Среди каменных стен\n");

        List<String> firstVerseEnd = List.of("Нет! Я цеплялся за свет", "В темноте\n");
        apacheCommonExample.writeLinesListToFile(firstVerseEnd);

        List<String> secondVerseStart = List.of("Я звонил и бросал", "я писал и стирал", "Я бежал за тобой", "по знакомым следам");
        apacheCommonExample.writeLinesListToFile(secondVerseStart);

        System.out.println("Содержимое файла: ");
        System.out.println(apacheCommonExample);
    }
}
