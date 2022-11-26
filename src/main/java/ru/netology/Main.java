package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4445 № 435456";
        post.patronymic = "Петрович";
        post.phone = "+7(123)3456789";
        post.surname = "Васечкин";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = "Август";
        post.birthday.year = 1999;
        // заполните другие поля
    }
}