package Widgets;

import Attributes.Upload.DataUpload;
import Attributes.Upload.FileUpload;
import Attributes.Upload.GeneralUpload;
import Base.*;
import lombok.Data;

@Data
public class Upload {
    private GeneralUpload general;
    private BaseLayoutData layoutData;
    private BasePresentation presentation;
    private DataUpload data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private FileUpload File;
    private BaseValidation validation;

}
