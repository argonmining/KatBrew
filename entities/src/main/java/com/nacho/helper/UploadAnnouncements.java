package com.nacho.helper;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UploadAnnouncements {
    MultipartFile image;
    String title;
    String text;
    String link;
}
