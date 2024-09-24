"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmailNotification = void 0;
class EmailNotification {
    constructor(email) {
        this.email = email;
    }
    sendNotificacion(message) {
        console.log(`Sending notification via email: ${message} to  ${this.email}`);
    }
}
exports.EmailNotification = EmailNotification;
