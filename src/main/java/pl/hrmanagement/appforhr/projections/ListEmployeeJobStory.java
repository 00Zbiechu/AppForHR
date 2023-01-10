package pl.hrmanagement.appforhr.projections;

import java.time.LocalDate;

public interface ListEmployeeJobStory {

    String getName();

    String getSurname();

    String getDepartment();

    String getPosition();

    LocalDate getStart();

    LocalDate getEnd();

}
