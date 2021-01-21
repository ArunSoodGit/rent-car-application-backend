package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.sood.rentcarapplicationbackend.model.File;
import pl.sood.rentcarapplicationbackend.service.FileStorageService;

import java.io.IOException;
import java.util.stream.Stream;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FileController {
    private final FileStorageService storageService;

    @PostMapping("/files")
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
            storageService.store(file);
    }
    @GetMapping("/files")
    public Stream<File> getFiles() throws IOException {
        return storageService.getAllFiles();
    }
}
