export class Product 
{
    private id: number;
    private name: string;
    private price: number;
    private discount: number = 0;

    constructor(id: number, name: string, price: number)
    {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    //gettersss

    getId(): number
    {
        return this.id;
    }

    getName():string
    {
        return this.name;
    }

    getPrice():number
    {
        return this.price;
    }
    getDiscount():number
    {
        return this.discount
    }

    getPriceWithDiscount():number
    {
        return this.price * (1 - this.discount / 100)
    }

    applyDiscount(discount : number):number
    {
        this.discount = discount
        return this.getPriceWithDiscount()
    }
}


interface NotificationService
{
    sendNotificacion(messege: string): void
}

export class EmailNotificacionService implements NotificationService
{
    sendNotificacion(messege: string): void {
        console.log(messege)
    }
}

export class SMSNotificacionService implements NotificationService
{
    private phoneNumber: string
    constructor(phoneNUmber: string)
    {
        this.phoneNumber = phoneNUmber
    }

    sendNotificacion(messege: string): void {
        console.log(`Ènviando SMS: ${messege} al numero: ${this.phoneNumber}`);
    }
}

export class ShoppingCart
{
    private products: Product[]
    private notificacionService: NotificationService;

    constructor(notificacionService : NotificationService)
    {
        this.notificacionService = notificacionService
        this.products = []
    }

    idProduct(...newProduct: Product[]):void
    {
        newProduct.forEach(products => this.products.push(products))
    }

    showProducts(): void {
        console.log("Compraste:");
        this.products.forEach((product, index) => {
            if (product.getPriceWithDiscount() > 0) {
                console.log(
                    `${index + 1}. ${product.getName()}, Precio original: $${product.getPrice()} MXN, Precio con descuento: $${product.getPriceWithDiscount().toFixed(
                        2
                    )} MXN`
                );
            } else {
                console.log(
                    `${index + 1}. ${product.getName()}, por: $${product
                        .getPrice()
                        .toFixed(2)}MXN`
                );
            }
        });
    }

}
