from payment import Payment

class Card(Payment):
    
    def __init__(self, id, number, cvv, date):
        super.__init__(id)
        self.number     = number
        self.cvv        = cvv
        self.date       = date