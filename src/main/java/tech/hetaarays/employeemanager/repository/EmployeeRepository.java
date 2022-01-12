package tech.hetaarays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.hetaarays.employeemanager.domain.Employee;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Transactional
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
