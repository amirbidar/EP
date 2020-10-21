package Attributes.Upload;

import lombok.Data;

@Data
public class DataUpload {
    private String dataValue;
    private String dataCondition;
    private String dataVariable;
    private String factory;
    private String fileManager;
    private Integer maxFiles;
    private Integer maxSize;
    private String value;
    private String extension;
    private String metadata;

}
