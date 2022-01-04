//categorias
INSERT INTO categorias (id_categoria,nombre) VALUES (1,'MUY FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (2,'FACIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (3,'INTERMEDIO');
INSERT INTO categorias (id_categoria,nombre) VALUES (4,'DIFICIL');
INSERT INTO categorias (id_categoria,nombre) VALUES (5,'MUY DIFICIL');

//Preguntas
INSERT INTO preguntas (id_pregunta,pregunta, id_categoria) VALUES (1,'WTF ?', 1);


//respuestas
INSERT INTO respuestas (id,respuesta,id_pregunta, correcta) VALUES (1,'res1', 1, 1);
INSERT INTO respuestas (id,respuesta,id_pregunta, correcta) VALUES (2,'res2', 1, 0);
INSERT INTO respuestas (id,respuesta,id_pregunta, correcta) VALUES (3,'res3', 1, 0);
INSERT INTO respuestas (id,respuesta,id_pregunta, correcta) VALUES (4,'res4', 1, 0);
