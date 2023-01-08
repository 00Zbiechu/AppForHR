package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.projections.ListActiveManagers;
import pl.hrmanagement.appforhr.repository.KierownikRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KierownikService {

    private final KierownikRepository kierownikRepository;


    public List<ListActiveManagers> getListOfActiveManagers() {

        return kierownikRepository.getListOfActiveManagers();

    }

}
