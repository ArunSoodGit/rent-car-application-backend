package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.sood.rentcarapplicationbackend.model.File;
import pl.sood.rentcarapplicationbackend.service.FileService;


import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FileController {
    private final FileService storageService;

    @PostMapping("/files")
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        storageService.store(file);
    }

    @GetMapping("/files")
    public List<File> getFiles() throws IOException {
        return storageService.getAllFiles();
    }

    @GetMapping("/files/{fileId}")
    public ResponseEntity<ByteArrayResource> getFile(@PathVariable Long fileId) {

        File file = storageService.getFile(fileId).get();
        HttpHeaders headers = new HttpHeaders();

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline")
                .contentType(MediaType.APPLICATION_PDF)
                .body(new ByteArrayResource(file.getData()));
    }

    @GetMapping("/rentals/{rentalId}/files")
    public List<File> getFilesByRental(@PathVariable int rentalId) {
        return storageService.getFiles(rentalId);
    }

}
