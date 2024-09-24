import { DatabaseNotification } from "./DatabaseNotificacion";
import { EmailNotification } from "./EmailNotificacion";
import { NotificationManager } from "./NotificationManager";
import { PhtoneNotification } from "./PhoneNotificacion";

const NotificationManager = NotificationManager.getInstance();
const NotificationManager2 = NotificationManager.getInstance();

const dbNotification = new DatabaseNotification(1);
const emailNotification = new EmailNotification(`asmda@nose.com`);
const phoneNotification = new PhtoneNotification(`9221220832`);

NotificationManager.sendNotificacion(`new user register`,  dbNotification );
NotificationManager2.sendNotificacion(`confirm your email`, emailNotification);
NotificationManager.sendNotificacion(`your activation code is 6534`, phoneNotification);

console.log(`History: `, NotificationManager.getNotificationHistory())