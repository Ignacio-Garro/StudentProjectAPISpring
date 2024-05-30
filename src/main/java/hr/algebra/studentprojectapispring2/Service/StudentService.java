package hr.algebra.studentprojectapispring2.Service;

import hr.algebra.studentprojectapispring2.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(Long id);

    public void addStudent(Student student);

    public void updateStudent(Long id, Student updatedStudent);

    public void deleteStudent(Long id);
}