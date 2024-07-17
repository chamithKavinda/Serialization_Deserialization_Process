package lk.ijse.gdse68.serialization_deserialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    private String name;
    private String age;
    private String address;

    public Employee(@JsonProperty("name") String name,
                    @JsonProperty("age") String age,
                    @JsonProperty("address") String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
