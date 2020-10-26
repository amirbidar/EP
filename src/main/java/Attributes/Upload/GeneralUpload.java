package Attributes.Upload;

import Base.BaseGeneral;
import lombok.Data;
import Enum.*;
@Data
public class GeneralUpload extends BaseGeneral {
    private String label;
    private String readOnly;
    private Boolean manualSubmit;
    private EnumsDecleration.SourceUpload source;
    private EnumsDecleration.RepositoryTypeUpload respositoryType;
}
