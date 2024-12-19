INSERT INTO airport(id, name, country, city)
VALUES
(1,'Henri C International Airport','România','București'),
(2,'Charles de Gaulle Airport',' Franța','Paris'),
(3,'John F. International Airport','SUA','New York'),
(4,'Heathrow Airport','Regatul Unit','Londra'),
(5,'Frankfurt Airport','Germania','Frankfurt'),
(6,'Dubai International Airport','Emiratele Arabe Unite','Dubai'),
(7,'Tokyo Haneda Airport','Japonia','Tokyo'),
(8,'Chisinau International Airport','Moldova','Chisinau')
ON CONFLICT (id) DO NOTHING;