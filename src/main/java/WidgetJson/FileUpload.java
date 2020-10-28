package WidgetJson;

import Attributes.Label.Listeners;
import Attributes.Upload.DataUpload;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileUpload {
    public String factory;
    public String metadata;
    @JsonProperty("maximum-file")
    public Integer maximumFile;
    public Listeners listeners;
    public DataUpload data;
    @JsonProperty("valid-extension")
    public String validExtension;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public Boolean manualSubmit;
    public String source;
    public String label;
    public Boolean enabled;
    @JsonProperty("file-manager")
    public String fileManager;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Boolean readonly;
    public String repositoryType;
    public String name;
    public String value;
    @JsonProperty("maximum-size")
    public Integer maximumSize;
    public EventAll events;
}
