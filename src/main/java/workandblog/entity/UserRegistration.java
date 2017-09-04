package workandblog.entity;


import javax.persistence.*;

@Entity
@Table(name = "userRegistration")
public class UserRegistration {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String compass;

    public UserRegistration() {
    }

    public UserRegistration(String name, String surname, String email, String password, String compass) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.compass = compass;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompass() {
        return compass;
    }

    public void setCompass(String confirmpassword) {
        this.compass = confirmpassword;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", compass='" + compass + '\'' +
                '}';
    }
}
