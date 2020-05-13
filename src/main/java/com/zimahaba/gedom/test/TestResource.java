package com.zimahaba.gedom.test;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TestResource {
    private LocalTime horaData;
    private String horaString;
    private Map<String, String> mapa = new HashMap<>();

    public LocalTime getHoraData() {
        return horaData;
    }

    public void setHoraData(LocalTime horaData) {
        this.horaData = horaData;
    }

    public String getHoraString() {
        return horaString;
    }
    public void setHoraString(String horaString) {
        this.horaString = horaString;
    }

    public Map<String, String> getMapa() {
        return mapa;
    }

    public void setMapa(Map<String, String> mapa) {
        this.mapa = mapa;
    }
}
