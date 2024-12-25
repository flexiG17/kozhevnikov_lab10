package JacksonExample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("relatives")
    private Person[] relatives;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Person[] relatives) {
        this.name = name;
        this.age = age;
        this.relatives = relatives;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person[] getRelatives() {
        return relatives;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Person{name='" + name + "', age=" + age);
        if (relatives != null && relatives.length > 0) {
            result.append(", relatives=[");
            for (int i = 0; i < relatives.length; i++) {
                result.append(relatives[i].toString());
                if (i < relatives.length - 1) {
                    result.append(", ");
                }
            }
            result.append("]");
        } else {
            result.append(", relatives=null");
        }
        result.append("}");
        return result.toString();
    }
}