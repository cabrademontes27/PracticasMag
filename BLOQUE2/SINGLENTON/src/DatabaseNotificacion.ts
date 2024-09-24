import { INotificaction } from "./Notification";

export class DatabaseNotification implements INotificaction
{
    private userID: number; 
    constructor(userID: number)
    {
        this.userID = userID;
    }

    sendNotificacion(message: string): void {
        console.log(`Saving User: ${this.userID}, ${message} `)
    }
}