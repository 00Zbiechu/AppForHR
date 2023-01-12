package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.projections.ListEmployeeJobStory;
import pl.hrmanagement.appforhr.repository.HistoriaPracyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoriaPracyService {

    private final HistoriaPracyRepository historiaPracyRepository;


    public List<ListEmployeeJobStory> whenEmployeeStartAndEndJob(){

        return historiaPracyRepository.whenEmployeeStartAndEndJob();

    }

}
