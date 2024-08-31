"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ShoppingCart = exports.SMSNotificacionService = exports.EmailNotificacionService = exports.Product = void 0;
class Product {
    constructor(id, name, price) {
        this.discount = 0;
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //gettersss
    getId() {
        return this.id;
    }
    getName() {
        return this.name;
    }
    getPrice() {
        return this.price;
    }
    getDiscount() {
        return this.discount;
    }
    getPriceWithDiscount() {
        return this.price * (1 - this.discount / 100);
    }
    applyDiscount(discount) {
        this.discount = discount;
        return this.getPriceWithDiscount();
    }
}
exports.Product = Product;
class EmailNotificacionService {
    sendNotificacion(messege) {
        console.log(messege);
    }
}
exports.EmailNotificacionService = EmailNotificacionService;
class SMSNotificacionService {
    constructor(phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }
    sendNotificacion(messege) {
        console.log(`Ènviando SMS: ${messege} al numero: ${this.phoneNumber}`);
    }
}
exports.SMSNotificacionService = SMSNotificacionService;
class ShoppingCart {
    constructor(notificacionService) {
        this.notificacionService = notificacionService;
        this.products = [];
    }
    idProduct(...newProduct) {
        newProduct.forEach(products => this.products.push(products));
    }
    showProducts() {
        console.log("Compraste:");
        this.products.forEach((product, index) => {
            if (product.getPriceWithDiscount() > 0) {
                console.log(`${index + 1}. ${product.getName()}, Precio original: $${product.getPrice()} MXN, Precio con descuento: $${product.getPriceWithDiscount().toFixed(2)} MXN`);
            }
            else {
                console.log(`${index + 1}. ${product.getName()}, por: $${product
                    .getPrice()
                    .toFixed(2)}MXN`);
            }
        });
    }
}
exports.ShoppingCart = ShoppingCart;
