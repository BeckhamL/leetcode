SELECT id,movie,description, rating FROM cinema WHERE NOT description='boring' AND (id % 2 != 0) ORDER BY rating DESC; 
