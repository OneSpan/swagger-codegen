package com.silanis.esl.api.util.date;

/**
 * Created by mpoitras on 17/01/14.
 */
public class DateSerializationUtilTest {

//    This test will not compile under maven until the proper maven folder model is followed.
//    @Test
//    public void whenParsingTheUserStringAndEverythingIsGoodThenTheCalendarIsReturned(){
//        final Calendar utcCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
//        String validSerializedDate = DatatypeConverter.printDateTime(utcCalendar);
//        final Calendar actualCalendar = DateSerializationUtil.parseUserStringToCalendar(validSerializedDate);
//        assertThat(actualCalendar.getTime(),is(utcCalendar.getTime()));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void whenParsingTheUserStringAndTheStringIsGibberishThenAnIllegalArgumentExceptionIsThrown(){
//        DateSerializationUtil.parseUserStringToCalendar("@%%$&$Gibberish%6%*");
//    }
//
//    @Test
//    public void test_extractIso8061Date_mainScenario() {
//        String dateString = "2000-01-02T13:04:05";
//        try {
//            Date date = DateSerializationUtil.extractIso8061Calendar(dateString).getTime();
//            Calendar calendar = new GregorianCalendar();
//            calendar.setTime(date);
//            Assert.assertEquals(2000, calendar.get(Calendar.YEAR));
//            Assert.assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
//            Assert.assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
//            Assert.assertEquals(13, calendar.get(Calendar.HOUR_OF_DAY));
//            Assert.assertEquals(4, calendar.get(Calendar.MINUTE));
//            Assert.assertEquals(5, calendar.get(Calendar.SECOND));
//        } catch (ParseException e) {
//            Assert.fail("Failed to parse date: " + dateString);
//        }
//    }
}
