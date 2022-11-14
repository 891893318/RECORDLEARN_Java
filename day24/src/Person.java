public class Person implements Comparable {
    String name;
    double age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, double age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    public int compareTo(Object o) {
        if (o instanceof Person person){
            int compare =  this.name.compareTo(person.name);
            if (compare!=0){
                return compare;
            }
            else {
                return Integer.compare((int) this.age, (int) person.age);
            }
        }else {
            throw new RuntimeException("类型不匹配");
        }
    }
}
