package Widgets;

import Attributes.Frame.EventFrame;
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
    private EventFrame events;
    private FileUpload File;
    private BaseValidation validation;

}
