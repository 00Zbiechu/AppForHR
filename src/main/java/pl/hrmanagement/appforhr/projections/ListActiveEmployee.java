package pl.hrmanagement.appforhr.projections;

import pl.hrmanagement.appforhr.entity.Pracownik;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A Projection for the {@link pl.hrmanagement.appforhr.entity.Pracownik} entity
 */

public interface ListActiveEmployee {

    String getId();

    String getName();

    String getSurname();

    String getPosition();

    String getDepartment();

    BigDecimal getSalary();

    String getPhoneNumber();

    String getMail();

    LocalDate getBirthDate();

    String getIdNumber();

    String getStreet();

    String getCity();

    String getCountry();

    String getState();

    String getPostcode();



}