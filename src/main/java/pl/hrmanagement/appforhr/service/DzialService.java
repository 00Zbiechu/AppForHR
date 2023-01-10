package pl.hrmanagement.appforhr.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.projections.ListOfDepartments;
import pl.hrmanagement.appforhr.repository.DzialRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DzialService {

    private final DzialRepository dzialRepository;

    public List<ListOfDepartments> getListOfDepartments(){

        return dzialRepository.getListOfDepartments();

    }


}

