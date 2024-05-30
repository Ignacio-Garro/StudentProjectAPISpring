package hr.algebra.studentprojectapispring2.DataInitializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import hr.algebra.studentprojectapispring2.Model.Student;
import hr.algebra.studentprojectapispring2.Service.StudentService;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        // Create initial student objects
        Student student1 = new Student(
                1L,
                "Doe",
                "doe@gmail.com");
        Student student2 = new Student(
                2L,
                "Joe",
                "joe@gmail.com");
        Student student3 = new Student(
                3L,
                "Moe",
                "moe@gmail.com");

        // Insert initial students into the database
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        System.out.println("Initial data inserted into the database.");
    }
}