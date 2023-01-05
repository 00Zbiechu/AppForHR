/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     04.01.2023 21:23:02                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ACCOUNT                                                 */
/*==============================================================*/
create table ACCOUNT (
                       Id_account           SERIAL            not null,
                       First_name         VARCHAR(20)         not null,
                       Last_name          VARCHAR(20)         not null,
                       Email              VARCHAR(30)         not null,
                       Password           VARCHAR(100)        not null,
                       constraint PK_ACCOUNT primary key (Id_account)
);

/*==============================================================*/
/* Table: DZIAL                                                 */
/*==============================================================*/
create table DZIAL (
                       Id_dzial             SERIAL               not null,
                       Id_lokalizacja       INT4                 not null,
                       Nazwa_dzialu         VARCHAR(30)          not null,
                       Opis_dzialu          VARCHAR(100)         not null,
                       Liczba_wolnych_stanowisk INT4                 not null,
                       constraint PK_DZIAL primary key (Id_dzial)
);

/*==============================================================*/
/* Index: DZIAL_PK                                              */
/*==============================================================*/
create unique index DZIAL_PK on DZIAL (
                                       Id_dzial
    );

/*==============================================================*/
/* Index: LOKALIZACJA_DZIAL_FK                                  */
/*==============================================================*/
create  index LOKALIZACJA_DZIAL_FK on DZIAL (
                                             Id_lokalizacja
    );

/*==============================================================*/
/* Table: HEADHUNTER                                            */
/*==============================================================*/
create table HEADHUNTER (
                            Id_headhunter        SERIAL               not null,
                            Id_dzial             INT4                 not null,
                            Headhunter_imie      VARCHAR(20)          not null,
                            Headhunter_nazwisko  VARCHAR(20)          not null,
                            Headhunter_data_urodzenia DATE                 not null,
                            Headhunter_pesel     VARCHAR(11)          not null,
                            Headhunter_nr_telefonu VARCHAR(9)           not null,
                            Headhunter_mail      VARCHAR(20)          null,
                            Headhunter_ulica     VARCHAR(30)          not null,
                            Headhunter_nr_domu   INT4                 not null,
                            Headhunter_nr_mieszkania INT4                 null,
                            Headhunter_miasto    VARCHAR(30)          not null,
                            Headhinter_kraj      VARCHAR(20)          not null,
                            Headhunter_wojewodztwo VARCHAR(30)          not null,
                            Headhunter_kod_pocztowy VARCHAR(10)          not null,
                            Headhunter_zarobki   NUMERIC              not null,
                            Headhunter_data_zatrudnienia DATE                 not null,
                            Headhunter_status_zatrudnienia BOOL                 not null,
                            constraint PK_HEADHUNTER primary key (Id_headhunter)
);

/*==============================================================*/
/* Index: HEADHUNTER_PK                                         */
/*==============================================================*/
create unique index HEADHUNTER_PK on HEADHUNTER (
                                                 Id_headhunter
    );

/*==============================================================*/
/* Index: DZIAL_HEADHUNTER_FK                                   */
/*==============================================================*/
create  index DZIAL_HEADHUNTER_FK on HEADHUNTER (
                                                 Id_dzial
    );

/*==============================================================*/
/* Table: HISTORIA_PRACY                                        */
/*==============================================================*/
create table HISTORIA_PRACY (
                                Id_historia_pracy    SERIAL               not null,
                                Id_stanowisko        INT4                 not null,
                                Id_dzial             INT4                 not null,
                                Id_pracownik         INT4                 not null,
                                Rozpoczecie_pracy    DATE                 not null,
                                Zakonczenie_pracy    DATE                 not null,
                                constraint PK_HISTORIA_PRACY primary key (Id_historia_pracy)
);

/*==============================================================*/
/* Index: HISTORIA_PRACY_PK                                     */
/*==============================================================*/
create unique index HISTORIA_PRACY_PK on HISTORIA_PRACY (
                                                         Id_historia_pracy
    );

/*==============================================================*/
/* Index: STANOWISKO_HISTORIA_PRACY_FK                          */
/*==============================================================*/
create  index STANOWISKO_HISTORIA_PRACY_FK on HISTORIA_PRACY (
                                                              Id_stanowisko
    );

/*==============================================================*/
/* Index: PRACOWNIK_HISTORIA_PRACY_FK                           */
/*==============================================================*/
create  index PRACOWNIK_HISTORIA_PRACY_FK on HISTORIA_PRACY (
                                                             Id_pracownik
    );

/*==============================================================*/
/* Index: DZIAL_HISTORIA_PRACY_FK                               */
/*==============================================================*/
create  index DZIAL_HISTORIA_PRACY_FK on HISTORIA_PRACY (
                                                         Id_dzial
    );

