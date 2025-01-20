package io.lazy.services;

import io.lazy.model.*;
import io.lazy.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceService {
    private final ServiceRepository serviceRepository;

    public List<io.lazy.model.Service> getAllServices() {
        return (List<io.lazy.model.Service>) serviceRepository.findAll();
    }
}
