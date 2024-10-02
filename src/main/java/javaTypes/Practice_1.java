package javaTypes;

public class Practice_1 {
    public static void main(String[] args) {
        System.out.println(BookingStatus.PendingConfirmation);
        System.out.println(BookingStatus.PendingConfirmation.getStatusId());

        System.out.println(Day.Monday);
        System.out.println(Day.Monday.getDayId());

        System.out.println(getDayType(Day.Friday));

    }

    static String getDayType(Day day) {
        if (day.getDayId() == 0 || day.getDayId() == 6)
            return "weekend";
        else
            return "weekday";
    }
}

enum BookingStatus {
    Held(0), Confirmed(1), PendingConfirmation(2), Failed(3);

    int statusId;
    BookingStatus(int statusId) {
        this.statusId = statusId;
    }

    int getStatusId() {
        return statusId;
    }
}

enum Day {
    Sunday(0), Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6);

    int dayId;
    Day(int dayId) {
        this.dayId = dayId;
    }

    int getDayId() {
        return dayId;
    }
}

enum PaymentGateway {
    Stripe, Fatzebra, Braintree, Uplift
}

enum Instance {
    Local, UAT, Production
}
