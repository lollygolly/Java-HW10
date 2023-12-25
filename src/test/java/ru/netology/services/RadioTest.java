package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() { // 1. ТЕСТИРУЕМ НОМЕР СТАНЦИИ
        Radio rad = new Radio();
        rad.setStationNumber(5);

        int expected = 5;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberBelowZero() { // 2. ОЧЕНЬ МАЛЕНЬКОЕ ЗНАЧЕНИЕ
        Radio rad = new Radio();
        rad.setStationNumber(-5);

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveZero() { // 3. ОЧЕНЬ БОЛЬШОЕ ЗНАЧЕНИЕ
        Radio rad = new Radio();
        rad.setStationNumber(15);

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberBeforeFirstBorder() { // 4. ЗНАЧЕНИЕ ДО ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(-1);

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberOnFirstBorder() { // 5. ЗНАЧЕНИЕ НА ПЕРВОЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setStationNumber(0);

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberAfterFirstBorder() { // 6. ЗНАЧЕНИЕ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(1);

        int expected = 1;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationNumberWithinBorders() { // 10. ПЕРЕКЛЮЧЕНИЕ НА СЛЕДУЮЩУЮ СТАНЦИЮ В ГРАНИЦАХ
        Radio rad = new Radio();
        rad.setStationNumber(5);
        rad.next();

        int expected = 6;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnFirstBorder() { // 12. ПЕРЕКЛЮЧЕНИЕ НА СЛЕДУЮЩУЮ СТАНЦИЮ НА ПЕРВОЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setStationNumber(0);
        rad.next();

        int expected = 1;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterFirstBorder() { // 13. ПЕРЕКЛЮЧЕНИЕ НА СЛЕДУЮЩУЮ СТАНЦИЮ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(1);
        rad.next();

        int expected = 2;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationBeforeLastBorder() { // 13. ПЕРЕКЛЮЧЕНИЕ НА СЛЕДУЮЩУЮ СТАНЦИЮ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(8);
        rad.next();

        int expected = 9;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnLastBorder() { // 13. ПЕРЕКЛЮЧЕНИЕ НА СЛЕДУЮЩУЮ СТАНЦИЮ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(9);
        rad.next();

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumberWithinBorders() { // 17. ПЕРЕКЛЮЧЕНИЕ НА ПРЕДЫДУЩУЮ СТАНЦИЮ В ГРАНИЦАХ
        Radio rad = new Radio();
        rad.setStationNumber(5);
        rad.prev();

        int expected = 4;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNReturnLastStationNumberOnFirstBorder() { // 19. ПЕРЕКЛЮЧЕНИЕ НА ПРЕДЫДУЩУЮ СТАНЦИЮ НА ПЕРВОЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setStationNumber(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNPrevStationNumberAfterFirstBorder() { // 20. ПЕРЕКЛЮЧЕНИЕ НА ПРЕДЫДУЩУЮ СТАНЦИЮ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(1);
        rad.prev();

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumberBeforeLastBorder() { // 21. ПЕРЕКЛЮЧЕНИЕ НА ПРЕДЫДУЩУЮ СТАНЦИЮ ДО ПОСЛЕДНЕЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setStationNumber(9);
        rad.prev();

        int expected = 8;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetSoundVolume() { // 24. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА В ГРАНИЦАХ
        Radio rad = new Radio();
        rad.setSoundVolume(50);

        int expected = 50;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowZero() { // 25. ОЧЕНЬ МАЛЕНЬКОЕ ЗНАЧЕНИЕ ГРОМКОСТИ ЗВУКА
        Radio rad = new Radio();
        rad.setSoundVolume(-50);

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveAHundred() { // 26. ОЧЕНЬ БОЛЬШОЕ ЗНАЧЕНИЕ ГРОМКОСТИ ЗВУКА
        Radio rad = new Radio();
        rad.setSoundVolume(120);

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBeforeFirstBorder() { // 27. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА ДО ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(-1);

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeOnFirstBorder() { // 28. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА НА ПЕРВОЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setSoundVolume(0);

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeOnAfterBorder() { // 29. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(1);

        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeBeforeLastBorder() { // 30. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА ДО ПОСЛЕДНЕЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(99);

        int expected = 99;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeOnLastBorder() { // 31. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА НА ПОСЛЕДНЕЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setSoundVolume(100);

        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAfterLastBorder() { // 32. ИЗМЕНЯЕМ ГРОМКОСТЬ ЗВУКА ПОСЛЕ ПОСЛЕДНЕЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(101);

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeWithinBorders() { // 33. УВЕЛИЧИВАЕМ ГРОМКОСТЬ В ГРАНИЦАХ
        Radio rad = new Radio();
        rad.setSoundVolume(50);
        rad.increaseSoundVolumeByOne();

        int expected = 51;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeOnFirstBorder() { // 35. УВЕЛИЧИВАЕМ ГРОМКОСТЬ НА ПЕРВОЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.increaseSoundVolumeByOne();

        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeAfterFirstBorder() { // 36. УВЕЛИЧИВАЕМ ГРОМКОСТЬ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(1);
        rad.increaseSoundVolumeByOne();

        int expected = 2;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeBeforeLastBorder() { // 37. УВЕЛИЧИВАЕМ ГРОМКОСТЬ ДО ПОСЛЕДНЕЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(99);
        rad.increaseSoundVolumeByOne();

        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeOnLastBorder() { // 38. УВЕЛИЧИВАЕМ ГРОМКОСТЬ НА ПОСЛЕДНЕЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.increaseSoundVolumeByOne();

        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeWithinBorders() { // 40. УМЕНЬШАЕМ ГРОМКОСТЬ В ГРАНИЦАХ
        Radio rad = new Radio();
        rad.setSoundVolume(50);
        rad.decreaseSoundVolumeByOne();

        int expected = 49;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseSoundVolumeOnFirstBorder() { // 42. УМЕНЬШАЕМ ГРОМКОСТЬ НА ПЕРВОЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.decreaseSoundVolumeByOne();

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeAfterFirstBorder() { // 43. УМЕНЬШАЕМ ГРОМКОСТЬ ПОСЛЕ ПЕРВОЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(1);
        rad.decreaseSoundVolumeByOne();

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeBeforeLastBorder() { // 44. УМЕНЬШАЕМ ГРОМКОСТЬ ДО ПОСЛЕДНЕЙ ГРАНИЦЫ
        Radio rad = new Radio();
        rad.setSoundVolume(99);
        rad.decreaseSoundVolumeByOne();

        int expected = 98;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeOnLastBorder() { // 45. УМЕНЬШАЕМ ГРОМКОСТЬ НА ПОСЛЕДНЕЙ ГРАНИЦЕ
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.decreaseSoundVolumeByOne();

        int expected = 99;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGetAmountStationsWithoutParams() { // Вывод количества радиостанций по-умолчанию
        Radio rad = new Radio();
        Assertions.assertEquals(10, rad.getAmountStations());
    }

    @Test
    public void shouldGetAmountStationsWithParam() { //Вывод количества радиостанций при задании количества станций больше нормы
        Radio rad = new Radio(20);
        Assertions.assertEquals(20, rad.getAmountStations());
    }

    @Test
    public void shouldGetAmountStationsWithParamBeforeFirstBorder() { //Вывод количества радиостанций при задании параметра меньше 0
        Radio rad = new Radio(-1);
        Assertions.assertEquals(10, rad.getAmountStations());
    }

    @Test
    public void shouldGetAmountStationsWithParamOnFirstBorder() { //Вывод количества радиостанций при задании параметра на границе
        Radio rad = new Radio(0);
        Assertions.assertEquals(10, rad.getAmountStations());
    }

    @Test
    public void shouldGetAmountStationsWithParamAfterFirstBorder() { //Вывод количества радиостанций при задании параметра больше 0
        Radio rad = new Radio(1);
        Assertions.assertEquals(1, rad.getAmountStations());
    }

    @Test
    public void shouldGetAmountStationsWithParamIfAmountIsBig() { //Вывод количества радиостанций при задании большого количества станций
        Radio rad = new Radio(1_000_000);
        Assertions.assertEquals(1_000_000, rad.getAmountStations());
    }

    @Test
    public void shouldSetAmountStationsBeforeBorder() {
        Radio rad = new Radio();
        rad.setAmountStations(0);
        int expected = 10;
        int actual = rad.getAmountStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountStationsOnBorder() {
        Radio rad = new Radio();
        rad.setAmountStations(1);
        int expected = 1;
        int actual = rad.getAmountStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountStationsABig() {
        Radio rad = new Radio();
        rad.setAmountStations(2_000_000);
        int expected = 2_000_000;
        int actual = rad.getAmountStations();
        Assertions.assertEquals(expected, actual);
    }
}



