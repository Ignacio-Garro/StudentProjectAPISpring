package hr.algebra.studentprojectapispring2.Controller;

import hr.algebra.studentprojectapispring2.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import hr.algebra.studentprojectapispring2.Service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private final JmsTemplate jmsTemplate;

    public StudentController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    /**
     * GET /students
     * Example: GET http://localhost:8080/students
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }



    /**
     * GET /students/{id}
     * Example: GET http://localhost:8080/students/1
     */
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }



    /**
     * POST /students
     * Example:
     * POST http://localhost:8080/students
     * Body:
     * {
     *     "id": 1,
     *     "name": "John Doe",
     *     "email": "john.doe@example.com"
     * }
     */
    @PostMapping
    public void addStudent(@RequestBody Student student) {
        /*
        jmsTemplate.convertAndSend(
                "Saving the the hardware to the database: " +
                        student.getName());

         */

        studentService.addStudent(student);
    }



    /**
     * PUT /students/{id}
     * Example:
     * PUT http://localhost:8080/students/1
     * Body:
     * {
     *     "name": "John Doe Updated",
     *     "email": "john.doe.updated@example.com"
     * }
     */
    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }



    /**
     * DELETE /students/{id}
     * Example: DELETE http://localhost:8080/students/1
     */
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
