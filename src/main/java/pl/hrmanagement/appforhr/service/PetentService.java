package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.projections.ListApplicationForJob;
import pl.hrmanagement.appforhr.repository.PetentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetentService {

    private final PetentRepository petentRepository;

    public List<ListApplicationForJob> getApplicationForEachPosition() {

        return petentRepository.getApplicationForEachPosition();

    }

}
