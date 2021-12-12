package com.geeks.ds.timezone;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneIdentify {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2021,3,6);

        //localDate= localDate.minusDays(10);

        System.out.println(localDate);


        TimeZone tz = TimeZone.getDefault();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        Date date =Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        System.out.println(tz.inDaylightTime(date));



        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(new Date());
        calendar.set(2021, Calendar.NOVEMBER, 7);
        float calculateTimeZone = calculateTimeZone(calendar);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'T'Z");

//Here you say to java the initial timezone. This is the secret
        sdf.setTimeZone(TimeZone.getDefault());
//Will print in UTC
        System.out.println(sdf.format(calendar.getTime()));

//Here you set to your timezone
        sdf.setTimeZone(TimeZone.getDefault());
//Will print on your default Timezone
        System.out.println(sdf.format(calendar.getTime()));




    }


    public static float calculateTimeZone( Calendar calendar) {
        float ONE_HOUR_MILLIS = 60 * 60 * 1000;

        // Current timezone and date
        TimeZone timeZone = calendar.getTimeZone();
        Date nowDate = new Date();
        float offsetFromUtc = timeZone.getOffset(nowDate.getTime()) / ONE_HOUR_MILLIS;

        // Daylight Saving time
        if (timeZone.useDaylightTime()) {
            // DST is used
            // I'm saving this is preferences for later use

            // save the offset value to use it later
            float dstOffset = timeZone.getDSTSavings() / ONE_HOUR_MILLIS;
            // DstOffsetValue = dstOffset
            // I'm saving this is preferences for later use
            // save that now we are in DST mode
            if (timeZone.inDaylightTime(nowDate)) {
               // Log.e(Utility.class.getName(), "in Daylight Time");
                return -(ONE_HOUR_MILLIS * dstOffset);
            } else {
                //Log.e(Utility.class.getName(), "not in Daylight Time");
                return 0;
            }
        } else
            return 0;
    }

}
