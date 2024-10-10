package innerClasses;

public class Demo_3 {
    public static void main(String[] args) {
        MyEnumContainer.BookingStatus s = MyEnumContainer.BookingStatus.Success;
        MyEnumContainer.Instance uat = MyEnumContainer.Instance.UAT;
        int x = 10;
        Demo_4 y = new Demo_4();

    }
}

class MyEnumContainer {
    enum BookingStatus {
        Success, Failure, PendingConfirmation
    }

    enum Instance {
        UAT, Production, Local
    }
}

class Demo_4 {
    int y = 20;
}

