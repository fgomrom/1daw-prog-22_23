package ut3.persona;

class Persona {
    private String name;
    private Integer age;
    private static String especie = "Humano";

    Persona () {

    }
    Persona (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    String getName () {
        return name;
    }

    void setName (String name) {
        this.name = name;
    }

    Integer getAge () {
        return age;
    }

    void setAge (Integer age) {
        this.age = age;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Persona.especie = especie;
    }

}
