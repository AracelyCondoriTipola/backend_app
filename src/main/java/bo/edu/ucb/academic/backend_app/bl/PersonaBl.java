package bo.edu.ucb.academic.backend_app.bl;

import bo.edu.ucb.academic.backend_app.dao.Persona1Dao;
import bo.edu.ucb.academic.backend_app.dao.PersonaDao;
import bo.edu.ucb.academic.backend_app.dto.PersonaApiDto;
import bo.edu.ucb.academic.backend_app.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaBl {
    private Persona1Dao personaDao;

    @Autowired
    public PersonaBl(Persona1Dao personaDao) {
        this.personaDao = personaDao;
    }


    public List<PersonaApiDto> allPersona(){
        List<PersonaApiDto> persona = personaDao.findAllPersona();
        return persona;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public PersonaDto savePersona (PersonaDto newPerson) {
        PersonaDto personaDto = new PersonaDto();
        personaDto.setFirst_name(newPerson.getFirst_name());
        personaDto.setLast_name(newPerson.getLast_name());
        personaDto.setEmail(newPerson.getEmail());
        personaDto.setDate_of_birth(newPerson.getDate_of_birth());
        personaDto.setPhone_number(newPerson.getPhone_number());
        personaDto.setAddress(newPerson.getAddress());
        personaDto.setCity(newPerson.getCity());
        personaDto.setStatus(newPerson.getStatus());
        personaDao.savePersona(personaDto);

        return personaDto;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public PersonaDto deletePersona(PersonaApiDto deletePersona , int id_person){
        PersonaDto personaDto = new PersonaDto();
        personaDto.setId_person(id_person);

        personaDto.setStatus(0);

        personaDao.deletePesona(personaDto);
        return personaDto;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public PersonaDto updatePersona(PersonaApiDto newPerson , int id_person){
        PersonaDto personaDto = new PersonaDto();

        personaDto.setFirst_name(newPerson.getFirst_name());
        personaDto.setLast_name(newPerson.getLast_name());
        personaDto.setEmail(newPerson.getEmail());
        personaDto.setDate_of_birth(newPerson.getDate_of_birth());
        personaDto.setPhone_number(newPerson.getPhone_number());
        personaDto.setAddress(newPerson.getAddress());
        personaDto.setCity(newPerson.getCity());

        personaDao.updatePersona(personaDto);
        return personaDto;
    }


}
