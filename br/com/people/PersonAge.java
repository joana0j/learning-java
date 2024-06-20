package br.com.people;

public class PersonAge {
    private String name;
    private int age;

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void verifyAge() {
        if (age >= 18) {
            System.out.println(name + " can drink! :D");
        } else {
            System.out.println(name + " cannot drink! :(");
        }
    }

    public static void main(String[] args) {

        PersonAge person1 = new PersonAge();
        person1.setName("Klaus");
        person1.setAge(24);

        PersonAge person2 = new PersonAge();
        person2.setName("Mei");
        person2.setAge(17);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        person1.verifyAge();

        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        person2.verifyAge();
    }


}
