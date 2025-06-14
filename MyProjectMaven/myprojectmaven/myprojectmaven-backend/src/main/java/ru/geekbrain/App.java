package ru.geekbrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;

/**
 * Домашнее задание:
 * Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и
 * написать код, использующий эти зависимости.
 *
 * Пример решения:
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 *
 * Рекомендации для преподавателей по оценке задания:
 * • Проверьте правильность структуры проекта
 * • Убедитесь в корректности указания зависимостей в файлах pom.xml или build.gradle
 * • Оцените правильность использования библиотек в коде
 * • Проверьте работоспособность кода
 */


@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public RouterFunction<?> routes(WelcomeHandler welcomeHandler, GreetingHandler greetingHandler) {
        return welcomeHandler.routes()
            .and(greetingHandler.routes());
    }
}

