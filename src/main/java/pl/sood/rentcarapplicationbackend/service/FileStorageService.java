package pl.sood.rentcarapplicationbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import pl.sood.rentcarapplicationbackend.model.File;
import pl.sood.rentcarapplicationbackend.repository.FileRepo;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

@Service
public class FileStorageService {
    private final FileRepo fileRepo;

    public FileStorageService(FileRepo fileRepo) {
        this.fileRepo = fileRepo;
    }

    public File store(MultipartFile file) throws IOException, IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        File File = new File(fileName, file.getContentType(), file.getBytes());

        return fileRepo.save(File);
    }

    public File getFile(String id) {
        return fileRepo.findById(id).get();
    }

    public Stream<File> getAllFiles() {
        return fileRepo.findAll().stream();
    }
}
