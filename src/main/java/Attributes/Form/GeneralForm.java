package Attributes.Form;

import lombok.Data;

@Data
public class GeneralForm {
    private String xmlns;
    private String xmlnsxsd;
    private String name;
    private String label;
    private String title;
    private Integer version;
    private String visible;
    private String clientLanguage;
    private String description;
    private ResourcesForm resources;


}
