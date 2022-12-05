package bo.edu.ucb.academic.backend_app.dao;
import bo.edu.ucb.academic.backend_app.dto.PersonaApiDto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface PersonaDao {

    @Select("select id_person,first_name, last_name, email, date_of_birth, phone_number, address, city from person")
    List<PersonaApiDto> findAllPersona();


}

