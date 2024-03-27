package org.example.companyms.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void creatCompany(Company company);
    boolean deletedCompanyById(Long id);
    Company getCompanyById(Long id);
}
