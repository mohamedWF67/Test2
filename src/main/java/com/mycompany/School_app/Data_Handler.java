package com.mycompany.School_app;

import com.mycompany.School_app.AuthSystem.AuthManager;
import com.mycompany.School_app.FileSystem.File_system;
import com.mycompany.School_app.LibrarySystem.Book;
import com.mycompany.School_app.LibrarySystem.Librarian;
import com.mycompany.School_app.User.Student;
import com.mycompany.School_app.User.Teacher;
import com.mycompany.School_app.User.User;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.prefs.Preferences;

//A class made to add data to the collections
public class Data_Handler {

    private static Preferences prefs1 = Preferences.userRoot().node("ObjectDatabase");

    private static School school;
    private static AuthManager authManager;

    public Data_Handler(String name) {
        this.school = new School(name);
        StartAuthManager();
    }

    public static School getSchool() {
        return school;
    }

    public static AuthManager getAuthManager() {
        return authManager;
    }

    public static void StartAuthManager() {
        if (authManager == null) {
            Data_Handler.authManager = new AuthManager(Data_Handler.school,Data_Handler.school.getLibrary());
        }else{
            AuthManager.Start();
        }
    }

    public static void Init_School() {
        /*Random random = new Random();

        //Names for Modules
        String[] module_names = {
                "Introduction to Programming", "Data Structures & Algorithms", "Object-Oriented Programming",
                "Database Systems", "Web Development", "Software Engineering", "Artificial Intelligence",
                "Cybersecurity", "Mobile App Development", "Computer Networks", "Cloud Computing",
                "Operating Systems", "Machine Learning", "Human-Computer Interaction", "Game Development",
                "Blockchain Technology", "Embedded Systems", "Digital Signal Processing", "Big Data Analytics",
                "DevOps and Automation"
        };
        //Adds modules to School
        for (int i = 0; i < 20; i++) {
            school.addModule(new Module(module_names[i], String.valueOf((char) ('A' + i % 4)), random.nextInt(5,30)));
        }
        //Adds Students to School
        school.addUser(new Student("Waleed", "mdxx421@Gmail.com", "1234", "Farouk", new Date(), "M", "01024983385", "5 madina monwara", "A"));
        school.addUser(new Student("Ali", "ali123@example.com", "pass123", "Omar", new Date(), "M", "01012345678", "10 Nile Street", "A"));
        school.addUser(new Student("Sara", "sara99@example.com", "securepass", "Hana", new Date(), "F", "01098765432", "25 Green Road", "B"));
        school.addUser(new Student("Youssef", "youssef77@example.com", "mypassword", "Ahmed", new Date(), "M", "01111223344", "7 Cairo Avenue", "C"));
        school.addUser(new Student("Lina", "lina88@example.com", "linapass", "Mariam", new Date(), "F", "01234567890", "12 Alex Street", "D"));

        //Adds Teachers to School
        school.addUser(new Teacher("Ahmed", "ahmed.teach@example.com", "pass123", "PhD in Mathematics", 25000, "01012345678", "15 School Street"));
        school.addUser(new Teacher("Fatma", "fatma.science@example.com", "securepass", "MSc in Physics", 23000, "01098765432", "22 University Road"));
        school.addUser(new Teacher("Kareem", "kareem.history@example.com", "histpass", "MA in History", 20000, "01111223344", "8 Cairo Avenue"));
        school.addUser(new Teacher("Laila", "laila.english@example.com", "langpass", "BA in English", 18000, "01234567890", "30 Literature Lane"));
        school.addUser(new Teacher("Mostafa", "mostafa.cs@example.com", "cssecure", "MSc in Computer Science", 27000, "01055544433", "5 Tech Park"));

        //Adds Admins
        school.addUser(new Admin("Sarah", "sarah.admin@example.com", "adminpass1"));
        school.addUser(new Admin("Omar", "omar.admin@example.com", "secureadmin2"));
        school.addUser(new Admin("Layla", "layla.admin@example.com", "password123"));

        //Adds Librarians
        Librarian librarian1 = new Librarian("Amina El-Sayed", "amina@example.com", "lib123", "5 years");
        Librarian librarian2 = new Librarian("Tarek Mahfouz", "tarek@example.com", "pass456", "8 years");
        Librarian librarian3 = new Librarian("Noura Hassan", "noura@example.com", "secure789", "2 years");
        school.getLibrary().addLibrarian(librarian1);
        school.getLibrary().addLibrarian(librarian2);
        school.getLibrary().addLibrarian(librarian3);*/
    }

