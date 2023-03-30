package com.company;

import java.util.Scanner;

// Интерфейс "Товар"
interface Product {
    void setName(String name);
    String getName();
    void setPrice(double price);
    double getPrice();
    void setRating(int rating);
    int getRating();
}

// Класс, реализующий интерфейс "Товар"
class Purchase implements Product {
    private String name;
    private double price;
    private int rating;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }
}

// Интерфейс "Пользователь"
interface Laba11 {
    void setLogin(String login);
    String getLogin();
    void setPassword(String password);
    String getPassword();
}

// Класс, реализующий интерфейс "Пользователь"
class Customer implements Laba11 {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

// Класс, реализующий интерфейс "Пользователь"
class Seller implements Laba11 {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}


class Buy implements Product, Laba11 {
    private Product product;
    private Laba11 user;

    // Конструктор класса
    public Buy(Product product, Laba11 user) {
        this.product = product;
        this.user = user;
    }

    // Метод, выводящий сообщение о покупке товара пользователем
    public void buy() {
        System.out.println(user.getLogin() + " купил товар " + product.getName());
    }

    // Реализация методов интерфейса "Товар"
    @Override
    public void setName(String name) {
        product.setName(name);
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public void setPrice(double price) {
        product.setPrice(price);
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }

    @Override
    public void setRating(int rating) {
        product.setRating(rating);
    }

    @Override
    public int getRating() {
        return product.getRating();
    }

    public static void main(String[] args) {
        // Создание экземпляров классов
        Purchase book = new Purchase();
        Customer customer = new Customer();

        // Установка значений полей объектов
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String productName = scanner.nextLine();
        book.setName(productName);

        System.out.print("Введите цену товара: ");
        double price = scanner.nextDouble();
        book.setPrice(price);

        System.out.print("Введите рейтинг товара: ");
        int rating = scanner.nextInt();
        book.setRating(rating);

        scanner.nextLine(); // очистка буфера ввода

        System.out.print("Введите логин покупателя: ");
        String login = scanner.nextLine();
        customer.setLogin(login);

        System.out.print("Введите пароль покупателя: ");
        String password = scanner.nextLine();
        customer.setPassword(password);

        // Создание объекта класса "Buy"
        Buy buy = new Buy(book, customer);

        // Вызов метода покупки
        buy.buy();
    }

    @Override
    public String getLogin() {
        return user.getLogin();
    }

    @Override
    public void setLogin(String login) {
        user.setLogin(login);
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public void setPassword(String password) {
        user.setPassword(password);
    }
}
