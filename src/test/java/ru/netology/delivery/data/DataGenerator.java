package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));
    private DataGenerator() {
    }

        public static String createDate(int plusDays){
            LocalDate newDate = LocalDate.now().plusDays(plusDays);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String date = formatter.format(newDate);
            return date;
        }

        public static String getCity() {
            String[] myCityList = new String[]{"Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Владикавказ", "Горно-Алтайск", "Йошкар-Ола", "Казань", "Калининград", "Калуга", "Краснодар", "Магас", "Махачкала", "Нарьян-Мар", "Салехард", "Самара", "Саранск", "Саратов", "Хабаровск", "Ханты-Мансийск", "Южно-Сахалинск", "Великий Новгород", "Владивосток", "Владимир", "Вологда", "Рязань", "Биробиджан", "Чебоксары", "Москва", "Санкт-Петербург", "Ульяновск", "Симферополь", "Ростов-на-Дону"};
            int city = (int) Math.floor(Math.random() * myCityList.length);
            return myCityList[city];
        }

        public static String getName () {
            faker = new Faker(new Locale("ru"));
            return (faker.name().lastName() + (" ") + faker.name().firstName());
        }


        public static  String getPhone() {
            faker = new Faker(new Locale("ru"));
            return faker.phoneNumber().phoneNumber();
        }

        public static class Registration {
            private Registration() {
            }

           // public static UserInfo generateUser(String locale) {
                // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
                // generateName(locale), generatePhone(locale)
           //     return user;
           // }
        }

        @Value
        public static class UserInfo {
            String city;
            String name;
            String phone;
        }
    }
