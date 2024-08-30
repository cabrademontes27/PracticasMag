"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const _1 = require(".");
const notificationService1 = new _1.EmailNotificacionService();
const cart1 = new _1.ShoppingCart(notificationService1);
const laptop = new _1.Product(1, 'ASUS TUF F15', 7000);
const telefono = new _1.Product(2, 'Chayomi', 3000);
const television = new _1.Product(3, '!Smart TV', 10000);
console.log(television.applyDiscount(25));
cart1.idProduct(laptop, telefono, television);
cart1.showProducts();
const notificationService2 = new _1.SMSNotificacionService('123-456-7890');
const cart2 = new _1.ShoppingCart(notificationService2);
cart2.idProduct(telefono, television, laptop);
cart2.showProducts();
