from Product import Product
from CashRegister import CashRegister

class Store:
    def __init__(self):
        self.cash_register = CashRegister()
        self.products = [
            Product("Whiteboard Marker", 85, 1.50),
            Product("Whiteboard Eraser", 45, 5.00),
            Product("Black Pen", 100, 1.50),
            Product("Red Pen", 100, 1.50),
            Product("Blue Pen", 100, 1.50)
        ]

    def sell(self):
        # Implementation of sell method
        pass

    def restock(self):
        # Implementation of restock method
        pass

    def view_stock(self):
        for product in self.products:
            print(product)

    def view_cash(self):
        print(self.cash_register)

    def prune_products(self):
        self.products = [product for product in self.products if not product.is_empty()]

    def help(self):
        print("Menu options")
        print("s = sell")
        print("r = restock")
        print("v = view stock")
        print("c = view cash")
        print("p = prune products")
        print("x = exit")

    @staticmethod
    def main():
        # Main implementation
        pass

if __name__ == "__main__":
    Store.main()

