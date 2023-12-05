CREATE TABLE Pets(
    id INTEGER PRIMARY KEY,
    name TEXT (30) NOT NULL,
    type TEXT (20)
);

INSERT INTO Pets(id, name, type)
VALUES (1, "Muris", "Kaķis");

INSERT INTO Pets(id, name, type)
VALUES (2, "Rada", "Suns");

INSERT INTO Pets(id, name, type)
VALUES (3, "Poga", "Suns");
    
SELECT * FROM Pets;

SELECT name, type FROM Pets;