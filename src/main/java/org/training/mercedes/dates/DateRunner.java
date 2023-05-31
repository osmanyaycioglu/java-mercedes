package org.training.mercedes.dates;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRunner {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("CurrentMilis : " + System.currentTimeMillis());
        long time = date.getTime();

        Date date2 = new Date(1585524161257L);
        System.out.println(date2);
        Date date3 = new Date(119,
                              11,
                              5);
        System.out.println(date3);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2019,
                                                                    11,
                                                                    9);
        gregorianCalendar.add(Calendar.DAY_OF_MONTH,
                              5);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusDays(5);
        LocalDate localDate2 = localDate1.minusMonths(1);
        LocalDate localDate3 = localDate2.plusDays(3)
                                         .plusYears(2)
                                         .plusWeeks(2)
                                         .plusDays(5);

        LocalDateTime localDateTime = LocalDateTime.of(2020,
                                                       10,
                                                       11,
                                                       10,
                                                       20,
                                                       13);
        long l = localDateTime.atZone(ZoneId.systemDefault())
                              .toInstant()
                              .toEpochMilli();

        LocalDateTime localDateTime1 = localDateTime.plusDays(3);

        boolean after = localDateTime.isAfter(localDateTime1);
        boolean equals = localDateTime1.equals(localDateTime);
        if (localDate == localDate1){
            System.out.println("Eşit");
        }
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        Period period = Period.between(localDate1,
                                       localDate);
        System.out.println("Aradaki gün sayısı : " + period.getDays());
        Duration duration = Duration.between(localDateTime1,
                                             localDateTime);
        System.out.println("Aradaki mili : " + (duration.getNano() / 1_000_000));
        System.out.println("Aradaki second : " + (duration.getSeconds()));
        Instant instant = Instant.now();
        Instant instant2 = Instant.ofEpochMilli(12983791237L);
        LocalDateTime localDateTime2 = instant2.atZone(ZoneId.systemDefault())
                                               .toLocalDateTime();

    }
}
