package Attributes.Upload;

import lombok.Data;

@Data
public class FileUpload {
    private String label;
    private String path;
    private boolean removable;
}
