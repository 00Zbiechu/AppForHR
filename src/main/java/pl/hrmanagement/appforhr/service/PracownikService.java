package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.projections.ListActiveEmployee;
import pl.hrmanagement.appforhr.repository.PracownikRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PracownikService {

    private final PracownikRepository pracownikRepository;


    public List<ListActiveEmployee> getListOfActiveEmployee() {

        return pracownikRepository.getListOfActiveEmployee();

    }

}
