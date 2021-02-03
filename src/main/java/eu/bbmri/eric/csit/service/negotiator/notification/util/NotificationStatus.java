package eu.bbmri.eric.csit.service.negotiator.notification.util;

public abstract class NotificationStatus {

    private NotificationStatus() {}

    public static final int CREATED = 1;
    public static final int AGGREGATED = 2;
    public static final int ERROR = 3;
    public static final int PENDING = 4;
    public static final int TEST = 5;
    public static final int SUCCESS = 6;

    public static String getNotificationType(Integer notificationStatus) {
        switch (notificationStatus) {
            case NotificationStatus.CREATED:
                return "created";
            case NotificationStatus.AGGREGATED:
                return "aggregated";
            case NotificationStatus.ERROR:
                return "error";
            case NotificationStatus.PENDING:
                return "pending";
            case NotificationStatus.TEST:
                return "test";
            case NotificationStatus.SUCCESS:
                return "success";
            default:
                return "ERROR-NG-0000010: ERROR: Type Not defined";
        }
    }

    public static Integer getNotificationType(String notificationStatus) {
        if(notificationStatus.equals("created")) {
            return NotificationStatus.CREATED;
        }
        if(notificationStatus.equals("aggregated")) {
            return NotificationStatus.AGGREGATED;
        }
        if(notificationStatus.equals("error")) {
            return NotificationStatus.ERROR;
        }
        if(notificationStatus.equals("pending")) {
            return NotificationStatus.PENDING;
        }
        if(notificationStatus.equals("test")) {
            return NotificationStatus.TEST;
        }
        if(notificationStatus.equals("success")) {
            return NotificationStatus.SUCCESS;
        }
        System.err.println("ERROR-NG-0000010: ERROR: Type Not defined");
        return 0;
    }
}
