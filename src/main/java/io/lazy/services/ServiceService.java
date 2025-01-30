package io.lazy.services;

import io.lazy.dto.ServiceDTO;
import io.lazy.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ServiceService {
    private final ServiceRepository serviceRepository;

    public List<ServiceDTO> getAllServices() {
        return ((List<io.lazy.model.Service>) serviceRepository.findAll())
                .stream()
                .map(ServiceDTO::toDTO)
                .collect(Collectors.toList());
    }

    public ServiceDTO getServiceById(Long id) {
        serviceRepository.findById(id);
        return ServiceDTO.toDTO(serviceRepository.findById(id));
    }
    public ServiceDTO createService(ServiceDTO serviceDTO) {
        return ServiceDTO.toDTO(serviceRepository.save(ServiceDTO.toEntity(serviceDTO)));
    }
    public ServiceDTO updateService(Long id, ServiceDTO serviceDTO) {
        serviceRepository.findById(id);
        return ServiceDTO.toDTO(serviceRepository.save(ServiceDTO.toEntity(serviceDTO)));
    }
    public void deleteServiceById(Long id) {
        serviceRepository.deleteById(id);
    }
    public void delete (ServiceDTO serviceDTO) {
        serviceRepository.delete(ServiceDTO.toEntity(serviceDTO));
    }
}
