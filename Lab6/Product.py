class Product:
    def __init__(self, name, stock, price):
        self.name = name
        self.stock = stock
        self.price = price

    def is_empty(self):
        return self.stock == 0

    def has(self, n):
        return self.stock >= n

    def sell(self, n):
        if self.has(n):
            self.stock -= n
            return n * self.price
        else:
            return 0.0

    def restock(self, n):
        self.stock += n

    def __str__(self):
        return f"{self.name} - {self.stock} at ${self.price:,.2f}"

