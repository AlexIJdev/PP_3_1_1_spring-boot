package web.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty!")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters!")
    private String name;

    @Column(name = "last_name")
    @NotEmpty(message = "Last Name should not be empty!")
    @Size(min = 2, max = 50, message = "Last Name should be between 2 and 30 characters!")
    private String lastName;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be greater than 0!")
    private int age;

    public User() {
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                '}';
    }
}