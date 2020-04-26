package eu.bbmri.eric.csit.service.negotiator.notification.util;

public abstract class NotificationType {
    public static final int CREATE_REQUEST_NOTIFICATION = 1;
    public static final int APPROVE_REQUEST_NOTIFICATION = 2;
    public static final int REJECT_REQUEST_NOTIFICATION = 3;
    public static final int START_NEGOTIATION_NOTIFICATION = 4;
    public static final int PUBLIC_COMMAND_NOTIFICATION = 5;
    public static final int PRIVATE_COMMAND_NOTIFICATION = 6;
    public static final int STATUS_CHANGED_NOTIFICATION = 7;

    public static final int TEST_NOTIFICATION = 100;
}
