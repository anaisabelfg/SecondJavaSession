public class Person {

    private String name;
    private int age;
    private boolean driverLicense;
    private String[] allergies;

    public Person() {
    }

    public Person(String name, int age, boolean driverLicense, String[] allergies) {
        this.name = name;
        this.age = age;
        this.driverLicense = driverLicense;
        this.allergies = allergies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }
}