/*==============================================================*/
/* Table: KIEROWNIK                                             */
/*==============================================================*/
create table KIEROWNIK (
                           Id_kierownik         SERIAL               not null,
                           Id_dzial             INT4                 not null,
                           Kierownik_imie       VARCHAR(20)          not null,
                           Kierownik_nazwisko   VARCHAR(20)          not null,
                           Kierownik_data_urodzenia DATE                 not null,
                           Kierownik_pesel      VARCHAR(11)          not null,
                           Kierownik_nr_telefonu VARCHAR(9)           not null,
                           Kierownik_mail       VARCHAR(20)          null,
                           Kierownik_ulica      VARCHAR(30)          not null,
                           Kierownik_nr_domu    INT4                 not null,
                           Kierownik_nr_mieszkania INT4                 null,
                           Kierownik_miasto     VARCHAR(30)          not null,
                           Kierownik_kraj       VARCHAR(20)          not null,
                           Kierownik_wojewodztwo VARCHAR(30)          not null,
                           Kierownik_kod_pocztowy VARCHAR(10)          not null,
                           Kierownik_zarobki    NUMERIC              not null,
                           Kierownik_data_zatrudnienia DATE                 not null,
                           Kierownik_status_zatrudnienia BOOL                 not null,
                           Obowiazki            VARCHAR(100)         not null,
                           constraint PK_KIEROWNIK primary key (Id_kierownik)
);

/*==============================================================*/
/* Index: KIEROWNIK_PK                                          */
/*==============================================================*/
create unique index KIEROWNIK_PK on KIEROWNIK (
                                               Id_kierownik
    );

/*==============================================================*/
/* Index: DZIAL_KIEROWNIK_FK                                    */
/*==============================================================*/
create  index DZIAL_KIEROWNIK_FK on KIEROWNIK (
                                               Id_dzial
    );

/*==============================================================*/
/* Table: KRAJ                                                  */
/*==============================================================*/
create table KRAJ (
                      Id_kraj              SERIAL               not null,
                      Kraj_nazwa           VARCHAR(30)          not null,
                      constraint PK_KRAJ primary key (Id_kraj)
);

/*==============================================================*/
/* Index: KRAJ_PK                                               */
/*==============================================================*/
create unique index KRAJ_PK on KRAJ (
                                     Id_kraj
    );

/*==============================================================*/
/* Table: LOKALIZACJA                                           */
/*==============================================================*/
create table LOKALIZACJA (
                             Id_lokalizacja       SERIAL               not null,
                             Id_kraj              INT4                 not null,
                             Ulica                VARCHAR(30)          not null,
                             Kod_pocztowy         VARCHAR(10)          not null,
                             Miasto               VARCHAR(30)          not null,
                             Wojewodztwo          VARCHAR(30)          not null,
                             constraint PK_LOKALIZACJA primary key (Id_lokalizacja)
);

/*==============================================================*/
/* Index: LOKALIZACJA_PK                                        */
/*==============================================================*/
create unique index LOKALIZACJA_PK on LOKALIZACJA (
                                                   Id_lokalizacja
    );

/*==============================================================*/
/* Index: KRAJ_LOKALIZACJA_FK                                   */
/*==============================================================*/
create  index KRAJ_LOKALIZACJA_FK on LOKALIZACJA (
                                                  Id_kraj
    );

/*==============================================================*/
/* Table: OFERTA                                                */
/*==============================================================*/
create table OFERTA (
                        Id_oferta            SERIAL               not null,
                        Id_stanowisko        INT4                 not null,
                        Tytul                VARCHAR(30)          not null,
                        Opis_oferty          VARCHAR(100)         not null,
                        Wymagania            VARCHAR(100)            not null,
                        Lokalizacja          VARCHAR(20)          not null,
                        Data_wystawienia_oferty DATE                 not null,
                        constraint PK_OFERTA primary key (Id_oferta)
);

/*==============================================================*/
/* Index: OFERTA_PK                                             */
/*==============================================================*/
create unique index OFERTA_PK on OFERTA (
                                         Id_oferta
    );

/*==============================================================*/
/* Index: OFERTA_STANOWISKO_FK                                  */
/*==============================================================*/
create  index OFERTA_STANOWISKO_FK on OFERTA (
                                              Id_stanowisko
    );

/*==============================================================*/
/* Table: PETENT                                                */
/*==============================================================*/
create table PETENT (
                        Id_petent            SERIAL               not null,
                        Petent_imie          VARCHAR(20)          not null,
                        Petent_nazwisko      VARCHAR(20)          not null,
                        Petent_data_urodzenia DATE                 not null,
                        Petent_pesel         VARCHAR(11)          not null,
                        Petent_nr_telefonu   VARCHAR(9)           not null,
                        Petent_mail          VARCHAR(20)          null,
                        Petent_ulica         VARCHAR(30)          not null,
                        Petent_nr_domu       INT4                 not null,
                        Petent_nr_mieszkania INT4                 null,
                        Petent_miasto        VARCHAR(30)          not null,
                        Petent_kraj          VARCHAR(20)          not null,
                        Petent_wojewodztwo   VARCHAR(30)          not null,
                        Petent_kod_pocztowy  VARCHAR(10)          not null,
                        constraint PK_PETENT primary key (Id_petent)
);

