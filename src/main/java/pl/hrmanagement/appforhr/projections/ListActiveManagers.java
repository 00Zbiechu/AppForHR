package pl.hrmanagement.appforhr.projections;

import org.hibernate.annotations.Target;
import org.springframework.beans.factory.annotation.Value;
import pl.hrmanagement.appforhr.entity.Pracownik;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A Projection for the {@link Pracownik} entity
 */

public interface ListActiveManagers {

    String getName();

    String getSurname();

    @Value("Kierownik")
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