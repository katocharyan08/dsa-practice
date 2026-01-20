package com.oops.project;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(4567,"OOPS","Aryan katoch");
        System.out.println(b1.id +","+ b1.title + ","+b1.author);
        Book b2 = new Book(3445,"Java programming","john dae");
        System.out.println(b2.id +","+ b2.title + ","+b2.author);
        User u = new User();//dosent had parent class
        u.issueBook();//early binding or compile time polymorphism beacuse reference type and object type is same
        User u1 = new Student();//obect type Student but reference type User
        User u2 = new Teacher();//object type Teacher but reference type User
        u1.issueBook();//runtime polymorphism
        u2.issueBook();//runtime polymorphism
        Library lib = new Library();
        lib.issueBook(u1,b2);
    }
}
