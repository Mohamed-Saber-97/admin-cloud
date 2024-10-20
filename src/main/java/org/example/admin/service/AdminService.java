package org.example.admin.service;

import org.example.admin.model.Admin;
import org.example.admin.repository.AdminRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AdminService {
    private final RestTemplate restTemplate;
    private final AdminRepository adminRepository;

    public AdminService(RestTemplate restTemplate, AdminRepository adminRepository) {
        this.restTemplate = restTemplate;
        this.adminRepository = adminRepository;
    }

    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public String getCarsFrom8088() {
        return restTemplate.getForObject("http://localhost:8088/cars", String.class);
    }

    public String getCarsFrom8090() {
        return restTemplate.getForObject("http://localhost:8090", String.class);
    }
}
