/*Домашнее задание*/


/*Задание 1 Создайте класс Human, который будет содержать информацию о человеке.
С помощью механизма наследования, реализуйте класс Builder (содержит информацию о строителе),
класс Sailor (содержит информацию о моряке), класс Pilot (содержит информацию о летчике).
Каждый из классов должен содержать необходимые для работы методы.*/

/*package com.company;
class Human
{
    static void display1()
    {
        System.out.println("1");
    }
}
class Builder extends Human
{
    static void display2()
    {
        System.out.println("2");
    }
}
class Pilot extends Human
{
    static void display3()
    {
        System.out.println("3");
    }
}
class Sailor extends Human
{
    static void display4()
    {
        System.out.println("4");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Human.display1();
        Builder.display2();
        Pilot.display3();
        Sailor.display4();
    }
}*/


/*Задание 2 Создать базовый класс «Животное» и производные классы «Тигр», «Крокодил», «Кенгуру».
С помощью конструктора установить имя каждого животного и его характеристики.
Создайте для каждого класса необходимые методы и поля.*/

/*package com.company;
class Animals
{
    static void AnimalsDisplay(String Name, String Latin)
    {
        System.out.println(Name + " (лат.: " + Latin + ")");
    }
}
class Tiger extends Animals
{
    static void TigerDisplay()
    {
        Animals.AnimalsDisplay("Тигр", "Panthera tigris");
    }
}
class Crocodile extends Animals
{
    static void CrocodileDisplay()
    {
        Animals.AnimalsDisplay("Крокодил", "Crocodilia");
    }
}
class Kangaroo extends Animals
{
    static void KangarooDisplay()
    {
        Animals.AnimalsDisplay("Крокодил", "Macropus");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Animals.AnimalsDisplay("Name","Latin");
        Tiger.TigerDisplay();
        Crocodile.CrocodileDisplay();
        Kangaroo.KangarooDisplay();
    }
}*/