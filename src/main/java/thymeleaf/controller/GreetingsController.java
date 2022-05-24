package thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thymeleaf.model.Student;
import thymeleaf.repository.StudentRepository;

@Controller
public class GreetingsController {

    private final StudentRepository studentRepository;

    public GreetingsController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String start(){
        studentRepository.saveStudent(new Student(


                "elnura",
                "elnura@gmail.com",
                18
            )
        );
        return "start";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String greetings(){
        return "greetings";
    }

}
