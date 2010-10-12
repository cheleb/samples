create table juguser (
  id serial primary key,
  title text not null,
  lastname text not null,
  firstname text not null,
  email text not null,
  login text not null unique,
  password text not null
);


create table jug (
  id serial primary key,
  name text not null
);


create table juguser_x_jug (
  jug int not null references jug(id),
  juguser int not null references juguser(id),
  primary key(jug,juguser)
);