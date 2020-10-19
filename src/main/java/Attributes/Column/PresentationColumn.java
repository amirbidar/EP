package Attributes.Column;

import lombok.Data;

import javax.xml.ws.soap.Addressing;

@Data
public class PresentationColumn {
    private String icon;
    private Integer width;
    private String visible;
    private String color;
    private String alignment;
}
