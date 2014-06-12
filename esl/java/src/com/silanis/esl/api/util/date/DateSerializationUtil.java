package com.silanis.esl.api.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.DatatypeConverter;

/**
 * Created by mpoitras on 17/01/14.
 */
public class DateSerializationUtil {

    private final static String ISO_8061 = "yyyy-MM-dd'T'HH:mm:ss";

    public static String formatFrom( Date dateString){

        if ( null == dateString)
            return null;

        SimpleDateFormat sdf = new SimpleDateFormat(ISO_8061);
        sdf.setTimeZone( TimeZone.getTimeZone( "UTC"));

        //  we need to append the Z to indicate to UI this is a UTC value
        return sdf.format(dateString) + "Z";
    }

    static Calendar parseUserStringToCalendar(String userDate) {
        return DatatypeConverter.parseDateTime(userDate);
    }

    public static Date extractDateFrom(String dateString) {
        final Calendar calendar = extractCalendarFrom(dateString);
        if(calendar != null){
            return calendar.getTime();
        }
        return null;
    }

    public static Calendar extractCalendarFrom(String dateString) {
        if (dateString == null) {
            return null;
        }
        try {
            if(dateString.endsWith("Z")){
                return parseIso8061From(dateString);
            }
            else {
                return parseUserStringToCalendar(dateString);
            }
        }
        catch (ParseException e){
            throw new RuntimeException(e);
        }
    }

    static Calendar parseIso8061From(String dateString) throws ParseException {
        return extractIso8061Calendar(dateString);
    }

    static Calendar extractIso8061Calendar(String dateString) throws ParseException {
        final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

        SimpleDateFormat dateParser = new SimpleDateFormat(ISO_8061);
        dateParser.setLenient(true);
        dateParser.setTimeZone(utcTimeZone);
        final Date parsedDate = dateParser.parse(dateString);
        final Calendar parsedUTCCalendar = Calendar.getInstance(utcTimeZone);
        parsedUTCCalendar.setTimeInMillis(parsedDate.getTime());
        return parsedUTCCalendar;
    }
}
