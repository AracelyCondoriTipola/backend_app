package bo.edu.ucb.academic.backend_app.dao;
import bo.edu.ucb.academic.backend_app.dto.PersonaDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaDao {
    @Select("select id_person,first_name, last_name, email, date_of_birth, phone_number, address, city from person")
    List<PersonaDto> findAllCategories();
}
