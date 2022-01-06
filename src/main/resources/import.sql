//categorias
INSERT INTO categorias (id_categoria,nombre) VALUES (1,'MUY FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (2,'FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (3,'INTERMEDIO');
INSERT INTO categorias (id_categoria,nombre) VALUES (4,'DIFICIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (5,'MUY DIFICIL');

//Preguntas
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (1,'Cuanto es 1+1 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (2,'Cuanto es 5x5 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (3,'Cantidad de jugadores en un partido de Futbol', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (4,'Donde Nacio Simon Bolivar', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (5,'Cual es la gravedad de la tierra ? ', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (6,'Ciudad natal de Cristiano Ronaldo', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (7,'Colores de la bandera de Francia', 4);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (8,'Cual es la capital Siecia ?', 4);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (9,'Cuanto tarda la tierra en dar una vuelta al sol ?', 5);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (10,'Pais mas pequeño del mundo', 5);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (11,' Cuanto es 10 + 10 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (12,' Cuanto es 3 + 3 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (13,' Cuanto es 999 * 0 ?', 1);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (14,'En qué lado del cuerpo está el hígado ?', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (15,'Cómo se llama el líder de los Autobots en la saga de películas de “Transformers” ?', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (16,'Qué famoso youtuber español tiene su propia serie de animación ?', 2);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (17,'Cuál es la velocidad de la luz ?', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (18,'En qué mes el Sol está más cerca de la Tierra ?', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (19,'Cómo se llama el caballo de Don Quijote de la Mancha ?', 3);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (20,'Con qué nombre firmaba Van Gogh sus obras ?', 4);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (21,'En que año inicio la Segunda Guerra Mundial', 4);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (22,'En qué año llegó el hombre a la Luna ?', 5);
INSERT INTO preguntas (id_pregunta,descripcion, id_categoria) VALUES (23,'Qué país es el que, con 5 títulos, ha ganado más mundiales ?', 5);



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

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (41,'22', 11, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (42,'10', 11, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (43,'20', 11, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (44,'1010', 11, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (45,'7', 12, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (46,'0', 12, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (47,'33', 12, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (48,'6', 12, 1);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (49,'999', 13, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (50,'0', 13, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (51,'9990', 13, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (52,'1', 13, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (53,'Abajo', 14, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (54,'Arriba', 14, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (55,'Izquierdo', 14, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (56,'central-Derecho', 14, 1);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (57,'Optimus Prime', 15, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (58,'Bumblebee', 15, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (59,'Megatron', 15, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (60,'Jazz', 15, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (61,'The Gref', 16,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (62,'Dj Mario', 16, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (63,'Rubius', 16, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (64,'Giorgio', 16, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (65,'200 km/s', 17,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (66,'300.000 km/s', 17, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (67,'1000.000 km/s', 17, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (68,'100.000 km/s', 17, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (69,'Diciembre', 18,1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (70,'Enero', 18, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (71,'Julio', 18, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (72,'Agosto', 18, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (73,'Zeus', 19,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (74,'Troya', 19, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (75,'Caballito', 19, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (76,'Rocinante', 19, 1);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (77,'Drente', 20,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (78,'Vincent', 20, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (79,'Flevolanda', 20, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (80,'Vicente', 20, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (81,'1939', 21,1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (82,'1945', 21, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (83,'1912', 21, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (84,'1955', 21, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (85,'1985', 22,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (86,'1970', 22, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (87,'1969', 22, 1);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (88,'1975', 22, 0);

INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (89,'España', 23,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (90,'Francia', 23, 0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (91,'Argentina', 23,0);
INSERT INTO respuestas (id_respuesta,respuesta,id_pregunta, correcta) VALUES (92,'Brasil', 23, 1);


//premios
INSERT INTO premios (id_premio, dinero) VALUES (1, 1000);
INSERT INTO premios (id_premio, dinero) VALUES (2, 2000);
INSERT INTO premios (id_premio, dinero) VALUES (3, 4000);
INSERT INTO premios (id_premio, dinero) VALUES (4, 8000);
INSERT INTO premios (id_premio, dinero) VALUES (5, 16000);
