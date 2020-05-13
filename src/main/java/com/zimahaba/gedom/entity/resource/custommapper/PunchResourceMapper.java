package com.zimahaba.gedom.entity.resource.custommapper;

import com.zimahaba.gedom.entity.Punch;
import com.zimahaba.gedom.entity.resource.PunchResource;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.ConfigurableMapper;

import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class PunchResourceMapper extends CustomMapper<Punch, PunchResource> {

    @Override
    public void mapAtoB(Punch punch, PunchResource punchResource, MappingContext context) {

        punchResource.setDate(punch.getDate());

        String weekDay = "";
        String day = "";
        if (punch.getDate() != null) {
            weekDay = punch.getDate().getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
            day = punch.getDate().format(DateTimeFormatter.ofPattern("dd/MM"));
        }
        punchResource.setWeekDay(weekDay);
        punchResource.setDay(day);

        punchResource.setEntrance(punch.getEntrance().format(DateTimeFormatter.ofPattern("HH:mm")));
        punchResource.setBreakStart(punch.getBreakStart().format(DateTimeFormatter.ofPattern("HH:mm")));
        punchResource.setBreakEnd(punch.getBreakEnd().format(DateTimeFormatter.ofPattern("HH:mm")));
        punchResource.setExit(punch.getExit().format(DateTimeFormatter.ofPattern("HH:mm")));
        punchResource.setHoliday(punch.getHoliday());
    }
}
