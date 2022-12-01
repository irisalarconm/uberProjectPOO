from payment import Payment

class Card(Payment):
    
    def __init__(self, id, email):
        super.__init__(id)
        self.email     = email
