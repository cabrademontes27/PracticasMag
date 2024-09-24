import { INotificaction } from "./Notification";

export class EmailNotification implements INotificaction
{
    private email:string
    constructor(email:string)
    {
        this.email = email;
    }

    sendNotificacion(message: string): void {
        console.log(`Sending notification via email: ${message} to  ${this.email}` )
    }
}