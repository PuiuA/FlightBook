package io.lazy.services;

import io.lazy.dto.ServiceDTO;
import io.lazy.mapper.ServiceMapper;
import io.lazy.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ServiceService {
    private final ServiceRepository serviceRepository;
    private final ServiceMapper serviceMapper;

    public List<ServiceDTO> getAllServices() {
        return ((List<io.lazy.model.Service>) serviceRepository.findAll())
                .stream()
                .map(serviceMapper::toDTO)
                .collect(Collectors.toList());
    }
}
