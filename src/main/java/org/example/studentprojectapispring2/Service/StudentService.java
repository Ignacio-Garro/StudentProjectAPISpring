package org.example.studentprojectapispring2.Service;

import org.example.studentprojectapispring2.Model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Long id, Student updatedStudent) {
        getStudentById(id).ifPresent(student -> {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
        });
    }

    public void deleteStudent(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}