package bo.edu.ucb.academic.backend_app.dto;

import java.util.Date;
import java.util.Objects;

public class PersonaDto {
    private Integer id_person;
    private String first_name;
    private String last_name;
    private String email;
    private Date date_of_birth;
    private String phone_number;
    private String address;
    private String city;


    public PersonaDto(Integer id_person, String first_name, String last_name, String email, Date date_of_birth, String phone_number, String address, String city) {
        this.id_person = id_person;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.address = address;
        this.city = city;
    }

    public Integer getId_person() {
        return id_person;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "PersonaDto{" +
                "id_person=" + id_person +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonaDto)) return false;
        PersonaDto that = (PersonaDto) o;
        return Objects.equals(id_person, that.id_person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_person);
    }
}
