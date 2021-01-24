package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sood.rentcarapplicationbackend.model.File;

public interface FileRepo extends JpaRepository<File, Long> {
}
