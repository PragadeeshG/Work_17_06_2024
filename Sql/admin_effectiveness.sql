create table if not exists admin_effectiveness(
viable_code bigint not null,
routine_viable varchar(255) null,
daily_remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint admin_effectiveness_pk primary key(viable_code));