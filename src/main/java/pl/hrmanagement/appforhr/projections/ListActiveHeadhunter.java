package pl.hrmanagement.appforhr.projections;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ListActiveHeadhunter {

    String getName();

    String getSurname();

    @Value("Headhunter")
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
