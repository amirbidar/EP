package Attributes.Upload;

import lombok.Data;

@Data
public class File {
    public String path;
    public Boolean removable;
    public String label;
}
