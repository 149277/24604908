class CashRegister:
    def __init__(self):
        self.cash = 0.0

    def add(self, money):
        self.cash += money

    def __str__(self):
        return f"Cash: ${self.cash:,.2f}"

