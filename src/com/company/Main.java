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
        Animals.AnimalsDisplay("TestName","TestLatin");
        Tiger.TigerDisplay();
        Crocodile.CrocodileDisplay();
        Kangaroo.KangarooDisplay();
    }
}*/


/*Задание 3 Запрограммируйте класс Money (объект класса оперирует одной валютой) для работы с деньгами.
В классе должны быть предусмотрены поле для хранения целой части денег (доллары, евро, гривны и т.д.) и
поле для хранения копеек (центы, евроценты, копейки и т.д.). Реализовать методы для вывода суммы на экран,
задания значений для частей. На базе класса Money создать класс Product для работы с продуктом или товаром.
Реализовать метод, позволяющий уменьшить цену на заданное число. Для каждого из классов реализовать необходимые методы и поля.*/

/*package com.company;
import java.util.Scanner;
class Money
{
    static void MoneyDisplay(int Banknote, double Coins)
    {
        Scanner in1 = new Scanner(System.in);
        System.out.print("1. Введите число: ");
        Banknote = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("2. Введите число: ");
        Coins = in2.nextDouble();
        System.out.println("Деньги: " + Banknote);
        System.out.println("Монеты: " + Coins);
    }
}
class Product extends Money
{
    static void ProductDisplay()
    {
        int a = 0; double b = 0;
        Money.MoneyDisplay(a, b);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Product.ProductDisplay();
    }
}*/


/*Задание 4 Создать базовый класс «Устройство» и производные классы «Чайник», «Микроволновка», «Автомобиль», «Пароход».
С помощью конструктора установить имя каждого устройства и его характеристики. Реализуйте для каждого из классов методы:
1) Sound — издает звук устройства (пишем текстом в консоль);
2) Show — отображает название устройства;
3) Desc — отображает описание устройства.*/

package com.company;
import java.util.Scanner;
class Device
{
    static void Sound(String sound)
    {
        System.out.println(sound);
    }
    static void Show(String show)
    {
        System.out.println(show);
    }
    static void Desc(String desc)
    {
        System.out.println(desc);
    }
}
class Kettle extends Device
{
    static void KettleDisplay()
    {
        Device.Sound("[Звук чайника]");
        Device.Show("[Название чайника]");
        Device.Desc("[Описание чайника]");
    }
}
class Microwave extends Device
{
    static void MicrowaveDisplay()
    {
        Device.Sound("[Звук микроволновки]");
        Device.Show("[Название микроволновки]");
        Device.Desc("[Описание микроволновки]");
    }
}
class Car extends Device
{
    static void CarDisplay()
    {
        Device.Sound("[Звук автомобиля]");
        Device.Show("[Название автомобиля]");
        Device.Desc("[Описание автомобиля]");
    }
}
class Steamer extends Device
{
    static void SteamerDisplay()
    {
        Device.Sound("[Звук парохода]");
        Device.Show("[Название парохода]");
        Device.Desc("[Описание парохода]");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Kettle.KettleDisplay();
        Microwave.MicrowaveDisplay();
        Car.CarDisplay();
        Steamer.SteamerDisplay();
    }
}