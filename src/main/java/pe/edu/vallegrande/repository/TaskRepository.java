package pe.edu.vallegrande.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
