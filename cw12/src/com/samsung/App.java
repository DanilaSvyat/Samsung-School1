package com.samsung;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static Logger logger;

    public static void main(String[] args) {

        logger = Logger.getLogger(App.class.getName());

        logger.log(Level.WARNING, "Старт приложения");

        //...

        logger.log(Level.WARNING, "Конец приложения");



    }
}
