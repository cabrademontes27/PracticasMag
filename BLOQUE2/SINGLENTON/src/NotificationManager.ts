import { INotificaction } from "./Notification";

export class NotificationManager
{
    private static instance: NotificationManager;
    private notificationHistory:{msg:string, type:string} [] = []

    private constructor()
    {
        
    }

    public static getInstance(): NotificationManager
    {
        if(!NotificationManager.instance)
        {
            NotificationManager.instance = new NotificationManager();
        }
        return NotificationManager.instance;
    }

    public sendNotification(message: string, notifier: INotificaction):void
    {
        notifier.sendNotificacion(message);
        this.notificationHistory.push({msg: message, type: notifier.constructor.name})
    }

    public getNotificationHistory():{msg: string, type: string}[]
    {
        return this.notificationHistory;
    }


}