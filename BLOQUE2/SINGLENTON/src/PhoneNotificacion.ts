import { INotificaction } from "./Notification";

export class PhtoneNotification implements INotificaction
{
    private phoneNumber:string;

    constructor(phoneNumber: string)
    {
        this.phoneNumber =phoneNumber;
    }

    sendNotificacion(message: string): void {
        console.log(`sending notification via phone: ${message} to ${this.phoneNumber}`);
    }
}