import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import thymeleaf.config.WebAppConfig;
import thymeleaf.model.Student;
import thymeleaf.repository.StudentRepository;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(WebAppConfig.class);

        StudentRepository studentRepository =
                applicationContext.getBean("studentRepository", StudentRepository.class);

        studentRepository.saveStudent(new Student("Elnura","elnura@gmail.com",18));


    }

}
