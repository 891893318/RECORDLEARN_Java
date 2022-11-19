import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 423322L;
    String name;
    double age;
    String sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, double age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