/*==============================================================*/
/* Index: PETENT_PK                                             */
/*==============================================================*/
create unique index PETENT_PK on PETENT (
                                         Id_petent
    );

/*==============================================================*/
/* Table: PODANIE                                               */
/*==============================================================*/
create table PODANIE (
                         Id_podanie           SERIAL               not null,
                         Id_oferta            INT4                 not null,
                         Id_petent            INT4                 not null,
                         Kwalifikacje         VARCHAR(100)         not null,
                         CV                   VARCHAR(20)          not null,
                         Data_zlozenia_podania DATE                 not null,
                         constraint PK_PODANIE primary key (Id_podanie)
);

/*==============================================================*/
/* Index: PODANIE_PK                                            */
/*==============================================================*/
create unique index PODANIE_PK on PODANIE (
                                           Id_podanie
    );

/*==============================================================*/
/* Index: PETENT_PODANIE_FK                                     */
/*==============================================================*/
create  index PETENT_PODANIE_FK on PODANIE (
                                            Id_petent
    );

/*==============================================================*/
/* Index: OFERTA_PODANIE_FK                                     */
/*==============================================================*/
create  index OFERTA_PODANIE_FK on PODANIE (
                                            Id_oferta
    );

/*==============================================================*/
/* Table: PRACOWNIK                                             */
/*==============================================================*/
create table PRACOWNIK (
                           Id_pracownik         SERIAL               not null,
                           Pracownik_imie       VARCHAR(20)          not null,
                           Pracownik_nazwisko   VARCHAR(20)          not null,
                           Pracownik_data_urodzenia DATE                 not null,
                           Pracownik_pesel      VARCHAR(11)          not null,
                           Pracownik_nr_telefonu VARCHAR(9)           not null,
                           Pracownik_mail       VARCHAR(20)          null,
                           Pracownik_ulica      VARCHAR(30)          not null,
                           Pracownik_nr_domu    INT4                 not null,
                           Pracownik_nr_mieszkania INT4                 null,
                           Pracownik_miasto     VARCHAR(30)          not null,
                           Pracownik_kraj       VARCHAR(20)          not null,
                           Pracownik_wojewodztwo VARCHAR(30)          not null,
                           Pracownik_kod_pocztowy VARCHAR(10)          not null,
                           Pracownik_zarobki    NUMERIC              not null,
                           Pracownik_status_zatrudnienia BOOL                 not null,
                           constraint PK_PRACOWNIK primary key (Id_pracownik)
);

/*==============================================================*/
/* Index: PRACOWNIK_PK                                          */
/*==============================================================*/
create unique index PRACOWNIK_PK on PRACOWNIK (
                                               Id_pracownik
    );

/*==============================================================*/
/* Table: REKRUTACJA                                            */
/*==============================================================*/
create table REKRUTACJA (
                            Id_rekrutacja        SERIAL               not null,
                            Id_petent            INT4                 not null,
                            Id_headhunter        INT4                 not null,
                            Id_oferta            INT4                 null,
                            Data_rozmowy_kwalifikacyjnej DATE                 not null,
                            constraint PK_REKRUTACJA primary key (Id_rekrutacja)
);

/*==============================================================*/
/* Index: REKRUTACJA_PK                                         */
/*==============================================================*/
create unique index REKRUTACJA_PK on REKRUTACJA (
                                                 Id_rekrutacja
    );

/*==============================================================*/
/* Index: REKRUTACJA_PETENT_FK                                  */
/*==============================================================*/
create  index REKRUTACJA_PETENT_FK on REKRUTACJA (
                                                  Id_petent
    );

/*==============================================================*/
/* Index: REKRUTACJA_OFERTA_FK                                  */
/*==============================================================*/
create  index REKRUTACJA_OFERTA_FK on REKRUTACJA (
                                                  Id_oferta
    );

/*==============================================================*/
/* Index: HEADHUNTER_REKRUTACJA_FK                              */
/*==============================================================*/
create  index HEADHUNTER_REKRUTACJA_FK on REKRUTACJA (
                                                      Id_headhunter
    );

/*==============================================================*/
/* Table: STANOWISKO                                            */
/*==============================================================*/
create table STANOWISKO (
                            Id_stanowisko        SERIAL               not null,
                            Nazwa_stanowiska     VARCHAR(20)          not null,
                            Opis_stanowiska      VARCHAR(100)         not null,
                            Minimalne_zarobki    NUMERIC                not null,
                            Maksymalne_zarobki   NUMERIC                not null,
                            constraint PK_STANOWISKO primary key (Id_stanowisko)
);

/*==============================================================*/
/* Index: STANOWISKO_PK                                         */
/*==============================================================*/
create unique index STANOWISKO_PK on STANOWISKO (
                                                 Id_stanowisko
    );

alter table DZIAL
    add constraint FK_DZIAL_LOKALIZAC_LOKALIZA foreign key (Id_lokalizacja)
        references LOKALIZACJA (Id_lokalizacja)
        on delete restrict on update restrict;

