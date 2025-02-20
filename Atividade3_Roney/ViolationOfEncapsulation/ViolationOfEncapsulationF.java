package ViolationOfEncapsulation;

public class ViolationOfEncapsulationF {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }
}

class Person {
    private String name;
    private int age;

    // Getter e Setter para 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter para 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {  // Exemplo de validação para garantir que a idade seja válida
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
