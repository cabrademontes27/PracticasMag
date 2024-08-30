import { Product, EmailNotificacionService, SMSNotificacionService, ShoppingCart} from ".";


const notificationService1 = new EmailNotificacionService();
const cart1 = new ShoppingCart(notificationService1);

const laptop = new Product(1, 'ASUS TUF F15', 7000)
const telefono = new Product(2, 'Chayomi', 3000)
const television = new Product(3, '!Smart TV', 10000)
console.log(television.applyDiscount(25))

cart1.idProduct(laptop, telefono, television)

cart1.showProducts();

const notificationService2 = new SMSNotificacionService('123-456-7890')
const cart2 = new ShoppingCart(notificationService2)

cart2.idProduct(telefono, television, laptop)
cart2.showProducts()