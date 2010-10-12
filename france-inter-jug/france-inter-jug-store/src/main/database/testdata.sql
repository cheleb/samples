--
-- PostgreSQL database dump
--

-- Dumped from database version 9.0.0
-- Dumped by pg_dump version 9.0.0
-- Started on 2010-10-12 22:21:42 CEST

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

--
-- TOC entry 1806 (class 0 OID 0)
-- Dependencies: 1509
-- Name: jug_id_seq; Type: SEQUENCE SET; Schema: public; Owner: test
--

SELECT pg_catalog.setval('jug_id_seq', 17, true);


--
-- TOC entry 1807 (class 0 OID 0)
-- Dependencies: 1507
-- Name: juguser_id_seq; Type: SEQUENCE SET; Schema: public; Owner: test
--

SELECT pg_catalog.setval('juguser_id_seq', 24, true);


--
-- TOC entry 1802 (class 0 OID 16449)
-- Dependencies: 1510
-- Data for Name: jug; Type: TABLE DATA; Schema: public; Owner: test
--

INSERT INTO jug (id, name) VALUES (1, 'Montpellier');


--
-- TOC entry 1801 (class 0 OID 16436)
-- Dependencies: 1508
-- Data for Name: juguser; Type: TABLE DATA; Schema: public; Owner: test
--

INSERT INTO juguser (id, title, lastname, firstname, email, login, password) VALUES (1, 'M', 'Nouguier', 'Olivier', 'olivier.nouguier@gmail.com', 'onouguie', 'zozo');


--
-- TOC entry 1803 (class 0 OID 16458)
-- Dependencies: 1511 1802 1801
-- Data for Name: juguser_x_jug; Type: TABLE DATA; Schema: public; Owner: test
--



-- Completed on 2010-10-12 22:21:42 CEST

--
-- PostgreSQL database dump complete
--

