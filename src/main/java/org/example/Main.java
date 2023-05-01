package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Мария";
        post.passport = "1567№56789890";
        post.patronymic = "Вашакидзе";
        post.phone = "+7(900)650-47-07";
        post.surname = "Вашакидзе";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = 04;
        post.birthday.year = 1987;
    }
}