    public static void saveAllData(){
        saveUsers();
        saveLibrarians();
        saveModules();
        saveEnrollments();
        saveGrades();
        saveBooks();
        //saveStaticIDs();
        System.out.println("💾 All data saved");
    }

    public static void saveUsers(){
        File_system.saveObjectToFile("SchoolUsers.txt",school.getUsers());
        prefs1.putInt("UsersID", User.getCounter());
    }

    public static void saveLibrarians(){
        File_system.saveObjectToFile("Librarians.txt",school.getLibrary().getLibrarians());
    }

    public static void saveModules(){
        File_system.saveObjectToFile("Modules.txt",school.getModules());
        prefs1.putInt("ModulesID", Module.getCount());
    }

    public static void saveEnrollments(){
        File_system.saveObjectToFile("Enrollments.txt",school.getEnrollments());
        prefs1.putInt("EnrollmentsID", Enrollment.getCount());
    }

    public static void saveGrades(){
        File_system.saveObjectToFile("Grades.txt",school.getGrades());
    }

    public static void saveBooks(){
        File_system.saveObjectToFile("Books.txt",school.getLibrary().getBooks());
    }

    public static void loadAllData(){
        loadUsers();
        loadLibrarians();
        loadModules();
        loadEnrollments();
        loadGrades();
        loadBooks();
        //loadStaticIDs();
        System.out.println("💾 Data Loaded");
    }

    public static void loadUsers(){
        ArrayList<User> users = (ArrayList<User>) File_system.readObjectFromFile("SchoolUsers.txt");
        school.setUsers(users);
        User.setCounter(prefs1.getInt("UsersID", User.getCounter()));
        System.out.println(User.getCounter());
    }

    public static void loadLibrarians(){
        ArrayList<Librarian> librarians = (ArrayList<Librarian>) File_system.readObjectFromFile("Librarians.txt");
        school.getLibrary().setLibrarians(librarians);
    }

    public static void loadModules(){
        ArrayList<Module> modules = (ArrayList<Module>) File_system.readObjectFromFile("Modules.txt");
        school.setModules(modules);
        Module.setCount(prefs1.getInt("ModulesID", Module.getCount()));
        System.out.println(Module.getCount());
    }

    public static void loadEnrollments(){
        ArrayList<Enrollment> enrollments = (ArrayList<Enrollment>) File_system.readObjectFromFile("Enrollments.txt");
        school.setEnrollments(enrollments);
        Enrollment.setCount(prefs1.getInt("EnrollmentsID", Enrollment.getCount()));
        System.out.println(Enrollment.getCount());
    }

    public static void loadGrades(){
        ArrayList<Grade> grades = (ArrayList<Grade>) File_system.readObjectFromFile("Grades.txt");
        if (grades != null) {
            school.setGrades(grades);
        }
    }

    public static void loadBooks(){
        ArrayList<Book> books = (ArrayList<Book>) File_system.readObjectFromFile("Books.txt");
        school.getLibrary().setBooks(books);
    }

    private static int getMaxUserID(){
        int maxUsers = 0;
        for (User user : school.getUsers()) {
            maxUsers = Math.max(maxUsers, user.getId());
        }
        int maxlibrarians = 0;
        for (User user : school.getLibrary().getLibrarians()) {
            maxlibrarians = Math.max(maxlibrarians, user.getId());
        }
        System.out.println(maxUsers);
        return Math.max(maxUsers, maxlibrarians);
    }

    private static int getMaxModuleID(){
        int maxModules = 0;
        for (Module module : school.getModules()) {
            maxModules = Math.max(maxModules, module.getId());
        }
        System.out.println(maxModules);
        return maxModules;
    }

    private static int getMaxEnrollmentID(){
        int maxEnrollments = 0;
        for (Enrollment enrollment : school.getEnrollments()) {
            maxEnrollments = Math.max(maxEnrollments, enrollment.getId());
        }
        System.out.println(maxEnrollments);
        return maxEnrollments;
    }

    public static void fixnumbers(){
        User.setCounter(getMaxUserID());
        Module.setCount(getMaxModuleID());
        Enrollment.setCount(getMaxEnrollmentID());
        System.out.println(User.getCounter());
        System.out.println(Module.getCount());
        System.out.println(Enrollment.getCount());
    }
}
