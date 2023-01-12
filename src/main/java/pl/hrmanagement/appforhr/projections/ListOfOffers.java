package pl.hrmanagement.appforhr.projections;

import java.time.LocalDate;

public interface ListOfOffers {

    Integer getId();

    String getTitle();

    String getPosition();

    String getDesc();

    String getReq();

    String getLoc();

    LocalDate getDate();

}
