//categorias
INSERT INTO categorias (id_categoria,nombre) VALUES (1,'MUY FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (2,'FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (3,'INTERMEDIO');
INSERT INTO categorias (id_categoria,nombre) VALUES (4,'DIFICIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (5,'MUY DIFICIL');

//Preguntas
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (1,'Cuanto es 1+1 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (2,' Cuanto es 5x5 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (3,'Cantidad de jugadores en un partido de Futbol', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (4,'Donde Nacio Simon Bolivar', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (5,'Cual es la gravedad de la tierra ? ', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (6,'Ciudad natal de Cristiano Ronaldo', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (7,'Colores de la bandera de Francia', 4);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (8,'Cual es la capital Siecia ?', 4);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (9,'Cuanto tarda la tierra en dar una vuelta al sol ?', 5);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (10,'Pais mas pequeño del mundo', 5);


//respuestas
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (1,'3', 1, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (2,'10', 1, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (3,'2', 1, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (4,'99', 1, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (5,'25', 2, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (6,'10', 2, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (7,'0', 2, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (8,'15', 2, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (9,'12', 3, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (10,'22', 3, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (11,'20', 3, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (12,'10', 3, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (13,'Venezuela', 4, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (14,'Colombia', 4, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (15,'Ecuador', 4, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (16,'Peru', 4, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (17,' 9.8 m/s2', 5, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (18,' 10.8 m/s2', 5, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (19,' 10 m/s2', 5, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (20,' 0 m/s2', 5, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (21,'Madeira', 6, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (22,'Lisboa', 6, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (23,'Oporto', 6, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (24,'Funchal', 6, 1);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (25,'Blanco-Azul-Rojo', 7, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (26,'Amarillo-Azul-Rojo', 7, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (27,'Azul-Blanco-Rojo', 7, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (28,'Blanco-Rojo-Azul', 7, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (29,'Lund', 8, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (30,'Estocolmo', 8, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (31,'Orebro', 8, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (32,'Upsala', 8, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (33,'365 Dias y 6 Horas', 9, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (34,'356 Dias', 9, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (35,'365 Dias', 9, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (36,'365 Dias y 12 Horas', 9, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (37,'Maldivas', 10, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (38,'San Marino', 10, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (39,'Monaco', 10, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (40,'Vaticano', 10, 1);


//premios
INSERT INTO premios (id_premio, dinero) VALUES (1, 1000);
INSERT INTO premios (id_premio, dinero) VALUES (2, 2000);
INSERT INTO premios (id_premio, dinero) VALUES (3, 4000);
INSERT INTO premios (id_premio, dinero) VALUES (4, 8000);
INSERT INTO premios (id_premio, dinero) VALUES (5, 16000);
