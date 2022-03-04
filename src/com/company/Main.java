package com.company;

public class Main {

    public static void main(String[] args) {

        Table wood_table = new Table();
        wood_table.doMove();

        //Руализация интерфейса через анонимный класс
        Switchable switchable = new Switchable() {
            @Override
            public void switchOn() {

            }

            @Override
            public void switchOff() {

            }
        };

        switchable.switchOn();
        switchable.switchOff();

        Lamp lamp = new Lamp();
        lamp.switchOn();
        lamp.switchOff();

        //Чтобы развернуть лампочка и 5 пункт сверху (последний)
        Calc calc = (a, b) -> System.out.println(a + b);
    }
}
