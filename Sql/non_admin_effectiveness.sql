create table if not exists non_admin_effectiveness(
viable_code bigint not null,
viable_region varchar(255) null,
viable_level varchar(255) null,
remarks varchar(255) null,
contact varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint non_admin_effectiveness_pk primary key(viable_code));