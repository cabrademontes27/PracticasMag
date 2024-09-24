"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DatabaseNotification = void 0;
class DatabaseNotification {
    constructor(userID) {
        this.userID = userID;
    }
    sendNotificacion(message) {
        console.log(`Saving User: ${this.userID}, ${message} `);
    }
}
exports.DatabaseNotification = DatabaseNotification;
