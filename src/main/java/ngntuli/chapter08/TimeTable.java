package main.java.ngntuli.chapter08;

import java.util.Optional;

public class TimeTable {
    private final Booking[][] times;

    public TimeTable(int days, int periods) {
        if (days != 5 || periods != 7) {
            throw new TimeTableException("Error: failed to create bookings list size days[" +
                    days + "] and periods[" + periods + "]");
        } else {
            times = new Booking[days][periods];
        }
    }

    public void makeBooking(int day, int period, Booking booking) {
        if (times[day - 1][period - 1] == null) {
            times[day - 1][period - 1] = booking;
            System.out.println("Successful booked");
        } else {
            throw new TimeTableException("Failed slot is booked");
        }
    }

    public void cancelBooking(int day, int period) {
        if (times[day - 1][period - 1] != null) {
            times[day - 1][period - 1] = null;
            System.out.println("Successful, booking is canceled");
        } else {
            throw new TimeTableException("Failed slot is empty");
        }
    }

    public boolean isFree(int day, int period) {
        return times[day - 1][period - 1] == null;
    }

    public Optional<Booking> getBooking(int day, int period) {
        if (times[day - 1][period - 1] != null) {
            return Optional.of(times[day - 1][period - 1]);
        } else {
            return null;
        }
    }

    public int numberOfDays() {
        return times.length;

    }

    public int numberOfPeriods() {
        return times[0].length;
    }
}
