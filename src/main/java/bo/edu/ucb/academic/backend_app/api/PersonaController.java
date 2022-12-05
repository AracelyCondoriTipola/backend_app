package bo.edu.ucb.academic.backend_app.api;

import bo.edu.ucb.academic.backend_app.bl.PersonaBl;
import bo.edu.ucb.academic.backend_app.dto.PersonaApiDto;
import bo.edu.ucb.academic.backend_app.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/personas")
public class PersonaController {
    private PersonaBl personaBl;


    public PersonaController(PersonaBl personaBl) {

        this.personaBl = personaBl;
    }

    @GetMapping(path ="/",produces = APPLICATION_JSON_VALUE)
    public List<PersonaApiDto> findAllPersona(){
        return personaBl.allPersona();
    }

    @PostMapping(path= "/", consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public PersonaDto addPersona(@RequestBody PersonaDto personaDto){

        return  personaBl.savePersona(personaDto);
    }
    @DeleteMapping(path = "/{id_person}",consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public PersonaDto deletePersona(@RequestBody PersonaApiDto personaApiDto, @PathVariable("id_person") Integer id_person) {
        return personaBl.deletePersona(personaApiDto,id_person);}

    @PutMapping(path = "/{id_person}",consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public PersonaDto updatePersona(@RequestBody PersonaApiDto personaApiDto, @PathVariable("id_person") Integer id_person) {
        return personaBl.updatePersona(personaApiDto,id_person) ;
}

}
