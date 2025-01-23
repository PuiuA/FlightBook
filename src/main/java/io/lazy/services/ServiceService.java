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

    public ServiceDTO getServiceById(Long id) {
        serviceRepository.findById(id);
        return serviceMapper.toDTO(serviceRepository.findById(id));
    }
    public ServiceDTO createService(ServiceDTO serviceDTO) {
        return serviceMapper.toDTO(serviceRepository.save(serviceMapper.toEntity(serviceDTO)));
    }
    public ServiceDTO updateService(Long id, ServiceDTO serviceDTO) {
        serviceRepository.findById(id);
        return serviceMapper.toDTO(serviceRepository.save(serviceMapper.toEntity(serviceDTO)));
    }
    public void deleteServiceById(Long id) {
        serviceRepository.deleteById(id);
    }
    public void delete (ServiceDTO serviceDTO) {
        serviceRepository.delete(serviceMapper.toEntity(serviceDTO));
    }
}
