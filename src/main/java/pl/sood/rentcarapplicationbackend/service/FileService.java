package pl.sood.rentcarapplicationbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import pl.sood.rentcarapplicationbackend.model.File;
import pl.sood.rentcarapplicationbackend.model.Rental;
import pl.sood.rentcarapplicationbackend.repository.FileRepo;
import pl.sood.rentcarapplicationbackend.repository.RentalRepo;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FileService {
    private final FileRepo fileRepo;
    private final RentalRepo rentalRepo;

    public FileService(FileRepo fileRepo, RentalRepo rentalRepo) {
        this.fileRepo = fileRepo;
        this.rentalRepo = rentalRepo;
    }

    public void store(MultipartFile multipartFile) throws IOException {
        String fileName = "Umowa_najmu_" + StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        Optional<Rental> rental = rentalRepo.findById(Integer.valueOf(multipartFile.getOriginalFilename()));
        File file = new File(fileName, multipartFile.getContentType(), multipartFile.getBytes());
        rental.ifPresent(file::setRental);
        fileRepo.save(file);
    }

    public Optional<File> getFile(Long id) {
        return fileRepo.findById(id);
    }

    public List<File> getFiles(int rentalId) {
        return fileRepo.findAllByRentalId(rentalId);
    }

    public List<File> getAllFiles() {
        return fileRepo.findAll();
    }

    public void delete(Long id) {
        fileRepo.deleteById(id);
    }
}
