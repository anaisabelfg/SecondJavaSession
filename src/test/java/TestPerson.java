import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestPerson {

    @Test
    public void createPerson() {
        Person person = new Person();
        person.setName("Adam");
        person.setAge(25);
        person.setDriverLicense(true);
        person.setAllergies(new String[]{"Carrot", "Milk"});


        Person person2 = new Person("Monika", 30, true, new String[]{"Cat", "Dog"});

        assertTrue(person.getName().equals("Adam"));
    }

    @Test
    public void averageAge() {

        Person person = new Person();
        person.setName("Adam");
        person.setAge(25);
        person.setDriverLicense(true);
        person.setAllergies(new String[]{"Carrot", "Milk"});


        Person person2 = new Person("Monika", 30, true, new String[]{"Cat", "Dog"});

        Person person3 = new Person();
        person.setName("Manuel");
        person.setAge(33);
        person.setDriverLicense(false);
        person.setAllergies(new String[]{"Carrot", "Cat"});


        Person person4 = new Person("Vanessa", 35, true, new String[]{});

        int totalAge = person.getAge() + person2.getAge() + person3.getAge() + person4.getAge();

        System.out.println("Average of age -> " + totalAge/4);

    }


}
