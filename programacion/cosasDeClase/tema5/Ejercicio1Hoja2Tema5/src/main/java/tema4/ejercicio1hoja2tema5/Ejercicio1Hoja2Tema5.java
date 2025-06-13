/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio1hoja2tema5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Ejercicio1Hoja2Tema5 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalDate localDateOf = LocalDate.of(2022, 10, 10);
        System.out.println(localDateOf.toString()); // 2022-10-10

        LocalDate datePlus = localDateOf.plusDays(7);
        System.out.println(datePlus.toString());  // 2022-10-17
        LocalDate dateMinus = localDateOf.minusDays(7);
        System.out.println(dateMinus.toString()); // 2022-10-03

        boolean isBefore = LocalDate.of(2022, 10, 10).isBefore(LocalDate.of(2022, 8, 20));
        System.out.println(isBefore); // false
        boolean isAfter = LocalDate.of(2022, 10, 10).isAfter(LocalDate.of(2022, 8, 20));
        System.out.println(isAfter); // true

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime hour = LocalTime.of(6, 30);
        System.out.println(hour); // 06:30

        LocalTime localTimePlus = hour.plus(1, ChronoUnit.HOURS);
        System.out.println(localTimePlus); // 07:30
        LocalTime localTimeMinus = hour.minus(60, ChronoUnit.SECONDS);
        System.out.println(localTimeMinus); // 06:29

        boolean isBeforeHour = LocalTime.parse("08:30").isBefore(LocalTime.parse("10:20"));
        System.out.println(isBeforeHour); // true

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTimeOf = LocalDateTime.of(2022, Month.AUGUST, 20, 8, 30);
        System.out.println(localDateTimeOf); // 2022-08-20T08:30

        LocalDateTime localDateTimePlus = localDateTimeOf.plusDays(5);
        System.out.println(localDateTimePlus); // 2022-08-25T08:30
        LocalDateTime localDateTimeMinus = localDateTimePlus.minusMinutes(10);
        System.out.println(localDateTimeMinus); // 2022-08-25T08:20

        LocalDate fechaInicio = LocalDate.of(2022, 10, 10);
        LocalDate fechaFin = fechaInicio.plus(Period.ofDays(500));
        int diffDays = Period.between(fechaInicio, fechaFin).getDays();
        int diffMonths = Period.between(fechaInicio, fechaFin).getMonths();
        int diffYears = Period.between(fechaInicio, fechaFin).getYears();
        System.out.println("Años: " + diffYears + " Meses: " + diffMonths + " Dias: " + diffDays);
        long aux = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        System.out.println("Dias entre dos fechas: " + aux);

        LocalTime startLocalTime = LocalTime.of(8, 30);
        LocalTime endLocalTime = startLocalTime.plus(Duration.ofHours(3));  // 11:30

        long diffSeconds = Duration.between(startLocalTime, endLocalTime).getSeconds();
        System.out.println(diffSeconds); // 10800 seconds

        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");
        System.out.println(hora.format(f));

        LocalDateTime fechaConHora = LocalDateTime.now();
        DateTimeFormatter esDateFormatLargo = DateTimeFormatter
                .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
                .withLocale(new Locale("es", "ES"));
        System.out.println("Formato español (largo, localizado): " + fechaConHora.format(esDateFormatLargo));

        LocalDateTime fechaConHora = LocalDateTime.now();
        String idiomaLocal = System.getProperty("user.language");
        String paisLocal = System.getProperty("user.country");
        System.out.println("Formato actual del sistema (" + idiomaLocal + "-" + paisLocal + "): "
                + fechaConHora.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                        .withLocale(new Locale(idiomaLocal, paisLocal)));
    }
}
