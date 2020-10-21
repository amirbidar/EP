package Attributes.Upload;

import Base.BaseGeneral;
import lombok.Data;

@Data
public class GeneralUpload extends BaseGeneral {
    private String label;
    private String readOnly;
    private Boolean manualSubmit;
    private Enum.Enums.SourceUpload source;
    private Enum.Enums.RepositoryTypeUpload respositoryType;
}