alter table HEADHUNTER
    add constraint FK_HEADHUNT_DZIAL_HEA_DZIAL foreign key (Id_dzial)
        references DZIAL (Id_dzial)
        on delete restrict on update restrict;

alter table HISTORIA_PRACY
    add constraint FK_HISTORIA_DZIAL_HIS_DZIAL foreign key (Id_dzial)
        references DZIAL (Id_dzial)
        on delete restrict on update restrict;

alter table HISTORIA_PRACY
    add constraint FK_HISTORIA_PRACOWNIK_PRACOWNI foreign key (Id_pracownik)
        references PRACOWNIK (Id_pracownik)
        on delete restrict on update restrict;

alter table HISTORIA_PRACY
    add constraint FK_HISTORIA_STANOWISK_STANOWIS foreign key (Id_stanowisko)
        references STANOWISKO (Id_stanowisko)
        on delete restrict on update restrict;

alter table KIEROWNIK
    add constraint FK_KIEROWNI_DZIAL_KIE_DZIAL foreign key (Id_dzial)
        references DZIAL (Id_dzial)
        on delete restrict on update restrict;

alter table LOKALIZACJA
    add constraint FK_LOKALIZA_KRAJ_LOKA_KRAJ foreign key (Id_kraj)
        references KRAJ (Id_kraj)
        on delete restrict on update restrict;

alter table OFERTA
    add constraint FK_OFERTA_OFERTA_ST_STANOWIS foreign key (Id_stanowisko)
        references STANOWISKO (Id_stanowisko)
        on delete restrict on update restrict;

alter table PODANIE
    add constraint FK_PODANIE_OFERTA_PO_OFERTA foreign key (Id_oferta)
        references OFERTA (Id_oferta)
        on delete restrict on update restrict;

alter table PODANIE
    add constraint FK_PODANIE_PETENT_PO_PETENT foreign key (Id_petent)
        references PETENT (Id_petent)
        on delete restrict on update restrict;

alter table REKRUTACJA
    add constraint FK_REKRUTAC_HEADHUNTE_HEADHUNT foreign key (Id_headhunter)
        references HEADHUNTER (Id_headhunter)
        on delete restrict on update restrict;

alter table REKRUTACJA
    add constraint FK_REKRUTAC_REKRUTACJ_OFERTA foreign key (Id_oferta)
        references OFERTA (Id_oferta)
        on delete restrict on update restrict;

alter table REKRUTACJA
    add constraint FK_REKRUTAC_REKRUTACJ_PETENT foreign key (Id_petent)
        references PETENT (Id_petent)
        on delete restrict on update restrict;


/*==============================================================*/
/* Index: INSERTS                                      */
/*==============================================================*/

delete from historia_pracy;
delete from pracownik;
delete from kierownik;
delete from rekrutacja;
delete from podanie;
delete from petent;
delete from oferta;
delete from stanowisko;
delete from headhunter;
delete from dzial;
delete from lokalizacja;
delete from kraj;

INSERT INTO KRAJ(Kraj_nazwa) VALUES ('Polska');
INSERT INTO KRAJ(Kraj_nazwa) VALUES ('Niemcy');
INSERT INTO KRAJ(Kraj_nazwa) VALUES ('Francja');
INSERT INTO KRAJ(Kraj_nazwa) VALUES ('Włochy');
INSERT INTO KRAJ(Kraj_nazwa) VALUES ('Hiszpania');



INSERT INTO LOKALIZACJA(id_kraj, ulica, kod_pocztowy, miasto, wojewodztwo) VALUES (1,'Przemyslowa','75-400','Koszalin','Zachodniopomorskie');
INSERT INTO LOKALIZACJA(id_kraj, ulica, kod_pocztowy, miasto, wojewodztwo) VALUES (2,'Sztrase','75-200','Berilin','Berlin ');
INSERT INTO LOKALIZACJA(id_kraj, ulica, kod_pocztowy, miasto, wojewodztwo) VALUES (3,'Zelipapom','75-300','Paryż','Île-de-France');
INSERT INTO LOKALIZACJA(id_kraj, ulica, kod_pocztowy, miasto, wojewodztwo) VALUES (4,'Ristorante','75-500','Rzym','Roma');
INSERT INTO LOKALIZACJA(id_kraj, ulica, kod_pocztowy, miasto, wojewodztwo) VALUES (5,'Lecasadepapel','75-700','Madryt','Madrid');



INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (1,'IT','Dzial pomocy komputerowej',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (1,'Kadry','Zatrudnianie pracowników',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (1,'Obsluga klienta','Obsluga klienów',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (1,'Naczelnicy','Zarządzanie asystentami',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (1,'Magazyn','Obsluga magazynu',2);

INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (2,'IT','Dzial pomocy komputerowej',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (2,'Kadry','Zatrudnianie pracowników',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (2,'Obsluga klienta','Obsluga klienów',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (2,'Naczelnicy','Zarządzanie asystentami',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (2,'Magazyn','Obsluga magazynu',2);

INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (3,'IT','Dzial pomocy komputerowej',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (3,'Kadry','Zatrudnianie pracowników',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (3,'Obsluga klienta','Obsluga klienów',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (3,'Naczelnicy','Zarządzanie asystentami',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (3,'Magazyn','Obsluga magazynu',2);

INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (4,'IT','Dzial pomocy komputerowej',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (4,'Kadry','Zatrudnianie pracowników',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (4,'Obsluga klienta','Obsluga klienów',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (4,'Naczelnicy','Zarządzanie asystentami',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (4,'Magazyn','Obsluga magazynu',2);

INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (5,'IT','Dzial pomocy komputerowej',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (5,'Kadry','Zatrudnianie pracowników',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (5,'Obsluga klienta','Obsluga klienów',2);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (5,'Naczelnicy','Zarządzanie asystentami',0);
INSERT INTO DZIAL(Id_lokalizacja, Nazwa_dzialu, Opis_dzialu, Liczba_wolnych_stanowisk) VALUES (5,'Magazyn','Obsluga magazynu',2);




INSERT INTO KIEROWNIK(Id_dzial, Kierownik_imie, Kierownik_nazwisko, Kierownik_data_urodzenia, Kierownik_pesel, Kierownik_nr_telefonu, Kierownik_mail, Kierownik_ulica, Kierownik_nr_domu, Kierownik_nr_mieszkania, Kierownik_miasto, Kierownik_kraj, Kierownik_wojewodztwo, Kierownik_kod_pocztowy, Kierownik_zarobki, Kierownik_data_zatrudnienia, Kierownik_status_zatrudnienia, Obowiazki) VALUES (1,'Marek','Kowalski','2000-11-11','60112358758','123456789','mkowalski@firma.pl','Chabrowa',2,3,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,'2022-11-11',true,'Kierowanie projektami IT');
INSERT INTO KIEROWNIK(Id_dzial, Kierownik_imie, Kierownik_nazwisko, Kierownik_data_urodzenia, Kierownik_pesel, Kierownik_nr_telefonu, Kierownik_mail, Kierownik_ulica, Kierownik_nr_domu, Kierownik_nr_mieszkania, Kierownik_miasto, Kierownik_kraj, Kierownik_wojewodztwo, Kierownik_kod_pocztowy, Kierownik_zarobki, Kierownik_data_zatrudnienia, Kierownik_status_zatrudnienia, Obowiazki) VALUES (2,'Jan','Kowalski','1999-11-12','64050961559','123276780','jkowalski@firma.pl','Baltycka',2,4,'Gdynia','Polska','Pomorskie','75-300',3000,'2022-11-12',true,'Zarzadzanie dzialem HR');
INSERT INTO KIEROWNIK(Id_dzial, Kierownik_imie, Kierownik_nazwisko, Kierownik_data_urodzenia, Kierownik_pesel, Kierownik_nr_telefonu, Kierownik_mail, Kierownik_ulica, Kierownik_nr_domu, Kierownik_nr_mieszkania, Kierownik_miasto, Kierownik_kraj, Kierownik_wojewodztwo, Kierownik_kod_pocztowy, Kierownik_zarobki, Kierownik_data_zatrudnienia, Kierownik_status_zatrudnienia, Obowiazki) VALUES (3,'Adam','Dzięcioł','1992-09-13','85120988663','123453382','jnowak@firma.pl','Przemyslowa',2,4,'Slupsk','Polska','Pomorskie','75-200',3000,'2022-11-13',true,'Rozpatrywanie skarg');
INSERT INTO KIEROWNIK(Id_dzial, Kierownik_imie, Kierownik_nazwisko, Kierownik_data_urodzenia, Kierownik_pesel, Kierownik_nr_telefonu, Kierownik_mail, Kierownik_ulica, Kierownik_nr_domu, Kierownik_nr_mieszkania, Kierownik_miasto, Kierownik_kraj, Kierownik_wojewodztwo, Kierownik_kod_pocztowy, Kierownik_zarobki, Kierownik_data_zatrudnienia, Kierownik_status_zatrudnienia, Obowiazki) VALUES (4,'Robert','Marek','2000-02-14','47031644364','443456780','mnowak@firma.pl','Rozana',2,4,'Zakopane','Polska','Malopolskie','75-700',3000,'2022-11-14',false,'Tworzenie grafikow');
INSERT INTO KIEROWNIK(Id_dzial, Kierownik_imie, Kierownik_nazwisko, Kierownik_data_urodzenia, Kierownik_pesel, Kierownik_nr_telefonu, Kierownik_mail, Kierownik_ulica, Kierownik_nr_domu, Kierownik_nr_mieszkania, Kierownik_miasto, Kierownik_kraj, Kierownik_wojewodztwo, Kierownik_kod_pocztowy, Kierownik_zarobki, Kierownik_data_zatrudnienia, Kierownik_status_zatrudnienia, Obowiazki) VALUES (5,'Janusz','Kowal','2001-05-15','97081021769','654326701','hdzban@firma.pl','Kwiatowa',2,4,'Krakow','Polska','Malopolskie','75-800',10000,'2022-11-15',true,'Kierowanie dzialem spedycji');



INSERT INTO PRACOWNIK(Pracownik_imie, Pracownik_nazwisko, Pracownik_data_urodzenia, Pracownik_pesel, Pracownik_nr_telefonu, Pracownik_mail, Pracownik_ulica, Pracownik_nr_domu, Pracownik_nr_mieszkania, Pracownik_miasto, Pracownik_kraj, Pracownik_wojewodztwo, Pracownik_kod_pocztowy, Pracownik_zarobki, Pracownik_status_zatrudnienia) VALUES ('Darek','Cwaniak','2000-03-24','55010218181','543456789','dcwaniak@firma.pl','Ceglana',1,3,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,true);
INSERT INTO PRACOWNIK(Pracownik_imie, Pracownik_nazwisko, Pracownik_data_urodzenia, Pracownik_pesel, Pracownik_nr_telefonu, Pracownik_mail, Pracownik_ulica, Pracownik_nr_domu, Pracownik_nr_mieszkania, Pracownik_miasto, Pracownik_kraj, Pracownik_wojewodztwo, Pracownik_kod_pocztowy, Pracownik_zarobki, Pracownik_status_zatrudnienia) VALUES ('Horacy','Dzik','1999-02-21','68020813165','222456320','hdzik@firma.pl','Dzikowa',9,4,'Gdynia','Polska','Pomorskie','75-300',3000,true);
INSERT INTO PRACOWNIK(Pracownik_imie, Pracownik_nazwisko, Pracownik_data_urodzenia, Pracownik_pesel, Pracownik_nr_telefonu, Pracownik_mail, Pracownik_ulica, Pracownik_nr_domu, Pracownik_nr_mieszkania, Pracownik_miasto, Pracownik_kraj, Pracownik_wojewodztwo, Pracownik_kod_pocztowy, Pracownik_zarobki, Pracownik_status_zatrudnienia) VALUES ('Miriam','Sus','2002-01-01','94051854411','555562712','msus@firma.pl','Silowa',2,2,'Slupsk','Polska','Pomorskie','75-200',3000,true);
INSERT INTO PRACOWNIK(Pracownik_imie, Pracownik_nazwisko, Pracownik_data_urodzenia, Pracownik_pesel, Pracownik_nr_telefonu, Pracownik_mail, Pracownik_ulica, Pracownik_nr_domu, Pracownik_nr_mieszkania, Pracownik_miasto, Pracownik_kraj, Pracownik_wojewodztwo, Pracownik_kod_pocztowy, Pracownik_zarobki, Pracownik_status_zatrudnienia) VALUES ('Daria','Cep','2000-02-01','48070835764','123456780','dcep@firma.pl','Sztangowa',3,4,'Zakopane','Polska','Malopolskie','75-700',3000,false);
INSERT INTO PRACOWNIK(Pracownik_imie, Pracownik_nazwisko, Pracownik_data_urodzenia, Pracownik_pesel, Pracownik_nr_telefonu, Pracownik_mail, Pracownik_ulica, Pracownik_nr_domu, Pracownik_nr_mieszkania, Pracownik_miasto, Pracownik_kraj, Pracownik_wojewodztwo, Pracownik_kod_pocztowy, Pracownik_zarobki, Pracownik_status_zatrudnienia) VALUES ('Sebastian','Cos','2000-02-20','87051864379','525532712','scos@firma.pl','Pompkowa',2,8,'Krakow','Polska','Malopolskie','75-800',10000,true);



INSERT INTO HEADHUNTER (Id_dzial,Headhunter_imie,Headhunter_nazwisko,Headhunter_data_urodzenia,Headhunter_pesel,Headhunter_nr_telefonu,Headhunter_mail,Headhunter_ulica,Headhunter_nr_domu,Headhunter_nr_mieszkania,Headhunter_miasto,Headhinter_kraj,Headhunter_wojewodztwo,Headhunter_kod_pocztowy,Headhunter_zarobki,Headhunter_data_zatrudnienia,Headhunter_status_zatrudnienia) VALUES (1,'Jan','Kaptur','2000-12-11','33030633747','654355522','jkaptur@firma.pl','Jana Pawała II',5,2,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,'2022-11-13',true);
INSERT INTO HEADHUNTER (Id_dzial,Headhunter_imie,Headhunter_nazwisko,Headhunter_data_urodzenia,Headhunter_pesel,Headhunter_nr_telefonu,Headhunter_mail,Headhunter_ulica,Headhunter_nr_domu,Headhunter_nr_mieszkania,Headhunter_miasto,Headhinter_kraj,Headhunter_wojewodztwo,Headhunter_kod_pocztowy,Headhunter_zarobki,Headhunter_data_zatrudnienia,Headhunter_status_zatrudnienia) VALUES (2,'Sebastian','Poduszka','2000-01-12','49032633747','654355522','spoduszka@firma.pl','Świdrowa',5,7,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,'2022-10-11',true);
INSERT INTO HEADHUNTER (Id_dzial,Headhunter_imie,Headhunter_nazwisko,Headhunter_data_urodzenia,Headhunter_pesel,Headhunter_nr_telefonu,Headhunter_mail,Headhunter_ulica,Headhunter_nr_domu,Headhunter_nr_mieszkania,Headhunter_miasto,Headhinter_kraj,Headhunter_wojewodztwo,Headhunter_kod_pocztowy,Headhunter_zarobki,Headhunter_data_zatrudnienia,Headhunter_status_zatrudnienia) VALUES (3,'Ola','Lampa','2000-02-13','49034573747','654355522','olampa@firma.pl','Węgielna',3,3,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,'2022-11-21',true);
INSERT INTO HEADHUNTER (Id_dzial,Headhunter_imie,Headhunter_nazwisko,Headhunter_data_urodzenia,Headhunter_pesel,Headhunter_nr_telefonu,Headhunter_mail,Headhunter_ulica,Headhunter_nr_domu,Headhunter_nr_mieszkania,Headhunter_miasto,Headhinter_kraj,Headhunter_wojewodztwo,Headhunter_kod_pocztowy,Headhunter_zarobki,Headhunter_data_zatrudnienia,Headhunter_status_zatrudnienia) VALUES (4,'Pola','Poduszka','2000-10-14','22030633747','654355522','ppoduszka@firma.pl','Torfowa',5,4,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,'2022-02-03',true);
INSERT INTO HEADHUNTER (Id_dzial,Headhunter_imie,Headhunter_nazwisko,Headhunter_data_urodzenia,Headhunter_pesel,Headhunter_nr_telefonu,Headhunter_mail,Headhunter_ulica,Headhunter_nr_domu,Headhunter_nr_mieszkania,Headhunter_miasto,Headhinter_kraj,Headhunter_wojewodztwo,Headhunter_kod_pocztowy,Headhunter_zarobki,Headhunter_data_zatrudnienia,Headhunter_status_zatrudnienia) VALUES (5,'Marta','Ładowarka','2000-01-15','33030633888','654355522','mladowarka@firma.pl','Kopalniana',1,2,'Koszalin','Polska','Zachodniopomorskie','75-400',2000,'2022-10-10',true);


INSERT INTO STANOWISKO(Nazwa_stanowiska, Opis_stanowiska, Minimalne_zarobki, Maksymalne_zarobki) VALUES ('IT','Programista',1000,4000);
INSERT INTO STANOWISKO(Nazwa_stanowiska, Opis_stanowiska, Minimalne_zarobki, Maksymalne_zarobki) VALUES ('Kadry','Zarządzanie pracownikami',1000,4000);
INSERT INTO STANOWISKO(Nazwa_stanowiska, Opis_stanowiska, Minimalne_zarobki, Maksymalne_zarobki) VALUES ('Asystent','Obsługa',1000,4000);
INSERT INTO STANOWISKO(Nazwa_stanowiska, Opis_stanowiska, Minimalne_zarobki, Maksymalne_zarobki) VALUES ('Naczelnik','Tworznie grafików',1000,4000);
INSERT INTO STANOWISKO(Nazwa_stanowiska, Opis_stanowiska, Minimalne_zarobki, Maksymalne_zarobki) VALUES ('Magazynier','Obsługa zamówień',1000,4000);



INSERT INTO HISTORIA_PRACY (Id_stanowisko,Id_dzial,Id_pracownik,Rozpoczecie_pracy,Zakonczenie_pracy) VALUES(1,1,1,'2022-11-11','2024-11-12');
INSERT INTO HISTORIA_PRACY (Id_stanowisko,Id_dzial,Id_pracownik,Rozpoczecie_pracy,Zakonczenie_pracy) VALUES(2,2,2,'2022-11-12','2024-11-12');
INSERT INTO HISTORIA_PRACY (Id_stanowisko,Id_dzial,Id_pracownik,Rozpoczecie_pracy,Zakonczenie_pracy) VALUES(3,3,3,'2022-11-13','2024-11-12');
INSERT INTO HISTORIA_PRACY (Id_stanowisko,Id_dzial,Id_pracownik,Rozpoczecie_pracy,Zakonczenie_pracy) VALUES(4,4,4,'2022-11-14','2024-11-12');
INSERT INTO HISTORIA_PRACY (Id_stanowisko,Id_dzial,Id_pracownik,Rozpoczecie_pracy,Zakonczenie_pracy) VALUES(5,5,5,'2022-11-15','2024-11-12');



INSERT INTO OFERTA (Id_stanowisko,Tytul,Opis_oferty,Wymagania,Lokalizacja,Data_wystawienia_oferty) VALUES (1,'IT','Szukamy programisty','Umiejętność programowania w JAVA','Koszalin','2022-11-11');
INSERT INTO OFERTA (Id_stanowisko,Tytul,Opis_oferty,Wymagania,Lokalizacja,Data_wystawienia_oferty) VALUES (2,'Asystent','Szukamy asystenta','Umiejętność obsługi klienta','Koszalin','2022-11-12');
INSERT INTO OFERTA (Id_stanowisko,Tytul,Opis_oferty,Wymagania,Lokalizacja,Data_wystawienia_oferty) VALUES (3,'Kadry','Szukamy HRowca','Umiejętność prowadzenia rozmów rekrutacyjnych','Koszalin','2022-11-13');
INSERT INTO OFERTA (Id_stanowisko,Tytul,Opis_oferty,Wymagania,Lokalizacja,Data_wystawienia_oferty) VALUES (4,'Magazynier','Szukamy magazyniera','Umiejętność dźwigania dużych ciężarów','Koszalin','2022-11-14');
INSERT INTO OFERTA (Id_stanowisko,Tytul,Opis_oferty,Wymagania,Lokalizacja,Data_wystawienia_oferty) VALUES (5,'Tester','Szukamy Testera','Umiejętność testowania aplikacji internetowych','Koszalin','2022-11-15');


INSERT INTO PETENT(Petent_imie,Petent_nazwisko,Petent_data_urodzenia,Petent_pesel,Petent_nr_telefonu,Petent_mail,Petent_ulica,Petent_nr_domu,Petent_nr_mieszkania,Petent_miasto,Petent_kraj,Petent_wojewodztwo,Petent_kod_pocztowy) VALUES ('Marek','Kowalski','2000-11-11','61100979632','654326744','mkowalski@firma.pl','Hydrauliczna',2,3,'Koszalin','Polska','Zachodniopomorskie','75-400');
INSERT INTO PETENT(Petent_imie,Petent_nazwisko,Petent_data_urodzenia,Petent_pesel,Petent_nr_telefonu,Petent_mail,Petent_ulica,Petent_nr_domu,Petent_nr_mieszkania,Petent_miasto,Petent_kraj,Petent_wojewodztwo,Petent_kod_pocztowy) VALUES ('Jan','Kowalski','2000-11-12','60041558791','123456780','jkowalski@firma.pl','Hamulcowa',2,2,'Gdynia','Polska','Pomorskie','75-300');
INSERT INTO PETENT(Petent_imie,Petent_nazwisko,Petent_data_urodzenia,Petent_pesel,Petent_nr_telefonu,Petent_mail,Petent_ulica,Petent_nr_domu,Petent_nr_mieszkania,Petent_miasto,Petent_kraj,Petent_wojewodztwo,Petent_kod_pocztowy) VALUES ('Jan','Nowak','2000-11-13','90102527697','133453382','jnowak@firma.pl','Silnikowa',2,1,'Slupsk','Polska','Pomorskie','75-200');
INSERT INTO PETENT(Petent_imie,Petent_nazwisko,Petent_data_urodzenia,Petent_pesel,Petent_nr_telefonu,Petent_mail,Petent_ulica,Petent_nr_domu,Petent_nr_mieszkania,Petent_miasto,Petent_kraj,Petent_wojewodztwo,Petent_kod_pocztowy) VALUES ('Marek','Nowak','2000-11-14','78042163351','654355501','mnowak@firma.pl','Siedzeniowa',1,3,'Zakopane','Polska','Malopolskie','75-700');
INSERT INTO PETENT(Petent_imie,Petent_nazwisko,Petent_data_urodzenia,Petent_pesel,Petent_nr_telefonu,Petent_mail,Petent_ulica,Petent_nr_domu,Petent_nr_mieszkania,Petent_miasto,Petent_kraj,Petent_wojewodztwo,Petent_kod_pocztowy) VALUES ('Hubert','Dzban','2000-11-15','85072224556','987654321','hdzban@firma.pl','Kierownicowa',7,4,'Krakow','Polska','Malopolskie','75-800');


INSERT INTO PODANIE(Id_oferta, Id_petent, Kwalifikacje, CV, Data_zlozenia_podania) VALUES (1,1,'Wysokie','Tytul1','2022-11-11');
INSERT INTO PODANIE(Id_oferta, Id_petent, Kwalifikacje, CV, Data_zlozenia_podania) VALUES (2,2,'Wysokie','Tytul2','2022-11-12');


INSERT INTO REKRUTACJA(Id_petent, Id_headhunter, Id_oferta, Data_rozmowy_kwalifikacyjnej) VALUES (3,3,3,'2022-11-13');
INSERT INTO REKRUTACJA(Id_petent, Id_headhunter, Id_oferta, Data_rozmowy_kwalifikacyjnej) VALUES (4,4,4,'2022-11-14');
INSERT INTO REKRUTACJA(Id_petent, Id_headhunter, Id_oferta, Data_rozmowy_kwalifikacyjnej) VALUES (5,5,5,'2022-11-15');