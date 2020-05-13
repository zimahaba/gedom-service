FROM postgres:12

ENV POSTGRES_DB=gedom
ENV POSTGRES_PASSWORD=postgres

VOLUME /var/lib/postgresql/data

#COPY ./src/main/resources/create.sql /docker-entrypoint-initdb.d/