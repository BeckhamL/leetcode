SELECT Name as Customers FROM Customers c LEFT JOIN Orders o ON c.Id = o.customerId WHERE o.CustomerId IS NULL;
