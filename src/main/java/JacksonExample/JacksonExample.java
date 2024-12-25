package JacksonExample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonExample {
    public static void main(String[] args) throws IOException {
        Person dad = new Person("Андрей", 60);
        Person mother = new Person("Ирина", 55);
        Person[] relatives = {dad, mother};

        Person son = new Person("Максим", 25, relatives);

        ObjectMapper objectMapper = new ObjectMapper();

        File jsonFile = new File("src/main/java/JacksonExample/person.json");
        objectMapper.writeValue(jsonFile, son);
        System.out.println("Объект записан в JSON файл");

        Person deserializedPerson = objectMapper.readValue(jsonFile, Person.class);
        System.out.println("Десериализованный объект:");
        System.out.println(deserializedPerson);
    }
}

