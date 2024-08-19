package com.ejemplo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AppTest1.class,
    AppTest2.class
})
public class AppTest {
    // La clase puede estar vacía, todas las configuraciones se hacen con anotaciones
}