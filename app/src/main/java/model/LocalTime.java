package model;

public class LocalTime {
    private int hour;
    private int minute;
    private int nano;
    private int second;

    // Construtor vazio
    public LocalTime() {
    }

    // Construtor com parâmetros
    public LocalTime(int hour, int minute, int nano, int second) {
        this.hour = hour;
        this.minute = minute;
        this.nano = nano;
        this.second = second;
    }

    // Getters e Setters

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getNano() {
        return nano;
    }

    public void setNano(int nano) {
        this.nano = nano;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Outros métodos, se necessário
}

