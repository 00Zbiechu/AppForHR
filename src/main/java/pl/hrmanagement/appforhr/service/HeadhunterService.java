package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.projections.ListActiveHeadhunter;
import pl.hrmanagement.appforhr.repository.HeadhunterRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeadhunterService {

    private final HeadhunterRepository headhunterRepository;


    public List<ListActiveHeadhunter> getListOfActiveHeadhunters() {

        return headhunterRepository.getListOfActiveHeadhunters();

    }

}
