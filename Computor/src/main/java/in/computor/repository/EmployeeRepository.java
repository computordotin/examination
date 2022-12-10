package in.computor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.computor.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
