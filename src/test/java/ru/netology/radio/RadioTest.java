package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {


    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/StationSelection.csv")
    public void testStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/ButtonNext.csv")
    public void testButtonNextStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        radio.nextStation();

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/ButtonPrev.csv")
    public void testButtonPrevStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        radio.prevStation();

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/VolumeControlReduce.csv")
    public void testVolumeControlReduce(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        radio.reduceVolume();

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/VolumeControlIncrease.csv")
    public void testVolumeControlIncrease(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        radio.increaseVolume();

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/VolumeControl.csv")
    public void testVolumeControl(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }
}

/*    @Test
    public void testReduceVolume() {
        Radio radio = new Radio();
        radio.setVolumeControl(4);

        radio.reduceVolume();

        int expected = 3;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }
}

      @Test
    public void testVolumeControl () {
        Radio radio = new Radio();

        radio.setVolumeControl(4);

        int expected = 4;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSuperMaxVolumeControl () {
        Radio radio = new Radio();

        radio.setVolumeControl(11);

        int expected = 0;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeMeaningVolumeControl () {
        Radio radio = new Radio();

        radio.setVolumeControl(-1);

        int expected = 0;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroVolumeControl () {
        Radio radio = new Radio();

        radio.setVolumeControl(0);

        int expected = 0;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxVolumeControl () {
        Radio radio = new Radio();

        radio.setVolumeControl(10);

        int expected = 10;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinVolumeControl () {
        Radio radio = new Radio();

        radio.setVolumeControl(1);

        int expected = 1;
        int actual = radio.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }
}

    @Test
    public void testStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(7);

        int expected = 7;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(0);

        int expected = 0;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeMeaningStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(-3);

        int expected = 0;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSuperMaxStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(14);

        int expected = 0;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(1);

        int expected = 1;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(9);

        int expected = 9;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationSelection () {
        Radio radio = new Radio();
        radio.setStationSelection(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    } */
