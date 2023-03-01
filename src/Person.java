public class Person extends Book {
    protected String name;
    protected int age;
    protected String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public void doBirthday() {

        this.setAge(getAge() + 1);
        System.out.println("Happy birthday " + this.name + "!" + " now you are " + this.age + " years old!" );
    }
}
