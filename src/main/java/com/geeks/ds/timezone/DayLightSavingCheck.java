package com.geeks.ds.timezone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DayLightSavingCheck {

    public static void main(String[] args) throws ParseException {
        List<Date> holidayList = new ArrayList<>();
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        holidayList.add(sdf.parse("2021-11-05T00:01:21-0700"));
        calculateBusinessDays("2021-11-04T00:00:00-0400",7,holidayList);
    }


    public static void calculateBusinessDays(String orderDate,int numBusinessDays,List<Date> holidayList){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        LocalDateTime localDateTime = LocalDateTime.parse(orderDate, formatter);
        for(int i=0; i<numBusinessDays; i++){
            localDateTime= localDateTime.plusDays(1);
            if(Boolean.TRUE.equals(localDateTime.query(temporal -> temporal.get(ChronoField.DAY_OF_WEEK) > 5))){
                numBusinessDays++;
            }else{
                numBusinessDays = checkForHolidays(holidayList, numBusinessDays, localDateTime);
            }
        }
        ZoneId of = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = localDateTime.atZone(of);
        String dateTime = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ"));
        System.out.println(dateTime);
    }


    private static int checkForHolidays(List<Date> holidays, int businessDays, LocalDateTime cal) {
        int numOfBusinessDays = businessDays;
        for (Date holiday : holidays) {
            final Calendar holidayDate = Calendar.getInstance();
            holidayDate.setTime(holiday);
            if (isSameDay(cal, holidayDate)) {
                numOfBusinessDays++;
                break;
            }
        }
        return numOfBusinessDays;
    }

    private static boolean isSameDay(LocalDateTime localDateTime, final Calendar holidayDate) {
        return localDateTime.getDayOfWeek().getValue()+1 == holidayDate.get(Calendar.DAY_OF_WEEK)
                && localDateTime.getMonth().getValue()-1 == holidayDate.get(Calendar.MONTH)
                && localDateTime.getYear() == holidayDate.get(Calendar.YEAR)
                && localDateTime.getDayOfMonth() == holidayDate.get(Calendar.DAY_OF_MONTH);
    }
}
