//categorias
INSERT INTO categorias (id_categoria,nombre) VALUES (1,'MUY FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (2,'FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (3,'INTERMEDIO');
INSERT INTO categorias (id_categoria,nombre) VALUES (4,'DIFICIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (5,'MUY DIFICIL');

//Preguntas
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (1,'Cuanto es 1+1 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (2,' cat 2 ?', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (3,'Cantidad de jugadores en un partido de Futbol', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (4,'Donde Nacio Simon Bolivar', 1);


//respuestas
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (1,'3', 1, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (2,'10', 1, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (3,'2', 1, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (4,'99', 1, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (5,'res1', 2, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (6,'res2', 2, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (7,'res3', 2, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (8,'res4', 2, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (9,'12', 3, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (10,'22', 3, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (11,'20', 3, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (12,'10', 3, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (13,'Venezuela', 4, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (14,'Colombia', 4, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (15,'Ecuador', 4, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (16,'Peru', 4, 0);


//premios
INSERT INTO premios (id_premio, dinero) VALUES (1, 1000);
INSERT INTO premios (id_premio, dinero) VALUES (2, 2000);
INSERT INTO premios (id_premio, dinero) VALUES (3, 4000);
INSERT INTO premios (id_premio, dinero) VALUES (4, 8000);
INSERT INTO premios (id_premio, dinero) VALUES (5, 16000);
