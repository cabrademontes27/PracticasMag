"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PhtoneNotification = void 0;
class PhtoneNotification {
    constructor(phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    sendNotificacion(message) {
        console.log(`sending notification via phone: ${message} to ${this.phoneNumber}`);
    }
}
exports.PhtoneNotification = PhtoneNotification;
