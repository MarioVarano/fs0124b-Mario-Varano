SELECT * 
FROM esercizio."Clienti"
WHERE "Nome" = 'Mario';


SELECT "Nome", "Cognome"
FROM esercizio."Clienti"
WHERE "Anno di nascita" = '01/01/1982';


SELECT "NumeroFatture"
FROM esercizio."Fatture"
WHERE "Iva" = '20';

SELECT *
FROM esercizio."Prodotti"
WHERE EXTRACT (YEAR FROM "DataAttivazione") = 2017;

SELECT *
FROM esercizio."Fatture"
INNER JOIN "esercizio"."Clienti" ON "esercizio"."Fatture"."IdCliente" = "esercizio"."Clienti"."NumeroCliente"
WHERE esercizio."Fatture"."Importo" < 1000;




