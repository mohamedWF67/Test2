package com.mycompany.School_app;

import java.util.HashSet;
import java.util.Objects;

public class Enrollment {

    //Attributes and collections
    private static int count = 0;//Number of objects made
    private int id;
    private Student student;
    private HashSet<Module> modules;

    //Constructor with a module
    public Enrollment(Student student, Module module) {
        this.id = ++count;
        this.student = student;
        this.modules = new HashSet<>();
        addModule(module);
    }

    //Constructor with all the modules
    public Enrollment(int id, Student student, HashSet<Module> modules) {
        this.id = id;
        this.student = student;
        this.modules = modules;
    }

    //Getter for Count
    public static int getCount() {
        return count;
    }

    //Setter for Count
    public static void setCount(int count) {
        Enrollment.count = count;
    }

    //Getter for ID
    public int getId() {
        return id;
    }

    //Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    //Getter for student
    public Student getStudent() {
        return student;
    }

    //Setter for Student
    public void setStudent(Student student) {
        this.student = student;
    }

    //Getter for modules as a HashSet
    public HashSet<Module> getModules() {
        return modules;
    }

    //Setter for modules as a HashSet
    public void setModules(HashSet<Module> modules) {
        this.modules = modules;
    }

    //Checks if the modules are empty
    public boolean isEmpty() {
        return modules.isEmpty();
    }

    //Checks if the module Exists
    public boolean moduleExists(Module module) {
        return modules.contains(module);
    }

    //Adds module to modules
    public boolean addModule(Module module) {
        if (!module.isFull()){
            if (!modules.contains(module)) {
                if (module.checkCompatability(student)) {
                    modules.add(module);
                    module.addEnrolledModule();
                    return true;
                }
            }else{
                System.err.println("Module " + module.getName() + " is already enrolled");
            }
        }else {
            System.err.println("Module is Full");
        }
        return false;
    }

    //Remove module from modules
    public boolean removeModule(Module module) {
        try {
            if (modules.contains(module)) {
                modules.remove(module);
                module.removeEnrolledModule();
                return true;
            }else {
                System.err.println("No Enrollment for this module");
                return false;
            }
        }catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    //Print modules
    public boolean printModules() {
        if(!modules.isEmpty()) {
            for (Module module : modules) {
                System.out.println(module);
            }
            return true;
        }else{
            System.err.println("No modules");
            return false;
        }
    }

    //Returns module names as a String
    public String getModuleNames(){
        String moduleNames = "";
        for (Module module : modules) {
            moduleNames += module.getName()+",";
        }
        return moduleNames;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Enrollment that)) return false;
        return Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(student);
    }

    
    @Override
    public String toString() {
        if (!modules.isEmpty()){
            return "Enrollment{" +
                    "id=" + id +
                    ", student=" + student.getName() +
                    ", modules=["+ getModuleNames() +
                    "]}";
        }
        return "Not Enrolled in any modules";
    }
}
