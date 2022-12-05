package bo.edu.ucb.academic.backend_app.dao;

import bo.edu.ucb.academic.backend_app.dto.PersonaApiDto;
import bo.edu.ucb.academic.backend_app.dto.PersonaDto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Mapper
public interface Persona1Dao {
    @Select("select id_person,first_name, last_name, email, date_of_birth, phone_number, address, city from person where status=1")
    List<PersonaApiDto> findAllPersona();

    @Insert("insert into person ( first_name, last_name, email, date_of_birth, phone_number, address, city, status ) values (#{first_name},#{last_name},#{email},#{date_of_birth},#{phone_number},#{address},#{city},#{status}) ")
    void savePersona(PersonaDto personaDto);

    @Delete("Update person SET status =#{status}"+
            "WHERE id_person = #{id_person}")
    void deletePesona(PersonaDto personaDto);

    @Update("Update person SET first_name = #{first_name}, last_name = #{last_name},email = #{email},date_of_birth = #{date_of_birth},phone_number = #{phone_number},address = #{address},city = #{city},status = #{status}"+
            "WHERE id_person = #{id_person}")
    void updatePersona(PersonaDto personaDto);


}

