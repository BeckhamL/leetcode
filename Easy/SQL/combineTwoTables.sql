SELECT
    p.FirstName, p.LastName, A.City, A.State
FROM
    Person p
LEFT JOIN
    Address A
ON
    p.personId = A.personId;
	
