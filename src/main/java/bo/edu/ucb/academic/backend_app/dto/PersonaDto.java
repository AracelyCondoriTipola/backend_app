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
    private Integer status;
    private Date tx_date;
    private Integer tx_id_user;
    private String tx_host;
    private Date tx_update;


    public PersonaDto(Integer id_person, String first_name, String last_name, String email, Date date_of_birth, String phone_number, String address, String city, Integer status, Date tx_date, Integer tx_id_user, String tx_host, Date tx_update) {
        this.id_person = id_person;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.address = address;
        this.city = city;
        this.status = status;
        this.tx_date = tx_date;
        this.tx_id_user = tx_id_user;
        this.tx_host = tx_host;
        this.tx_update = tx_update;
    }

    public PersonaDto() {
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

    public Integer getStatus() {
        return status;
    }

    public Date getTx_date() {
        return tx_date;
    }

    public Integer getTx_id_user() {
        return tx_id_user;
    }

    public String getTx_host() {
        return tx_host;
    }

    public Date getTx_update() {
        return tx_update;
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

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setTx_date(Date tx_date) {
        this.tx_date = tx_date;
    }

    public void setTx_id_user(Integer tx_id_user) {
        this.tx_id_user = tx_id_user;
    }

    public void setTx_host(String tx_host) {
        this.tx_host = tx_host;
    }

    public void setTx_update(Date tx_update) {
        this.tx_update = tx_update;
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
                ", status=" + status +
                ", tx_date=" + tx_date +
                ", tx_id_user=" + tx_id_user +
                ", tx_host='" + tx_host + '\'' +
                ", tx_update=" + tx_update +
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
