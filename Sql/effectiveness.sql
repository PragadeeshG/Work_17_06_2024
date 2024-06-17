create table if not exists effectiveness(
viable_code bigint not null,
viable_name varchar(255) null,
viable_desc varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint effectiveness_pk primary key(viable_code));