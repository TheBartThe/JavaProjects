package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void testAlarmOff() {
        Alarm alarm = new Alarm();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void testAlarmOn() {
        Alarm alarm = new Alarm();
        alarm.alarmOn = true;
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void testBottomOfThreshold() {
        StubSensor sensor = new StubSensor(17);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void testTopOfThreshold() {
        StubSensor sensor = new StubSensor(21);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void testBelowThreshold() {
        StubSensor sensor = new StubSensor(16.9);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void testAboveThreshold() {
        StubSensor sensor = new StubSensor(21.1);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}
