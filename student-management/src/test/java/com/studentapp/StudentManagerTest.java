package com.studentapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentManagerTest {
    @Test
    public void testAddAndGetStudents() {
        StudentManager manager = new StudentManager();
        Student student = new Student("1", "John Doe");
        manager.addStudent(student);
        
        assertEquals(1, manager.getStudents().size());
        assertEquals("John Doe", manager.getStudents().get(0).getName());
    }
}
