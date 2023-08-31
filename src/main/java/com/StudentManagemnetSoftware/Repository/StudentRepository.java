package com.StudentManagemnetSoftware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagemnetSoftware.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
