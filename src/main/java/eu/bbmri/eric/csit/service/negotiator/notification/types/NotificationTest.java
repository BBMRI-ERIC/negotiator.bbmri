package eu.bbmri.eric.csit.service.negotiator.notification.types;

import de.samply.bbmri.negotiator.Config;
import de.samply.bbmri.negotiator.ConfigFactory;
import de.samply.bbmri.negotiator.jooq.tables.records.MailNotificationRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.NotificationRecord;
import eu.bbmri.eric.csit.service.negotiator.notification.Notification;
import eu.bbmri.eric.csit.service.negotiator.notification.util.NotificationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class NotificationTest extends Notification {

    private static Logger logger = LoggerFactory.getLogger(NotificationTest.class);

    private String emailAddress;

    public NotificationTest(NotificationRecord notificationRecord, String emailAddress) {
        this.emailAddress = emailAddress;
        this.notificationRecord = notificationRecord;
        start();
    }

    @Override
    public void run() {
        try(Config config = ConfigFactory.get()) {
            String subject = "Negotiator Test Email";
            createMailBodyBuilder("TEST_NOTIFICATION.soy");
            String body = getMailBody(new HashMap<String, String>());

            MailNotificationRecord mailNotificationRecord = saveNotificationToDatabase(config, emailAddress, subject, body);
            if(checkSendNotificationImmediatelyForUser(emailAddress, NotificationType.TEST_NOTIFICATION)) {
                String status = sendMailNotification(emailAddress, subject, body);
                updateNotificationInDatabase(config, mailNotificationRecord.getMailNotificationId(), status);
            }
            config.commit();
        } catch (Exception ex) {
            logger.error("b9e5a6aa1e9b-NotificationTest ERROR-NG-0000024: Error in NotificationTest.");
            logger.error(ex.getMessage());
            logger.error("context", ex);
        }
    }
}
